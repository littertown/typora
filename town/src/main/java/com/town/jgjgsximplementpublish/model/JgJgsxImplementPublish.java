package com.town.jgjgsximplementpublish.model;

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
@Table(name = "jg_jgsx_implement_publish", schema="town")
//@DynamicUpdate(true)
@org.hibernate.annotations.Entity(dynamicUpdate=true)
@Proxy(lazy = false)
public class JgJgsxImplementPublish implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cd_id", length = 100, unique = true, nullable = false)
	private String cdId;//主键

	@Column(name = "implement_publish_id", length = 32, unique = false, nullable = false)
	private String implementPublishId;//本记录的唯一标识(原系统主键ID)

	@Column(name = "detail_code", length = 32, unique = false, nullable = false)
	private String detailCode;//检查子项code

	@Column(name = "inventory_code", length = 50, unique = false, nullable = false)
	private String inventoryCode;//实施清单编码

	@Column(name = "exercise_level", length = 50, unique = false, nullable = false)
	private String exerciseLevel;//行使层级

	@Column(name = "implement_body", length = 500, unique = false, nullable = false)
	private String implementBody;//实施主体

	@Column(name = "implement_body_code", length = 255, unique = false, nullable = false)
	private String implementBodyCode;//实施主体编码

	@Column(name = "implement_nature", length = 500, unique = false, nullable = false)
	private String implementNature;//实施主体性质

	@Column(name = "delegation_department", length = 500, unique = false, nullable = true)
	private String delegationDepartment;//委托部门
	

	@Column(name = "delegation_dep_code", length = 50, unique = false, nullable = true)
	private String delegationDepCode;//委托部门编码

	@Column(name = "supervision_object", length = 65535, unique = false, nullable = false)
	private String supervisionObject;//监管对象主项

	@Column(name = "supervision_object_sub", length = 65535, unique = false, nullable = true)
	private String supervisionObjectSub;//监管对象子项

	@Column(name = "examine_type", length = 10, unique = false, nullable = false)
	private Integer examineType;//检查类别 1:现场检查  2:非现场检查

	@Column(name = "examine_way", length = 500, unique = false, nullable = false)
	private String examineWay;//检查方式

	@Column(name = "is_random", length = 10, unique = false, nullable = false)
	private Integer isRandom;//是否纳入双随机 1:是 2:否

	@Column(name = "check_proportion", length = 500, unique = false, nullable = true)
	private String checkProportion;//检查比例

	@Column(name = "check_frequency", length = 500, unique = false, nullable = true)
	private String checkFrequency;//检查频次

	@Column(name = "check_content_day", length = 16777215, unique = false, nullable = true)
	private String checkContentDay;//检查内容（日常）

	@Column(name = "check_content_particularly", length = 16777215, unique = false, nullable = true)
	private String checkContentParticularly;//检查内容（专项）

	@Column(name = "is_check", length = 10, unique = false, nullable = false)
	private Integer isCheck;//是否抽检 1:是  2:否

	@Column(name = "supervision_content", length = 16777215, unique = false, nullable = true)
	private String supervisionContent;//监督抽检内容

	@Column(name = "is_synergy", length = 10, unique = false, nullable = false)
	private Integer isSynergy;//是否协同 1:是  2:否

	@Column(name = "synergy_dep", length = 500, unique = false, nullable = true)
	private String synergyDep;//协同相关机构

	@Column(name = "take_effect_date", length = 19, unique = false, nullable = true)
	private Date takeEffectDate;//计划生效日期

	@Column(name = "cancel_date", length = 19, unique = false, nullable = true)
	private Date cancelDate;//计划取消日期

	@Column(name = "del_status", length = 10, unique = false, nullable = false)
	private Integer delStatus;//删除状态: 0:是 1:否

	@Column(name = "version_id", length = 14, unique = false, nullable = false)
	private String versionId;//版本id

	@Column(name = "version_date", length = 19, unique = false, nullable = false)
	private Date versionDate;//版本时间

	@Column(name = "create_user_id", length = 32, unique = false, nullable = false)
	private String createUserId;//创建人id

	@Column(name = "create_user", length = 50, unique = false, nullable = false)
	private String createUser;//创建人姓名

	@Column(name = "create_department_id", length = 32, unique = false, nullable = false)
	private String createDepartmentId;//创建人部门id

	@Column(name = "create_dep_name", length = 150, unique = false, nullable = false)
	private String createDepName;//创建人部门

	@Column(name = "create_date", length = 19, unique = false, nullable = false)
	private Date createDate;//创建时间

	@Column(name = "_date", length = 19, unique = false, nullable = true)
	private Date updateDate;//修改时间

	@Column(name = "is_stop", length = 10, unique = false, nullable = false)
	private Integer isStop;//操作状态 0:再用  1 取消 2 停用

	@Column(name = "level", length = 6, unique = false, nullable = false)
	private String level;//区划代码

	@Column(name = "cd_time", length = 19, unique = false, nullable = false)
	private Date cdTime;//插入时间

	@Column(name = "cd_source", length = 50, unique = false, nullable = false)
	private String cdSource;//来源（省份区划代码|部门编码）

	@Column(name = "cd_batch", length = 50, unique = false, nullable = false)
	private String cdBatch;//批次号

	@Column(name = "cd_operation", length = 1, unique = false, nullable = false)
	private String cdOperation;//新增数据类型i-insert,u-,d-delete
	
	public JgJgsxImplementPublish() {
		
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
	public String getImplementPublishId() {
		return implementPublishId;
	}
	
	/**
	 * 设置属性：本记录的唯一标识(原系统主键ID)
	 * @param implementPublishId
	 */
	public void setImplementPublishId(String implementPublishId) {
		this.implementPublishId = implementPublishId;
	}
	
	/**
	 * 读取属性：检查子项code
	 * @return
	 */
	public String getDetailCode() {
		return detailCode;
	}
	
	/**
	 * 设置属性：检查子项code
	 * @param detailCode
	 */
	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}
	
	/**
	 * 读取属性：实施清单编码
	 * @return
	 */
	public String getInventoryCode() {
		return inventoryCode;
	}
	
	/**
	 * 设置属性：实施清单编码
	 * @param inventoryCode
	 */
	public void setInventoryCode(String inventoryCode) {
		this.inventoryCode = inventoryCode;
	}
	
	/**
	 * 读取属性：行使层级
	 * @return
	 */
	public String getExerciseLevel() {
		return exerciseLevel;
	}
	
	/**
	 * 设置属性：行使层级
	 * @param exerciseLevel
	 */
	public void setExerciseLevel(String exerciseLevel) {
		this.exerciseLevel = exerciseLevel;
	}
	
	/**
	 * 读取属性：实施主体
	 * @return
	 */
	public String getImplementBody() {
		return implementBody;
	}
	
	/**
	 * 设置属性：实施主体
	 * @param implementBody
	 */
	public void setImplementBody(String implementBody) {
		this.implementBody = implementBody;
	}
	
	/**
	 * 读取属性：实施主体编码
	 * @return
	 */
	public String getImplementBodyCode() {
		return implementBodyCode;
	}
	
	/**
	 * 设置属性：实施主体编码
	 * @param implementBodyCode
	 */
	public void setImplementBodyCode(String implementBodyCode) {
		this.implementBodyCode = implementBodyCode;
	}
	
	/**
	 * 读取属性：实施主体性质
	 * @return
	 */
	public String getImplementNature() {
		return implementNature;
	}
	
	/**
	 * 设置属性：实施主体性质
	 * @param implementNature
	 */
	public void setImplementNature(String implementNature) {
		this.implementNature = implementNature;
	}
	
	/**
	 * 读取属性：委托部门
	 * @return
	 */
	public String getDelegationDepartment() {
		return delegationDepartment;
	}
	
	/**
	 * 设置属性：委托部门
	 * @param delegationDepartment
	 */
	public void setDelegationDepartment(String delegationDepartment) {
		this.delegationDepartment = delegationDepartment;
	}
	
	/**
	 * 读取属性：委托部门编码
	 * @return
	 */
	public String getDelegationDepCode() {
		return delegationDepCode;
	}
	
	/**
	 * 设置属性：委托部门编码
	 * @param delegationDepCode
	 */
	public void setDelegationDepCode(String delegationDepCode) {
		this.delegationDepCode = delegationDepCode;
	}
	
	/**
	 * 读取属性：监管对象主项
	 * @return
	 */
	public String getSupervisionObject() {
		return supervisionObject;
	}
	
	/**
	 * 设置属性：监管对象主项
	 * @param supervisionObject
	 */
	public void setSupervisionObject(String supervisionObject) {
		this.supervisionObject = supervisionObject;
	}
	
	/**
	 * 读取属性：监管对象子项
	 * @return
	 */
	public String getSupervisionObjectSub() {
		return supervisionObjectSub;
	}
	
	/**
	 * 设置属性：监管对象子项
	 * @param supervisionObjectSub
	 */
	public void setSupervisionObjectSub(String supervisionObjectSub) {
		this.supervisionObjectSub = supervisionObjectSub;
	}
	
	/**
	 * 读取属性：检查类别 1:现场检查  2:非现场检查
	 * @return
	 */
	public Integer getExamineType() {
		return examineType;
	}
	
	/**
	 * 设置属性：检查类别 1:现场检查  2:非现场检查
	 * @param examineType
	 */
	public void setExamineType(Integer examineType) {
		this.examineType = examineType;
	}
	
	/**
	 * 读取属性：检查方式
	 * @return
	 */
	public String getExamineWay() {
		return examineWay;
	}
	
	/**
	 * 设置属性：检查方式
	 * @param examineWay
	 */
	public void setExamineWay(String examineWay) {
		this.examineWay = examineWay;
	}
	
	/**
	 * 读取属性：是否纳入双随机 1:是 2:否
	 * @return
	 */
	public Integer getIsRandom() {
		return isRandom;
	}
	
	/**
	 * 设置属性：是否纳入双随机 1:是 2:否
	 * @param isRandom
	 */
	public void setIsRandom(Integer isRandom) {
		this.isRandom = isRandom;
	}
	
	/**
	 * 读取属性：检查比例
	 * @return
	 */
	public String getCheckProportion() {
		return checkProportion;
	}
	
	/**
	 * 设置属性：检查比例
	 * @param checkProportion
	 */
	public void setCheckProportion(String checkProportion) {
		this.checkProportion = checkProportion;
	}
	
	/**
	 * 读取属性：检查频次
	 * @return
	 */
	public String getCheckFrequency() {
		return checkFrequency;
	}
	
	/**
	 * 设置属性：检查频次
	 * @param checkFrequency
	 */
	public void setCheckFrequency(String checkFrequency) {
		this.checkFrequency = checkFrequency;
	}
	
	/**
	 * 读取属性：检查内容（日常）
	 * @return
	 */
	public String getCheckContentDay() {
		return checkContentDay;
	}
	
	/**
	 * 设置属性：检查内容（日常）
	 * @param checkContentDay
	 */
	public void setCheckContentDay(String checkContentDay) {
		this.checkContentDay = checkContentDay;
	}
	
	/**
	 * 读取属性：检查内容（专项）
	 * @return
	 */
	public String getCheckContentParticularly() {
		return checkContentParticularly;
	}
	
	/**
	 * 设置属性：检查内容（专项）
	 * @param checkContentParticularly
	 */
	public void setCheckContentParticularly(String checkContentParticularly) {
		this.checkContentParticularly = checkContentParticularly;
	}
	
	/**
	 * 读取属性：是否抽检 1:是  2:否
	 * @return
	 */
	public Integer getIsCheck() {
		return isCheck;
	}
	
	/**
	 * 设置属性：是否抽检 1:是  2:否
	 * @param isCheck
	 */
	public void setIsCheck(Integer isCheck) {
		this.isCheck = isCheck;
	}
	
	/**
	 * 读取属性：监督抽检内容
	 * @return
	 */
	public String getSupervisionContent() {
		return supervisionContent;
	}
	
	/**
	 * 设置属性：监督抽检内容
	 * @param supervisionContent
	 */
	public void setSupervisionContent(String supervisionContent) {
		this.supervisionContent = supervisionContent;
	}
	
	/**
	 * 读取属性：是否协同 1:是  2:否
	 * @return
	 */
	public Integer getIsSynergy() {
		return isSynergy;
	}
	
	/**
	 * 设置属性：是否协同 1:是  2:否
	 * @param isSynergy
	 */
	public void setIsSynergy(Integer isSynergy) {
		this.isSynergy = isSynergy;
	}
	
	/**
	 * 读取属性：协同相关机构
	 * @return
	 */
	public String getSynergyDep() {
		return synergyDep;
	}
	
	/**
	 * 设置属性：协同相关机构
	 * @param synergyDep
	 */
	public void setSynergyDep(String synergyDep) {
		this.synergyDep = synergyDep;
	}
	
	/**
	 * 读取属性：计划生效日期
	 * @return
	 */
	public Date getTakeEffectDate() {
		return takeEffectDate;
	}
	
	/**
	 * 设置属性：计划生效日期
	 * @param takeEffectDate
	 */
	public void setTakeEffectDate(Date takeEffectDate) {
		this.takeEffectDate = takeEffectDate;
	}
	
	/**
	 * 读取属性：计划取消日期
	 * @return
	 */
	public Date getCancelDate() {
		return cancelDate;
	}
	
	/**
	 * 设置属性：计划取消日期
	 * @param cancelDate
	 */
	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	
	/**
	 * 读取属性：删除状态: 0:是 1:否
	 * @return
	 */
	public Integer getDelStatus() {
		return delStatus;
	}
	
	/**
	 * 设置属性：删除状态: 0:是 1:否
	 * @param delStatus
	 */
	public void setDelStatus(Integer delStatus) {
		this.delStatus = delStatus;
	}
	
	/**
	 * 读取属性：版本id
	 * @return
	 */
	public String getVersionId() {
		return versionId;
	}
	
	/**
	 * 设置属性：版本id
	 * @param versionId
	 */
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	
	/**
	 * 读取属性：版本时间
	 * @return
	 */
	public Date getVersionDate() {
		return versionDate;
	}
	
	/**
	 * 设置属性：版本时间
	 * @param versionDate
	 */
	public void setVersionDate(Date versionDate) {
		this.versionDate = versionDate;
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
