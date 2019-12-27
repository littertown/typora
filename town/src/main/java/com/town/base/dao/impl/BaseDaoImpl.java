package com.town.base.dao.impl;

import com.town.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository(value = "basedao")
public class BaseDaoImpl<T> implements BaseDao<T> {

    @Autowired
    private HibernateTemplate template;

    public boolean isCache(){
        return true;
    }
}
