/**
 * Copyright 2019 bejson.com
 */
package com.town.test.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Auto-generated: 2019-10-26 15:31:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@XmlRootElement
public class SuperviseData {

    private TaskInfo taskInfo;
    private SupervisionProcess supervisionProcess;
    public void setTaskInfo(TaskInfo taskInfo) {
        this.taskInfo = taskInfo;
    }
    public TaskInfo getTaskInfo() {
        return taskInfo;
    }

    public void setSupervisionProcess(SupervisionProcess supervisionProcess) {
        this.supervisionProcess = supervisionProcess;
    }
    public SupervisionProcess getSupervisionProcess() {
        return supervisionProcess;
    }

}