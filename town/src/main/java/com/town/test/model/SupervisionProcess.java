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
public class SupervisionProcess {

    private List<TaskDetails> taskDetails;
    private FeedbackUnitInfo feedbackUnitInfo;
    public void setTaskDetails(List<TaskDetails> taskDetails) {
        this.taskDetails = taskDetails;
    }
    public List<TaskDetails> getTaskDetails() {
        return taskDetails;
    }

    public void setFeedbackUnitInfo(FeedbackUnitInfo feedbackUnitInfo) {
        this.feedbackUnitInfo = feedbackUnitInfo;
    }
    public FeedbackUnitInfo getFeedbackUnitInfo() {
        return feedbackUnitInfo;
    }

}