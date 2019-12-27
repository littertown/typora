package com.town.region.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.town.region.dao.RegionDao;
import com.town.region.model.Region;
import com.town.region.service.RegionService;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;


/**
 * 地区-Service实现
 * @author cz
 * @since 2019-11-12
 */
@Service
public class RegionServiceImpl implements RegionService {
	
	@Resource
	private RegionDao dao;

	public static int CHINACODE = 100000;

	@Override
	public List<Region> getProvinceList(Integer regionCode) {

		List list;
		if(regionCode == null)
			list =  dao.getProvinceList(CHINACODE);
		else
			list = dao.getProvinceList(regionCode);
		return list;
	}
	
	
}
