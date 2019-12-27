package com.town.jgjgsxpublishsundetail.model;

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
@Table(name = "jg_jgsx_publish_sun_detail", schema="town")
//@DynamicUpdate(true)
@org.hibernate.annotations.Entity(dynamicUpdate=true)
@Proxy(lazy = false)
public class JgJgsxPublishSunDetail  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cd_id", length = 100, unique = true, nullable = false)
	private String cdId;//主键


	@Column(name = "manage_detail_id", length = 32, unique = false, nullable = false)
	private String manageDetailId;//本记录的唯一标识(原系统主键ID)


	@Column(name = "manage_matter_code", length = 50, unique = false, nullable = false)
	private String manageMatterCode;//事项编码


	@Column(name = "subitem_name", length = 65535, unique = false, nullable = false)
	private String subitemName;//监管事项子项名称


	@Column(name = "subitem_code", length = 50, unique = false, nullable = false)
	private String subitemCode;//子项编码


	@Column(name = "department_id", length = 20, unique = false, nullable = false)
	private String departmentId;//监管部门编码


	@Column(name = "supervise_object", length = 500, unique = false, nullable = false)
	private String superviseObject;//监管对象


	@Column(name = "supervise_form", length = 255, unique = false, nullable = false)
	private String superviseForm;//监管形式


	@Column(name = "administrative_type", length = 10, unique = false, nullable = false)
	private Integer administrativeType;//行政类型:0:行政检查 1:行政处罚 2:行政强制 3:其他


	@Column(name = "set_gist", length = 16777215, unique = false, nullable = false)
	private String setGist;//设定依据


	@Column(name = "supervise_way", length = 16777215, unique = false, nullable = false)
	private String superviseWay;//监管方式


	@Column(name = "supervise_flow", length = 16777215, unique = false, nullable = false)
	private String superviseFlow;//监管流程


	@Column(name = "supervise_result", length = 65535, unique = false, nullable = false)
	private String superviseResult;//监管结果


	@Column(name = "supervise_level", length = 65535, unique = false, nullable = false)
	private String superviseLevel;//监管层级


	@Column(name = "take_effect_date", length = 19, unique = false, nullable = true)
	private Date takeEffectDate;//计划生效日期


	@Column(name = "cancel_date", length = 19, unique = false, nullable = true)
	private Date cancelDate;//计划取消日期


	@Column(name = "cd_time", length = 19, unique = false, nullable = false)
	private Date cdTime;//插入时间


	@Column(name = "cd_source", length = 50, unique = false, nullable = false)
	private String cdSource;//来源（省份区划代码|部门编码）


	@Column(name = "cd_batch", length = 50, unique = false, nullable = false)
	private String cdBatch;//批次号


	@Column(name = "cd_operation", length = 1, unique = false, nullable = false)
	private String cdOperation;//新增数据类型i-insert,u-,d-delete

	public JgJgsxPublishSunDetail() {

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
	public String getManageDetailId() {
		return manageDetailId;
	}

	/**
	 * 设置属性：本记录的唯一标识(原系统主键ID)
	 * @param manageDetailId
	 */
	public void setManageDetailId(String manageDetailId) {
		this.manageDetailId = manageDetailId;
	}

	/**
	 * 读取属性：事项编码
	 * @return
	 */
	public String getManageMatterCode() {
		return manageMatterCode;
	}

	/**
	 * 设置属性：事项编码
	 * @param manageMatterCode
	 */
	public void setManageMatterCode(String manageMatterCode) {
		this.manageMatterCode = manageMatterCode;
	}

	/**
	 * 读取属性：监管事项子项名称
	 * @return
	 */
	public String getSubitemName() {
		return subitemName;
	}

	/**
	 * 设置属性：监管事项子项名称
	 * @param subitemName
	 */
	public void setSubitemName(String subitemName) {
		this.subitemName = subitemName;
	}

	/**
	 * 读取属性：子项编码
	 * @return
	 */
	public String getSubitemCode() {
		return subitemCode;
	}

	/**
	 * 设置属性：子项编码
	 * @param subitemCode
	 */
	public void setSubitemCode(String subitemCode) {
		this.subitemCode = subitemCode;
	}

	/**
	 * 读取属性：监管部门编码
	 * @return
	 */
	public String getDepartmentId() {
		return departmentId;
	}

	/**
	 * 设置属性：监管部门编码
	 * @param departmentId
	 */
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * 读取属性：监管对象
	 * @return
	 */
	public String getSuperviseObject() {
		return superviseObject;
	}

	/**
	 * 设置属性：监管对象
	 * @param superviseObject
	 */
	public void setSuperviseObject(String superviseObject) {
		this.superviseObject = superviseObject;
	}

	/**
	 * 读取属性：监管形式
	 * @return
	 */
	public String getSuperviseForm() {
		return superviseForm;
	}

	/**
	 * 设置属性：监管形式
	 * @param superviseForm
	 */
	public void setSuperviseForm(String superviseForm) {
		this.superviseForm = superviseForm;
	}

	/**
	 * 读取属性：行政类型:0:行政检查 1:行政处罚 2:行政强制 3:其他
	 * @return
	 */
	public Integer getAdministrativeType() {
		return administrativeType;
	}

	/**
	 * 设置属性：行政类型:0:行政检查 1:行政处罚 2:行政强制 3:其他
	 * @param administrativeType
	 */
	public void setAdministrativeType(Integer administrativeType) {
		this.administrativeType = administrativeType;
	}

	/**
	 * 读取属性：设定依据
	 * @return
	 */
	public String getSetGist() {
		return setGist;
	}

	/**
	 * 设置属性：设定依据
	 * @param setGist
	 */
	public void setSetGist(String setGist) {
		this.setGist = setGist;
	}

	/**
	 * 读取属性：监管方式
	 * @return
	 */
	public String getSuperviseWay() {
		return superviseWay;
	}

	/**
	 * 设置属性：监管方式
	 * @param superviseWay
	 */
	public void setSuperviseWay(String superviseWay) {
		this.superviseWay = superviseWay;
	}

	/**
	 * 读取属性：监管流程
	 * @return
	 */
	public String getSuperviseFlow() {
		return superviseFlow;
	}

	/**
	 * 设置属性：监管流程
	 * @param superviseFlow
	 */
	public void setSuperviseFlow(String superviseFlow) {
		this.superviseFlow = superviseFlow;
	}

	/**
	 * 读取属性：监管结果
	 * @return
	 */
	public String getSuperviseResult() {
		return superviseResult;
	}

	/**
	 * 设置属性：监管结果
	 * @param superviseResult
	 */
	public void setSuperviseResult(String superviseResult) {
		this.superviseResult = superviseResult;
	}

	/**
	 * 读取属性：监管层级
	 * @return
	 */
	public String getSuperviseLevel() {
		return superviseLevel;
	}

	/**
	 * 设置属性：监管层级
	 * @param superviseLevel
	 */
	public void setSuperviseLevel(String superviseLevel) {
		this.superviseLevel = superviseLevel;
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
