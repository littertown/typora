/**
 * Copyright 2019 bejson.com
 */
package com.town.test.model;
import java.util.Date;

/**
 * Auto-generated: 2019-10-26 15:31:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class AdmForce {

    private String supervisionMatterCode;
    private String forceActionName;
    private String illegalFact;
    private String forceType;
    private String superviseObjectCode;
    private String superviseObjectName;
    private String coerciveMeasureType;
    private String forceExecutionType;
    private String forceResult;
    private Date mandatoryDecisionServiceDate;
    private Date forceExtendDate;
    private String forceActionCode;
    public void setSupervisionMatterCode(String supervisionMatterCode) {
        this.supervisionMatterCode = supervisionMatterCode;
    }
    //建造者
    public AdmForce bulidAdmForce(){
        AdmForce admForce = null;
        return admForce;
    }

    public String getSupervisionMatterCode() {
        return supervisionMatterCode;
    }

    public void setForceActionName(String forceActionName) {
        this.forceActionName = forceActionName;
    }
    public String getForceActionName() {
        return forceActionName;
    }

    public void setIllegalFact(String illegalFact) {
        this.illegalFact = illegalFact;
    }
    public String getIllegalFact() {
        return illegalFact;
    }

    public void setForceType(String forceType) {
        this.forceType = forceType;
    }
    public String getForceType() {
        return forceType;
    }

    public void setSuperviseObjectCode(String superviseObjectCode) {
        this.superviseObjectCode = superviseObjectCode;
    }
    public String getSuperviseObjectCode() {
        return superviseObjectCode;
    }

    public void setSuperviseObjectName(String superviseObjectName) {
        this.superviseObjectName = superviseObjectName;
    }
    public String getSuperviseObjectName() {
        return superviseObjectName;
    }

    public void setCoerciveMeasureType(String coerciveMeasureType) {
        this.coerciveMeasureType = coerciveMeasureType;
    }
    public String getCoerciveMeasureType() {
        return coerciveMeasureType;
    }

    public void setForceExecutionType(String forceExecutionType) {
        this.forceExecutionType = forceExecutionType;
    }
    public String getForceExecutionType() {
        return forceExecutionType;
    }

    public void setForceResult(String forceResult) {
        this.forceResult = forceResult;
    }
    public String getForceResult() {
        return forceResult;
    }

    public void setMandatoryDecisionServiceDate(Date mandatoryDecisionServiceDate) {
        this.mandatoryDecisionServiceDate = mandatoryDecisionServiceDate;
    }
    public Date getMandatoryDecisionServiceDate() {
        return mandatoryDecisionServiceDate;
    }

    public void setForceExtendDate(Date forceExtendDate) {
        this.forceExtendDate = forceExtendDate;
    }
    public Date getForceExtendDate() {
        return forceExtendDate;
    }

    public void setForceActionCode(String forceActionCode) {
        this.forceActionCode = forceActionCode;
    }
    public String getForceActionCode() {
        return forceActionCode;
    }

}