package com.town.tool;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

import java.util.ArrayList;
import java.util.List;

public class ExcelListener extends AnalysisEventListener {

    public static final int MAX_TO_SAVE = 1000;
    List data = new ArrayList();

    public ExcelListener(){}

    public ExcelListener(Object obj){}
    @Override
    public void invoke(Object o, AnalysisContext analysisContext) {
        if (o != null)
            data.add(o);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List getData() {
        return data;
    }
}
