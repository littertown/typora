package com.town.test.controller;

import com.town.test.model.Test;
import com.town.test.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value = "/testcontrol")
public class TestControl {

    @Resource
    private TestService testService;
    private HttpServletResponse response;

    @ModelAttribute
    public void excuteOne(HttpServletResponse response){

        this.response = response;
    }

    @RequestMapping(value = "/save.do")
    @ResponseBody
    public void saveTest(Test t){
        try {
            testService.saveTest();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/getSum")
    @ResponseBody
    public void getSum() throws IOException {

        try {
            int num = testService.getSum();
            this.print("{\"success\":\"true\",\"msg\":\""+num+"\"}");
        } catch (IOException e) {
            this.print("{\"success\":\"true\",\"msg\":\"错误\"}");
            e.printStackTrace();
        }

    }


    /**
     * 测试热部署是否成功
     * @param
     */
    @RequestMapping(value = "/test.do")
    @ResponseBody
    public void test(){

        System.out.println("热部署设置成功");
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
