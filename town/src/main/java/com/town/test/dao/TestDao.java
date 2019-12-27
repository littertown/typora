package com.town.test.dao;

import com.town.test.model.Test;

public interface TestDao {

    /**
     * 测试方法（验证ssh框架是否搭建成功）
     */
    public void test(Test t);

    int getSum();

    void saveTowm();
}
