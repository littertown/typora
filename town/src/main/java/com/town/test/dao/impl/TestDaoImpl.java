package com.town.test.dao.impl;

import com.study.MyException.TownException;
import com.town.test.dao.TestDao;
import com.town.test.model.Test;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository(value = "test")
public class TestDaoImpl implements TestDao {

    @Resource
    private HibernateTemplate template;

    public void test(Test t) {

        System.out.println(template);
        template.save(t);
    }

    @Override
    public int getSum() {
        template.setCacheQueries(true);
        String hql = "select count(*) from test ";
        Long sumLong =  (Long)template.find(hql,new Object[]{}).listIterator().next();
        int sum = sumLong.intValue();
        return (Integer) sum;
    }

    @Override
    public void saveTowm() {
        Test test = new Test();
        test.setNum("test");
        template.save(test);
    }


}
