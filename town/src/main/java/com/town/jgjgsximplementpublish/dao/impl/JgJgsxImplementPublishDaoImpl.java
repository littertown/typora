package com.town.jgjgsximplementpublish.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.town.jgjgsximplementpublish.dao.JgJgsxImplementPublishDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


//import com.mysql.fabric.xmlrpc.base.Params;

/**
 * -DAO实现
 * @author 
 * @since 2019-09-05
 */
@Repository
public class JgJgsxImplementPublishDaoImpl implements JgJgsxImplementPublishDao {


    @Resource
    private HibernateTemplate template;
    @Override
    public int getSum() {
        template.setCacheQueries(true);
        Long sumLong =  (Long)template.find("select count(*) from JgJgsxImplementPublish",new Object[]{}).listIterator().next();
        int sum = sumLong.intValue();
        return (Integer) sum;
    }

    @Override
    public int getUnionNum() {
        template.setCacheQueries(true);
        String hql = "select count(*) from JgJgsxImplementPublish c,JgJgsxPublishSunDetail b where b.subitemCode =c.detailCode ";
        Long sumLong =  (Long)template.find(hql,new Object[]{}).listIterator().next();
        int sum = sumLong.intValue();
        return (Integer) sum;
    }

    @Override
    public List getPublishList() {
        List list = new ArrayList();
        template.setCacheQueries(true);
        Session session = template.getSessionFactory().getCurrentSession();
        String sql = "from JgJgsxImplementPublish";
        Query query = session.createQuery(sql);
        Iterator iterate = query.iterate();
        while (iterate.hasNext()){
            list.add(iterate.next());
        }
        return list;
    }


}
