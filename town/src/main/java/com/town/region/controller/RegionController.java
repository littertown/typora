package com.town.region.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.town.region.model.Region;
import com.town.region.service.RegionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 地区-Controller
 * @author cz
 * @since 2019-11-12
 */
@Controller
@RequestMapping(value = "/region")
public class RegionController {
	@Resource
	private RegionService service;

	private HttpServletResponse response;

	@ModelAttribute
	public void excuteOne(HttpServletResponse response){

		this.response = response;
	}

	//行政区列表
	@RequestMapping(value="/getProvinceList.do")
	@ResponseBody
	public void getProvinceList(Integer regionCode) throws IOException{
		
		try {
			List<Region> msg = service.getProvinceList(regionCode);
			String json = JSONObject.toJSONString(msg);
			print(json);
		} catch (Exception e) {
			String json = "{\"success\":false,\"msg\":\"获取失败\"}";
			print(json);
			e.printStackTrace();
		}
	}

	//创建返回流-->写入json
	public  void print(String json) throws IOException {
		HttpServletResponse responses = this.getResponse();
		responses.setHeader("Cache-Control", "no-store,no-cache,must-revalidate");
		responses.setHeader("Pragma", "no-cache");
		responses.setContentType("text/html");
		responses.setCharacterEncoding("utf-8");
		responses.getWriter().print(json);
		responses.getWriter().close();
	}

	//得到response
	public HttpServletResponse getResponse(){
			return response;
	}
}
