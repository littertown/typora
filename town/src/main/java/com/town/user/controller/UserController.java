package com.town.user.controller;

import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.fastjson.JSON;
import com.town.base.controller.BaseController;
import com.town.tool.ExcelUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @RequestMapping(value = "/testExcel.do")
    @ResponseBody
    public void testExcel(MultipartFile file) throws IOException {

        try {
            String path = file.getOriginalFilename();
            path = "f:\\"+path;
            ExcelUtil excelUtil = ExcelUtil.setExcelUtil(path, new com.town.user.model.User());
            ExcelReaderBuilder builder = excelUtil.getBuilder();
            builder.headRowNumber(2);
            List list = excelUtil.getExcelList();
            String json = JSON.toJSONString(list);
            this.print(json);
        } catch (Exception e) {
            String json = "{\"success\":fasle,\"msg\":\""+e.getLocalizedMessage()+"\"}";
            this.print(json);
            e.printStackTrace();
        }
    }
}
