package com.town.jgjgsxpublishdirectory.model;

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
//import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;


/**
 * -POJO
 * @author
 * @since 2019-09-05
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "jg_jgsx_publish_directory", schema="town")
//@DynamicUpdate(true)
@org.hibernate.annotations.Entity(dynamicUpdate=true)
@Proxy(lazy = false)
public class JgJgsxPublishDirectory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cd_id", length = 100, unique = true, nullable = false)
	private String cdId;//主键


	@Column(name = "manage_id", length = 32, unique = false, nullable = false)
	private String manageId;//本记录的唯一标识(原系统主键ID)


	@Column(name = "matter_name", length = 500, unique = false, nullable = false)
	private String matterName;//监管目录事项名称


	@Column(name = "matter_code", length = 50, unique = false, nullable = false)
	private String matterCode;//事项编码


	@Column(name = "parent_code", length = 32, unique = false, nullable = false)
	private String parentCode;//父级事项CODE


	@Column(name = "department_id", length = 32, unique = false, nullable = false)
	private String departmentId;//监管部门Id


	@Column(name = "department_name", length = 150, unique = false, nullable = false)
	private String departmentName;//监管部门名称


	@Column(name = "permit_type", length = 10, unique = false, nullable = false)
	private Integer permitType;//对应的许可事项类型 : 0 第一类 1 第二类 2 第三类 3 其他


	@Column(name = "is_stop", length = 10, unique = false, nullable = false)
	private Integer isStop;//操作状态 0:再用  1 取消 2 停用


	@Column(name = "create_user_id", length = 32, unique = false, nullable = false)
	private String createUserId;//创建人id


	@Column(name = "create_user", length = 50, unique = false, nullable = false)
	private String createUser;//创建人姓名


	@Column(name = "create_department_id", length = 32, unique = false, nullable = false)
	private String createDepartmentId;//创建人部门id


	@Column(name = "create_dep_name", length = 150, unique = false, nullable = false)
	private String createDepName;//创建人部门


	@Column(name = "version_id", length = 14, unique = false, nullable = false)
	private String versionId;//版本ID


	@Column(name = "version_date", length = 19, unique = false, nullable = false)
	private Date versionDate;//版本日期


	@Column(name = "create_date", length = 19, unique = false, nullable = false)
	private Date createDate;//创建时间


	@Column(name = "_date", length = 19, unique = false, nullable = true)
	private Date updateDate;//修改时间


	@Column(name = "level", length = 20, unique = false, nullable = false)
	private String level;//区划代码


	@Column(name = "cd_time", length = 19, unique = false, nullable = false)
	private Date cdTime;//插入时间


	@Column(name = "cd_source", length = 50, unique = false, nullable = false)
	private String cdSource;//来源（省份区划代码|部门编码）


	@Column(name = "cd_batch", length = 50, unique = false, nullable = false)
	private String cdBatch;//批次号


	@Column(name = "cd_operation", length = 1, unique = false, nullable = false)
	private String cdOperation;//新增数据类型i-insert,u-,d-delete

	public JgJgsxPublishDirectory() {

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
	 * 读取属性：本记录的唯一标识(原系统主键ID)
	 * @return
	 */
	public String getManageId() {
		return manageId;
	}

	/**
	 * 设置属性：本记录的唯一标识(原系统主键ID)
	 * @param manageId
	 */
	public void setManageId(String manageId) {
		this.manageId = manageId;
	}

	/**
	 * 读取属性：监管目录事项名称
	 * @return
	 */
	public String getMatterName() {
		return matterName;
	}

	/**
	 * 设置属性：监管目录事项名称
	 * @param matterName
	 */
	public void setMatterName(String matterName) {
		this.matterName = matterName;
	}

	/**
	 * 读取属性：事项编码
	 * @return
	 */
	public String getMatterCode() {
		return matterCode;
	}

	/**
	 * 设置属性：事项编码
	 * @param matterCode
	 */
	public void setMatterCode(String matterCode) {
		this.matterCode = matterCode;
	}

	/**
	 * 读取属性：父级事项CODE
	 * @return
	 */
	public String getParentCode() {
		return parentCode;
	}

	/**
	 * 设置属性：父级事项CODE
	 * @param parentCode
	 */
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	/**
	 * 读取属性：监管部门Id
	 * @return
	 */
	public String getDepartmentId() {
		return departmentId;
	}

	/**
	 * 设置属性：监管部门Id
	 * @param departmentId
	 */
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * 读取属性：监管部门名称
	 * @return
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * 设置属性：监管部门名称
	 * @param departmentName
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * 读取属性：对应的许可事项类型 : 0 第一类 1 第二类 2 第三类 3 其他
	 * @return
	 */
	public Integer getPermitType() {
		return permitType;
	}

	/**
	 * 设置属性：对应的许可事项类型 : 0 第一类 1 第二类 2 第三类 3 其他
	 * @param permitType
	 */
	public void setPermitType(Integer permitType) {
		this.permitType = permitType;
	}

	/**
	 * 读取属性：操作状态 0:再用  1 取消 2 停用
	 * @return
	 */
	public Integer getIsStop() {
		return isStop;
	}

	/**
	 * 设置属性：操作状态 0:再用  1 取消 2 停用
	 * @param isStop
	 */
	public void setIsStop(Integer isStop) {
		this.isStop = isStop;
	}

	/**
	 * 读取属性：创建人id
	 * @return
	 */
	public String getCreateUserId() {
		return createUserId;
	}

	/**
	 * 设置属性：创建人id
	 * @param createUserId
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * 读取属性：创建人姓名
	 * @return
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * 设置属性：创建人姓名
	 * @param createUser
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * 读取属性：创建人部门id
	 * @return
	 */
	public String getCreateDepartmentId() {
		return createDepartmentId;
	}

	/**
	 * 设置属性：创建人部门id
	 * @param createDepartmentId
	 */
	public void setCreateDepartmentId(String createDepartmentId) {
		this.createDepartmentId = createDepartmentId;
	}

	/**
	 * 读取属性：创建人部门
	 * @return
	 */
	public String getCreateDepName() {
		return createDepName;
	}

	/**
	 * 设置属性：创建人部门
	 * @param createDepName
	 */
	public void setCreateDepName(String createDepName) {
		this.createDepName = createDepName;
	}

	/**
	 * 读取属性：版本ID
	 * @return
	 */
	public String getVersionId() {
		return versionId;
	}

	/**
	 * 设置属性：版本ID
	 * @param versionId
	 */
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	/**
	 * 读取属性：版本日期
	 * @return
	 */
	public Date getVersionDate() {
		return versionDate;
	}

	/**
	 * 设置属性：版本日期
	 * @param versionDate
	 */
	public void setVersionDate(Date versionDate) {
		this.versionDate = versionDate;
	}

	/**
	 * 读取属性：创建时间
	 * @return
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 设置属性：创建时间
	 * @param createDate
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 读取属性：修改时间
	 * @return
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * 设置属性：修改时间
	 * @param updateDate
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * 读取属性：区划代码
	 * @return
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * 设置属性：区划代码
	 * @param level
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * 读取属性：插入时间
	 * @return
	 */
	public Date getCdTime() {
		return cdTime;
	}

	/**
	 * 设置属性：插入时间
	 * @param cdTime
	 */
	public void setCdTime(Date cdTime) {
		this.cdTime = cdTime;
	}

	/**
	 * 读取属性：来源（省份区划代码|部门编码）
	 * @return
	 */
	public String getCdSource() {
		return cdSource;
	}

	/**
	 * 设置属性：来源（省份区划代码|部门编码）
	 * @param cdSource
	 */
	public void setCdSource(String cdSource) {
		this.cdSource = cdSource;
	}

	/**
	 * 读取属性：批次号
	 * @return
	 */
	public String getCdBatch() {
		return cdBatch;
	}

	/**
	 * 设置属性：批次号
	 * @param cdBatch
	 */
	public void setCdBatch(String cdBatch) {
		this.cdBatch = cdBatch;
	}

	/**
	 * 读取属性：新增数据类型i-insert,u-,d-delete
	 * @return
	 */
	public String getCdOperation() {
		return cdOperation;
	}

	/**
	 * 设置属性：新增数据类型i-insert,u-,d-delete
	 * @param cdOperation
	 */
	public void setCdOperation(String cdOperation) {
		this.cdOperation = cdOperation;
	}

}
