package com.town.jgjgsxpublishdirectory.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.town.jgjgsxpublishdirectory.dao.JgJgsxPublishDirectoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


/**
 * -DAO实现
 * @author 
 * @since 2019-09-05
 */
@Repository
public class JgJgsxPublishDirectoryDaoImpl  implements JgJgsxPublishDirectoryDao {

    @Autowired
    private HibernateTemplate template;
    @Override
    public List getDirectAndSundetail() {

        template.setCacheQueries(true);
        return null;
    }
}
