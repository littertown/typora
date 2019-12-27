package com.town.user.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.excel.annotation.ExcelProperty;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;


/**
 * -POJO
 * @author
 * @since 2019-11-26
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "user", schema="town")
@org.hibernate.annotations.Entity(dynamicUpdate=true)
@Proxy(lazy = false)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

//    @Id
//    @Column(name = "id", length = 32, unique = true, nullable = false)
//    private String id;//主键

    @Id
    @Column(name = "accout", length = 32, unique = false, nullable = true)
    @ExcelProperty("登录账号")
    private String accout;//账号

    @Column(name = "name", length = 5, unique = false, nullable = true)
    @ExcelProperty("人员名称")
    private String name;//名称

    @Column(name = "tel", length = 11, unique = false, nullable = true)
    @ExcelProperty("联系电话")
    private String tel;//电话

    @Column(name = "job", length = 10, unique = false, nullable = true)
    @ExcelProperty("人员岗位")
    private String job;//岗位

    @Column(name = "level", length = 10, unique = false, nullable = true)
    @ExcelProperty("人员级别")
    private Integer level;//人员级别 1.国家 2.省级 3.市级 4.区县级

    @Column(name = "identityTpye", length = 10, unique = false, nullable = true)
    @ExcelProperty("证件类型")
    private String identitytpye;//A00身份证

    @Column(name = "identityCard", length = 18, unique = false, nullable = true)
    @ExcelProperty("证件号码")
    private String identitycard;//身份证号码

    @Column(name = "orgCode", length = 20, unique = false, nullable = true)
    @ExcelProperty("所属组织机构编码")
    private String orgcode;//组织机构编码

    @Column(name = "regionCode", length = 20, unique = false, nullable = true)
    @ExcelProperty("所属行政区域编码")
    private String regioncode;//行政区域编码

    @Column(name = "category", length = 10, unique = false, nullable = true)
    @ExcelProperty("人员类型")
    private String category;//人员类别

    @Column(name = "sex", length = 10, unique = false, nullable = true)
    @ExcelProperty("人员性别")
    private Integer sex;//人员性别 1-男 0-女

    @Column(name = "remark", length = 32, unique = false, nullable = true)
    @ExcelProperty("人员备注")
    private String remark;//人员备注

    /**
     * 读取属性：主键
     * @return
     */
//    public String getId() {
//        return id;
//    }

    /**
     * 设置属性：主键
     * @param id
     */
//    public void setId(String id) {
//        this.id = id;
//    }

    /**
     * 读取属性：账号
     * @return
     */
    public String getAccout() {
        return accout;
    }

    /**
     * 设置属性：账号
     * @param accout
     */
    public void setAccout(String accout) {
        this.accout = accout;
    }

    /**
     * 读取属性：名称
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置属性：名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 读取属性：电话
     * @return
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置属性：电话
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 读取属性：岗位
     * @return
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置属性：岗位
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 读取属性：人员级别 1.国家 2.省级 3.市级 4.区县级
     * @return
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置属性：人员级别 1.国家 2.省级 3.市级 4.区县级
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 读取属性：A00身份证
     * @return
     */
    public String getIdentitytpye() {
        return identitytpye;
    }

    /**
     * 设置属性：A00身份证
     * @param identitytpye
     */
    public void setIdentitytpye(String identitytpye) {
        this.identitytpye = identitytpye;
    }

    /**
     * 读取属性：身份证号码
     * @return
     */
    public String getIdentitycard() {
        return identitycard;
    }

    /**
     * 设置属性：身份证号码
     * @param identitycard
     */
    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    /**
     * 读取属性：组织机构编码
     * @return
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
     * 设置属性：组织机构编码
     * @param orgcode
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    /**
     * 读取属性：行政区域编码
     * @return
     */
    public String getRegioncode() {
        return regioncode;
    }

    /**
     * 设置属性：行政区域编码
     * @param regioncode
     */
    public void setRegioncode(String regioncode) {
        this.regioncode = regioncode;
    }

    /**
     * 读取属性：人员类别
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置属性：人员类别
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 读取属性：人员性别 1-男 0-女
     * @return
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置属性：人员性别 1-男 0-女
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 读取属性：人员备注
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置属性：人员备注
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

}
