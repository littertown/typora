package com.town.jgjgsximplementpublish.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.town.jgjgsximplementpublish.service.JgJgsxImplementPublishService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * -Controller
 * @author 
 * @since 2019-09-05
 */
@Controller
@RequestMapping(value = "/publish")
public class JgJgsxImplementPublishController {
	@Resource
	private JgJgsxImplementPublishService service;

	private HttpServletResponse response;

	@ModelAttribute
	public void excuteOne(HttpServletResponse response){

		this.response = response;
	}

	@RequestMapping("/getSum.do")
	@ResponseBody
	public void getSum() throws IOException {

		try {
			int num = service.getSum();
			String json = "{\"success\":success,\"msg\":\""+num+"\"}";
			this.print(json);
		} catch (IOException e) {
			String json = "{\"success\":false,\"msg\":\"获取失败\"}";
			print(json);
			e.printStackTrace();
		}

	}

	@RequestMapping("/getUnionSum.do")
	@ResponseBody
	public void getUnionSum() throws IOException {

		try {
			int num = service.getUnionSum();
			String json = "{\"success\":success,\"msg\":\""+num+"\"}";
			this.print(json);
		} catch (IOException e) {
			String json = "{\"success\":false,\"msg\":\"获取失败\"}";
			print(json);
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/getList.do")
	@ResponseBody
	public void getList() throws IOException {

		try {
			List list = service.getPublishList();
			String json = JSON.toJSONString(list);
			this.print(json);
		} catch (IOException e) {
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
