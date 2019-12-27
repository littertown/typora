package com.town.tool;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;

public class WriteExcelUtil {

    private ExcelWriterBuilder builder;

    public WriteExcelUtil(String url,Object obj){
        this.builder = EasyExcel.write(url,obj.getClass());
    }

    public ExcelWriterBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(ExcelWriterBuilder builder) {
        this.builder = builder;
    }
}
