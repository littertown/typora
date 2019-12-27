package com.town.tool;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XMLReader {
	
	/*
	 * 认领
	 * @author cz
	 */
	public String addElementForJson(Reader reader){
		
		   // 1. 创建一个 saxReader 对象
	       SAXReader saxReader = new SAXReader();
	       // 2. 将数据读取到 document 对象中
	       Document document = null;
	       try {
			document = saxReader.read(reader);
			Element root = document.getRootElement();
			Iterator<Element> rootIterator = root.elementIterator();
			//循环根节点
			while(rootIterator.hasNext()){
				Element superviseData = rootIterator.next();
				//taskInfo循环
				if("taskInfo".equals(superviseData.getName())){
					Iterator<Element> taskInfoIterator = superviseData.elementIterator();
					//循环taskinfo
					boolean objFlag = true;
					while(taskInfoIterator.hasNext()){
						Element taskinfo = taskInfoIterator.next();
						if("superviseObjects".equals(taskinfo.getName())){
							Iterator<Element> objsIterator = taskinfo.elementIterator();
							while(objsIterator.hasNext()){
								Element objs = objsIterator.next();
								if("superviseObject".equals(objs.getName())){
									Iterator<Element> objIterator = objs.elementIterator();
									while(objIterator.hasNext()){
										Element basis = objIterator.next();
										if("basisData".equals(basis.getName())){
											Iterator<Element> basisIterator = basis.elementIterator();
											boolean creditFlag = true;
											boolean oaFlag = true;
											boolean illeaglFlag = true;
											boolean complainFlag = true;
											boolean tipFlag = true;
											boolean riskFlag = true;
											while(basisIterator.hasNext()){
												Element baseInfo = basisIterator.next();
												////
												if("creditAssess".equals(baseInfo.getName())){
													if(creditFlag)
													basis.addElement("creditAssess");
													creditFlag = false;
												}
												if("operatingAbnormal".equals(baseInfo.getName())){
													if(oaFlag)
													basis.addElement("operatingAbnormal");
													oaFlag = false;
												}
												if("seriousIllegal".equals(baseInfo.getName())){
													if(illeaglFlag)
													basis.addElement("seriousIllegal");
													illeaglFlag = false;
												}
												if("complaintInfo".equals(baseInfo.getName())){
													if(complainFlag)
													basis.addElement("complaintInfo");
													complainFlag = false;
												}
												if("tipInfo".equals(baseInfo.getName())){
													if(tipFlag)
													basis.addElement("tipInfo");
													tipFlag = false;
												}
												if("riskWarning".equals(baseInfo.getName())){
													if(riskFlag)
													basis.addElement("riskWarning");
													riskFlag = false;
												}
											}
										}
									}
									
									if(objFlag)
										taskinfo.addElement("superviseObject");
									objFlag = false;
								}
							}
						}
					}
				}
				//循环supervisionProcess
				if("supervisionProcess".equals(superviseData.getName())){
					Iterator<Element> processIterator = superviseData.elementIterator();
					Element sign = null;
					while(processIterator.hasNext()){
						Element feedbackInfo = processIterator.next();
						if("feedbackUnitInfo".equals(feedbackInfo.getName())){
							Iterator<Element> feedbackIterator = feedbackInfo.elementIterator();
							while(feedbackIterator.hasNext()){
								Element action = feedbackIterator.next();
								boolean checkFlag = true;
								boolean punishFlag = true;
								boolean forceFlag = true;
								boolean otherFlag = true;
								if("admInspection".equals(action.getName())){
									if(checkFlag)
									feedbackInfo.addElement("admInspection");
									checkFlag = false;
								}
								if("admPunishment".equals(action.getName())){
									if(punishFlag)
									feedbackInfo.addElement("admPunishment");
									punishFlag = false;
								}
								if("admForce".equals(action.getName())){
									if(forceFlag)
									feedbackInfo.addElement("admForce");
									forceFlag = false;
								}
								if("other".equals(action.getName())){
									if(otherFlag)
									feedbackInfo.addElement("other");
									otherFlag = false;
								}
							}
						}
						
						sign = feedbackInfo;
						boolean detailsFlag = true;
						if("taskDetails".equals(feedbackInfo.getName())){
							Iterator<Element> detailsIterator = feedbackInfo.elementIterator();
							//新的节点
							Element newDetails = superviseData.addElement("taskDetails");
							int num = 0;
							while(detailsIterator.hasNext()){
								Element details = detailsIterator.next();
								if("taskNo".equals(details.getName()))
									num++;
								if(num == 1){
									newDetails.add((Element)details.clone());
								}
								if(num == 2){
									num = 1;
									newDetails = superviseData.addElement("taskDetails");
									newDetails.add((Element)details.clone());
								}
								
							}
							
							if(detailsFlag){
								superviseData.addElement("taskDetails");
								//superviseData.
							}
							superviseData.remove(sign);	
						}
					}
					
				}
			}
			OutputFormat outputFormat=OutputFormat.createPrettyPrint();
			//完整标签
			outputFormat.setExpandEmptyElements(true); 
			outputFormat.setEncoding("UTF-8");
			
			//测试生成xml文件
//			XMLWriter xmlWriter =new XMLWriter(new FileWriter("f:/NEW.xml"),outputFormat);
//			xmlWriter.write(document);
//			xmlWriter.close();
			
			String xmlString = document.asXML();
			return xmlString;
			//测试生成xml文件
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @throws IOException 
	 * @throws DocumentException 
	 * @throws TransformerException 
	 * 
	 */
	public void test(Reader reader) throws IOException, DocumentException, TransformerException{
		   // 1. 创建一个 saxReader 对象
	       SAXReader saxReader = new SAXReader();
	       // 2. 将数据读取到 document 对象中
	       Document document = null;
	       
	       Map<String, Object> map = new HashMap<String, Object>();
	       
	       document = saxReader.read(reader);
	       
	       Element root = document.getRootElement();
	       
	       Iterator<Element> rootTerator= root.elementIterator();
	       while(rootTerator.hasNext()){
	    	   boolean flag = true;
	    	   boolean state = false;
	    	   Element supervisionProcess = rootTerator.next();
	    	   if("supervisionProcess".equals(supervisionProcess.getName())){
	    		   Iterator<Element>  detailsIterator = supervisionProcess.elementIterator();
	    		   
	    		   Element result = null;
	    		   while(detailsIterator.hasNext()){
	    			   Element taskDetails = detailsIterator.next();
	    			  
	    			   if("taskDetails".equals(taskDetails.getName())){
  			    		 Iterator<Element>  taskIterator = taskDetails.elementIterator();
  			    		 if(flag){
	    				   result = taskDetails;
	    				   flag = false;
  			    		 }
  			    		 if(state){
	  			    		 while(taskIterator.hasNext()){
	  			    			Element args = taskIterator.next();
	  			    			//taskDetails.add(args);
	  			    			//Element e = taskDetails.addElement(args.getName());
	  			    			//e.setText(args.getStringValue());
	  			    			result.add((Element)args.clone());
	  			    		 }
	  			    		boolean a = supervisionProcess.remove(taskDetails);
	  			    		System.out.println(a);
  			    		 }
  			    		 state = true;
	    			   }
	    			   }
	    		 
	    		   }
	    		   
	    		   		
	       }
	       //document = saxReader.read(new ByteArrayInputStream(str.getBytes("UTF-8")));
	       OutputFormat format = OutputFormat.createPrettyPrint();
	       XMLWriter writer = new XMLWriter(new FileWriter(new File("f:/userOk.xml")),format);
	       writer.write(document);
	       writer.close();
	       
	}
	
	/**
	 * 解析接收xml
	 * @author cz
	 * @throws DocumentException 
	 * @throws UnsupportedEncodingException 
	 */
	public static Map<String, Object> myReadStringXmlOut(Reader reader) {
		
	   // 1. 创建一个 saxReader 对象
       SAXReader saxReader = new SAXReader();
       // 2. 将数据读取到 document 对象中
       Document document = null;
       
       Map<String, Object> map = new HashMap<String, Object>();

       //List<Map<String, Object>> superviseObjects = new ArrayList<Map<String, Object>>();
       
       try {
		//document = saxReader.read(new ByteArrayInputStream(xml.getBytes("UTF-8")));
		document = saxReader.read(reader);
		   // 3. 使用 document 对象调用 getRootElement 方法获取根标签, 返回 Element 接口实现类对象
		   Element rootElement = document.getRootElement();
		   Iterator<Element> iterator = rootElement.elementIterator();
		   
		   while(iterator.hasNext()){
			   
			   Element element =  iterator.next();
			   if("taskInfo".equals(element.getName())){
				Iterator<Element> iterator1 = element.elementIterator();
				List<Map<String, Object>> taskInfo = new ArrayList<Map<String, Object>>();
				Map<String,Object> taskinfomap =  new HashMap<String, Object>();
				 while(iterator1.hasNext()){
					
					Element element1 = iterator1.next();
					if(!("superviseObjects".equals(element1.getName())))
					taskinfomap.put(element1.getName(), element1.getStringValue());
					List<Map<String, Object>> superviseObjects = new ArrayList<Map<String, Object>>();
					
					if("superviseObjects".equals(element1.getName())){
						Iterator<Element> iterator2 = element1.elementIterator();
						//List<Map<String, Object>> superviseObjects = new ArrayList<Map<String, Object>>();
						Map<String,Object> objmap =  new HashMap<String, Object>();
						 while(iterator2.hasNext()){
							
							Element element2 = iterator2.next();
							List<Element> elements = element2.elements();
		                    Map<String, Object> listMap = new HashMap<String, Object>();
		                        	
		                    for (Element elementList : elements) {
		                    	if(!("basisData".equals(elementList.getName())))
		                        listMap.put(elementList.getName(), elementList.getText());
		                        Iterator<Element> iterator3 = elementList.elementIterator();
		                        if("basisData".equals(elementList.getName())){
		                        	
		                        	while(iterator3.hasNext()){
		                        		Element element3 =iterator3.next();
		                        		
		          						if("creditAssess".equals(element3.getName())){
		          							Iterator<Element> iterator4 = element3.elementIterator();
		          							Map<String,Object> map1 =  new HashMap<String, Object>();
		          							List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		          							while(iterator4.hasNext()){
		          								Element element4 = iterator4.next();
		          								//Map<String,Object> mapadmInspection =  new HashMap<String, Object>();
		          								map1.put(element4.getName(),element4.getStringValue());
		          							}
		          							list1.add(map1);
		          							map.put("creditAssess", list1);
		          						}
		          						
		          						if("operatingAbnormal".equals(element3.getName())){
		          							Iterator<Element> iterator4 = element3.elementIterator();
		          							Map<String,Object> map1 =  new HashMap<String, Object>();
		          							List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		          							while(iterator4.hasNext()){
		          								Element element4 = iterator4.next();
		          								//Map<String,Object> mapadmInspection =  new HashMap<String, Object>();
		          								map1.put(element4.getName(),element4.getStringValue());
		          							}
		          							list1.add(map1);
		          							map.put("operatingAbnormal", list1);
		          						}
		          						
		          						if("seriousIllegal".equals(element3.getName())){
		          							Iterator<Element> iterator4 = element3.elementIterator();
		          							Map<String,Object> map1 =  new HashMap<String, Object>();
		          							List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		          							while(iterator4.hasNext()){
		          								Element element4 = iterator4.next();
		          								//Map<String,Object> mapadmInspection =  new HashMap<String, Object>();
		          								map1.put(element4.getName(),element4.getStringValue());
		          							}
		          							list1.add(map1);
		          							map.put("seriousIllegal", list1);
		          						}
		          						
		          						if("complaintInfo".equals(element3.getName())){
		          							Iterator<Element> iterator4 = element3.elementIterator();
		          							Map<String,Object> map1 =  new HashMap<String, Object>();
		          							List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		          							while(iterator4.hasNext()){
		          								Element element4 = iterator4.next();
		          								//Map<String,Object> mapadmInspection =  new HashMap<String, Object>();
		          								map1.put(element4.getName(),element4.getStringValue());
		          							}
		          							list1.add(map1);
		          							map.put("complaintInfo", list1);
		          						}
		          						
		          						if("tipInfo".equals(element3.getName())){
		          							Iterator<Element> iterator4 = element3.elementIterator();
		          							Map<String,Object> map1 =  new HashMap<String, Object>();
		          							List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		          							while(iterator4.hasNext()){
		          								Element element4 = iterator4.next();
		          								//Map<String,Object> mapadmInspection =  new HashMap<String, Object>();
		          								map1.put(element4.getName(),element4.getStringValue());
		          							}
		          							list1.add(map1);
		          							map.put("tipInfo", list1);
		          						}
		          						
		          						if("riskWarning".equals(element3.getName())){
		          							Iterator<Element> iterator4 = element3.elementIterator();
		          							Map<String,Object> map1 =  new HashMap<String, Object>();
		          							List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		          							while(iterator4.hasNext()){
		          								Element element4 = iterator4.next();
		          								//Map<String,Object> mapadmInspection =  new HashMap<String, Object>();
		          								map1.put(element4.getName(),element4.getStringValue());
		          							}
		          							list1.add(map1);
		          							map.put("riskWarning", list1);
		          						}
		                        	}
		                        }
		                    }
		                    superviseObjects.add(listMap);
						 }
						 map.put("superviseObjects", superviseObjects);
					}
					
				 }
				taskInfo.add(taskinfomap);
				map.put("taskInfo", taskInfo);
			   }
			   
			   //root下的supervisionProcess
		       if("supervisionProcess".equals(element.getName())){
		    	    Iterator<Element> iterator1 = element.elementIterator();
		  			List<Map<String, Object>> taskDetails = new ArrayList<Map<String, Object>>();
		  			Map<String,Object> mapDetails =  new HashMap<String, Object>();
		  			
		  			while(iterator1.hasNext()){
		  				Element element2 = iterator1.next();
		  				
		  				if("taskDetails".equals(element2.getName())){
		  					Iterator<Element> iterator2 = element2.elementIterator();
		  					
		  					while(iterator2.hasNext()){
		  						Element element3 = iterator2.next();
		  						mapDetails.put(element3.getName(), element3.getStringValue());
		  						if("feedbackSuggestion".equals(element3.getName())){
		  							taskDetails.add(mapDetails);
		  							mapDetails = new HashMap<String, Object>();
		  						}
		  					}
		  				}
		  				
		  				if("feedbackUnitInfo".equals(element2.getName())){
		  					Iterator<Element> iterator2 = element2.elementIterator();
		  					
		  					while(iterator2.hasNext()){
		  						Element element3 = iterator2.next();
		  						
		  						if("admInspection".equals(element3.getName())){
		  							Iterator<Element> iterator3 = element3.elementIterator();
		  							Map<String,Object> map1 =  new HashMap<String, Object>();
		  							List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		  							while(iterator3.hasNext()){
		  								Element element4 = iterator3.next();
		  								//Map<String,Object> mapadmInspection =  new HashMap<String, Object>();
		  								map1.put(element4.getName(),element4.getStringValue());
		  							}
		  							list1.add(map1);
		  							map.put("admInspection", list1);
		  						}
		  						
		  						if("admPunishment".equals(element3.getName())){
		  							Iterator<Element> iterator3 = element3.elementIterator();
		  							Map<String,Object> map1 =  new HashMap<String, Object>();
		  							List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		  							while(iterator3.hasNext()){
		  								Element element4 = iterator3.next();
		  								//Map<String,Object> mapadmInspection =  new HashMap<String, Object>();
		  								map1.put(element4.getName(),element4.getStringValue());
		  							}
		  							list1.add(map1);
		  							map.put("admPunishment", list1);
		  						}
		  						
		  						if("admForce".equals(element3.getName())){
		  							Iterator<Element> iterator3 = element3.elementIterator();
		  							Map<String,Object> map1 =  new HashMap<String, Object>();
		  							List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		  							while(iterator3.hasNext()){
		  								Element element4 = iterator3.next();
		  								//Map<String,Object> mapadmInspection =  new HashMap<String, Object>();
		  								map1.put(element4.getName(),element4.getStringValue());
		  							}
		  							list1.add(map1);
		  							map.put("admForce", list1);
		  						}
		  						
		  						if("other".equals(element3.getName())){
		  							Iterator<Element> iterator3 = element3.elementIterator();
		  							Map<String,Object> map1 =  new HashMap<String, Object>();
		  							List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		  							while(iterator3.hasNext()){
		  								Element element4 = iterator3.next();
		  								//Map<String,Object> mapadmInspection =  new HashMap<String, Object>();
		  								map1.put(element4.getName(),element4.getStringValue());
		  							}
		  							list1.add(map1);
		  							map.put("other", list1);
		  						}
		  					}
		  				}
		  				//mapDetails.put(, value);
		  			}
		  			//taskDetails.add(mapDetails);
		  			map.put("taskDetails", taskDetails);
		       }
		   }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	   return map;
		
	}
}
