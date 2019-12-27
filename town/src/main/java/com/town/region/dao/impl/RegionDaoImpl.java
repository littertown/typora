package com.town.region.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.town.region.dao.RegionDao;
import com.town.region.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;




/**
 * 地区-DAO实现
 * @author cz
 * @since 2019-11-12
 */
@Repository
public class RegionDaoImpl implements RegionDao {

	@Autowired
	private HibernateTemplate template;
	@Override
	public List<Region> getProvinceList(Integer regionCode) {

		template.setCacheQueries(true);
		List args = new ArrayList();
		args.add(regionCode);
		List regions= template.find("from com.town.region.model.Region r where r.pid=?", args.toArray());
		return regions;
	}

	@Override
	public List getTest(Integer regionCode) {

		List<Region> regions = (List<Region>) template.find("from com.town.region.model.Region r where r.pid=?", regionCode);
		return null;
	}

}
