package com.town.region.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Proxy;



/**
 * 地区-POJO
 * @author cz
 * @since 2019-11-12
 */
@Entity
@Cache(region="region",usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "region", schema="town")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
@Proxy(lazy = false)
public class Region {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cd_id", length = 32, unique = true, nullable = false)
	private String cdId;//主键

	@Column(name = "regionId", length = 10, unique = false, nullable = false)
	private Integer regionid;//区域主键

	@Column(name = "name", length = 40, unique = false, nullable = true)
	private String name;//区域名称

	@Column(name = "pid", length = 10, unique = false, nullable = true)
	private Integer pid;//区域上级标识

	@Column(name = "sname", length = 40, unique = false, nullable = true)
	private String sname;//地名简称

	@Column(name = "level", length = 10, unique = false, nullable = true)
	private Integer level;//区域等级

	@Column(name = "citycode", length = 20, unique = false, nullable = true)
	private String citycode;//区域编码

	@Column(name = "yzcode", length = 20, unique = false, nullable = true)
	private String yzcode;//邮政编码

	@Column(name = "mername", length = 100, unique = false, nullable = true)
	private String mername;//组合名称

	@Column(name = "Lng", length = 12, unique = false, nullable = true)
	private Float lng;//

	@Column(name = "Lat", length = 12, unique = false, nullable = true)
	private Float lat;//

	@Column(name = "pinyin", length = 100, unique = false, nullable = true)
	private String pinyin;//
	
	public Region() {
		
	}
	
	/**
	 * 读取属性：主键
	 * @return
	 */
	public String getCdId() {
		return cdId;
	}
	
	/**
	 * 设置属性：主键
	 * @param cdId
	 */
	public void setCdId(String cdId) {
		this.cdId = cdId;
	}
	
	/**
	 * 读取属性：区域主键
	 * @return
	 */
	public Integer getRegionid() {
		return regionid;
	}
	
	/**
	 * 设置属性：区域主键
	 * @param regionid
	 */
	public void setRegionid(Integer regionid) {
		this.regionid = regionid;
	}
	
	/**
	 * 读取属性：区域名称
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 设置属性：区域名称
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 读取属性：区域上级标识
	 * @return
	 */
	public Integer getPid() {
		return pid;
	}
	
	/**
	 * 设置属性：区域上级标识
	 * @param pid
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	/**
	 * 读取属性：地名简称
	 * @return
	 */
	public String getSname() {
		return sname;
	}
	
	/**
	 * 设置属性：地名简称
	 * @param sname
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	/**
	 * 读取属性：区域等级
	 * @return
	 */
	public Integer getLevel() {
		return level;
	}
	
	/**
	 * 设置属性：区域等级
	 * @param level
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	/**
	 * 读取属性：区域编码
	 * @return
	 */
	public String getCitycode() {
		return citycode;
	}
	
	/**
	 * 设置属性：区域编码
	 * @param citycode
	 */
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	
	/**
	 * 读取属性：邮政编码
	 * @return
	 */
	public String getYzcode() {
		return yzcode;
	}
	
	/**
	 * 设置属性：邮政编码
	 * @param yzcode
	 */
	public void setYzcode(String yzcode) {
		this.yzcode = yzcode;
	}
	
	/**
	 * 读取属性：组合名称
	 * @return
	 */
	public String getMername() {
		return mername;
	}
	
	/**
	 * 设置属性：组合名称
	 * @param mername
	 */
	public void setMername(String mername) {
		this.mername = mername;
	}
	
	/**
	 * 读取属性：
	 * @return
	 */
	public Float getLng() {
		return lng;
	}
	
	/**
	 * 设置属性：
	 * @param lng
	 */
	public void setLng(Float lng) {
		this.lng = lng;
	}
	
	/**
	 * 读取属性：
	 * @return
	 */
	public Float getLat() {
		return lat;
	}
	
	/**
	 * 设置属性：
	 * @param lat
	 */
	public void setLat(Float lat) {
		this.lat = lat;
	}
	
	/**
	 * 读取属性：
	 * @return
	 */
	public String getPinyin() {
		return pinyin;
	}
	
	/**
	 * 设置属性：
	 * @param pinyin
	 */
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}
	
}
