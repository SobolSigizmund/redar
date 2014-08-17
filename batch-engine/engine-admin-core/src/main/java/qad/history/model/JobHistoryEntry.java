package qad.history.model;

import java.util.Date;

/**
 * Created by meng on 6/18/14.
 */
public class JobHistoryEntry {

    private String entryId;
    private String hostname;
    private String ipAddr;
    private String schedulerName;
    private String instanceName;
    private String jobName;
    private String jobGroup;
    private String triggerName;
    private String triggerGroup;
    private Date firedTime;
    private Date nextFiredTime;
    private String priority;
    private String isNonConcurrent;
    private String requestRecovery;
    private String result;
    private String exceptions;

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    public Date getFiredTime() {
        return firedTime;
    }

    public void setFiredTime(Date firedTime) {
        this.firedTime = firedTime;
    }

    public Date getNextFiredTime() {
        return nextFiredTime;
    }

    public void setNextFiredTime(Date nextFiredTime) {
        this.nextFiredTime = nextFiredTime;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getIsNonConcurrent() {
        return isNonConcurrent;
    }

    public void setIsNonConcurrent(String isNonConcurrent) {
        this.isNonConcurrent = isNonConcurrent;
    }

    public String getRequestRecovery() {
        return requestRecovery;
    }

    public void setRequestRecovery(String requestRecovery) {
        this.requestRecovery = requestRecovery;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getExceptions() {
        return exceptions;
    }

    public void setExceptions(String exceptions) {
        this.exceptions = exceptions;
    }

    @Override
    public String toString() {
        return "JobHistoryEntry{" +
                "entryId='" + entryId + '\'' +
                ", hostname='" + hostname + '\'' +
                ", ipAddr='" + ipAddr + '\'' +
                ", schedulerName='" + schedulerName + '\'' +
                ", instanceName='" + instanceName + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobGroup='" + jobGroup + '\'' +
                ", triggerName='" + triggerName + '\'' +
                ", triggerGroup='" + triggerGroup + '\'' +
                ", firedTime=" + firedTime +
                ", nextFiredTime=" + nextFiredTime +
                ", priority='" + priority + '\'' +
                ", isNonConcurrent='" + isNonConcurrent + '\'' +
                ", requestRecovery='" + requestRecovery + '\'' +
                ", result='" + result + '\'' +
                ", exceptions='" + exceptions + '\'' +
                '}';
    }
}
