package com.town.region.dao;

import com.town.region.model.Region;

import java.util.List;


/**
 * 地区-DAO接口
 * @author cz
 * @since 2019-11-12
 */
public interface RegionDao {
	
	/**
	 * 中国--->34省 省--->市，区  市，区--->县
	 * @param regionCode  	地区的编码
	 * @return 				这个地区下一级的地区列表
	 */
	public List<Region> getProvinceList(Integer regionCode);

	public List getTest(Integer regionCode);
}
