package com.town.region.service;

import java.util.List;

import com.town.region.model.Region;
import org.springframework.stereotype.Service;

/**
 * 地区-Service接口
 * @author cz
 * @since 2019-11-12
 */
public interface RegionService <Region, String> {
	
	/**
	 * @return list 35个行政区
	 */
	public List<Region> getProvinceList(Integer regionCode);
}
