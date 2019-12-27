/**
 * Copyright 2019 bejson.com
 */
package com.town.test.model;
import java.util.List;

/**
 * Auto-generated: 2019-10-26 15:31:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class FeedbackUnitInfo {

    private List<AdmInspection> admInspection;
    private List<AdmPunishment> admPunishment;
    private List<AdmForce> admForce;
    private List<Other> other;
    public void setAdmInspection(List<AdmInspection> admInspection) {
        this.admInspection = admInspection;
    }
    public List<AdmInspection> getAdmInspection() {
        return admInspection;
    }

    public void setAdmPunishment(List<AdmPunishment> admPunishment) {
        this.admPunishment = admPunishment;
    }
    public List<AdmPunishment> getAdmPunishment() {
        return admPunishment;
    }

    public void setAdmForce(List<AdmForce> admForce) {
        this.admForce = admForce;
    }
    public List<AdmForce> getAdmForce() {
        return admForce;
    }

    public void setOther(List<Other> other) {
        this.other = other;
    }
    public List<Other> getOther() {
        return other;
    }

}