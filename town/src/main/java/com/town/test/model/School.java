package com.town.test.model;

import java.util.Date;
import java.util.List;

public class School {

    //学校名
    private String schoolname;
    //学校成立时间
    private Date createTime;
    //负责人
    private String name;
    //班级
    private List<Classes> classes;

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
