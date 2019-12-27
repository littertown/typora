package com.town.tool;

public class PageInit<T> {

	public static final int DEF_COUNT = 2000;
	//页码
	int pageNo;
	//页数
	int pageSize;
	//总数
	int total;
	
	public PageInit(Integer pageNo,Integer pageSize,int total){
		this.pageNo = this.setPageNoInit(pageNo);
		this.pageSize = this.setPageSizeInit(pageSize);
		this.total = total;
	}
	
	public PageInit(String pageNo,String pageSize,int total){
		this.pageNo = this.setPageNoInit(pageNo);
		this.pageSize = this.setPageSizeInit(pageSize);
		this.total = total;
	}
	
	/**
	 * 处理pageNo
	 */
	public int setPageNo(int pageNo){
		 int a =pageNo>0 ? pageNo :1;
		 System.out.println(a);
		 return a;
	}
	/**
	 * 处理pageSize
	 */
	public int setPageSize(int pageSize){
		return pageSize >0 ? pageSize : 10;
	}
	
	public int setPageNo(String pageNo){
		pageNo = pageNo.trim();
		return isNum(pageNo) ? setPageNo(setPageNo(Integer.parseInt(pageNo))) :1;
	}
	
	public int setPageSize(String pageSize){
		pageSize = pageSize.trim();
		return isNum(pageSize) ? setPageSize(Integer.parseInt(pageSize)) : 10;
	}
	
	public boolean isNum(String str){
		return str.matches("[0-9]+");
	}
	
	public int getPageSzie(){
		return pageSize;
	}
	
	/**
	 * null处理
	 */
	public int setPageNoInit(String str){
		if(str==null)
			return 1;
		return this.setPageNo(str);
	}
	
	public int setPageSizeInit(String str){
		if(str==null)
			return 10;
		return setPageSize(str);
	}
	
	public int setPageNoInit(Integer num){
		if(num==null)
			return 1;
		return this.setPageNo(num);
	}
	
	public int setPageSizeInit(Integer num){
		if(num==null)
			return 10;
		return setPageSize(num);
	}
	
}
