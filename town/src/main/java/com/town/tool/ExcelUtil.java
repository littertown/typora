package com.town.tool;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.support.ExcelTypeEnum;


import java.util.List;

public class ExcelUtil {

    private  ExcelReaderBuilder builder;
    private  ExcelListener listener;

    private ExcelUtil(){}

    //读取excel文件
    public List getExcelList(){
        List list = null;
        if(builder != null && listener != null){
            builder.sheet().doRead();
            list = listener.getData();
        }
        return list;
    }

    //设置导出builder
    public static  ExcelUtil setExcelUtil(String url,Object obj){
        ExcelUtil excelUtil = new ExcelUtil();
        ExcelListener listener = new ExcelListener();
        ExcelReaderBuilder builder = EasyExcel.read(url, obj.getClass(), listener);
        excelUtil.setListener(listener);
        excelUtil.setBuilder(builder);
        builder.excelType(getExcelType(url));
        return excelUtil;
    }

    //判断 xls 和xlxs
    public static ExcelTypeEnum getExcelType(String url){
        String type = url.substring(url.indexOf("."));
        if(".xls".equals(type))
            return ExcelTypeEnum.XLS;
        if(".xlsx".equals(type))
            return ExcelTypeEnum.XLSX;
        else
            throw new RuntimeException("上传的excel后缀名不是XLS,XLSX.");
    }

    //中间过程需要添加特殊的操作（如从那行开始，格式等..）
    //需要调用builer的方法
    public  ExcelReaderBuilder getBuilder(){
        return builder;
    }

    public void setBuilder(ExcelReaderBuilder builder) {
        this.builder = builder;
    }

    public ExcelListener getListener() {
        return listener;
    }

    public void setListener(ExcelListener listener) {
        this.listener = listener;
    }
}
