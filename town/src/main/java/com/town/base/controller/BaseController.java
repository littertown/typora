package com.town.base.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BaseController {

    //定义HttpServletResponse
    private HttpServletResponse response;

    @ModelAttribute
    public void setResponse(HttpServletResponse response){

        this.response = response;
    }

    //得到response
    public HttpServletResponse getResponse(){
        return response;
    }

    public  void print(String json) throws IOException {
        HttpServletResponse responses = this.getResponse();
        responses.setHeader("Cache-Control", "no-store,no-cache,must-revalidate");
        responses.setHeader("Pragma", "no-cache");
        responses.setContentType("text/html");
        responses.setCharacterEncoding("utf-8");
        responses.getWriter().print(json);
        responses.getWriter().close();
    }
}
