package com.town.test.service.impl;

import com.town.test.dao.TestDao;
import com.town.test.model.Test;
import com.town.test.service.TestService;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "testService")
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testdao;

    public void test(Test t) {
        testdao.test(t);
    }

    @Override
    public void saveTest() {
        testdao.saveTowm();
    }

    @Override
    public int getSum() {
        return testdao.getSum();
    }
}
