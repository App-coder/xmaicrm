package com.crm.model;

import java.util.Date;

public class XmAnnouncements {
    private Integer announcementsid;

    private String announcementname;

    private String announcement975;

    private Date announcement977;

    private Date announcement979;

    private String announcement981;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private String description;

    public Integer getAnnouncementsid() {
        return announcementsid;
    }

    public void setAnnouncementsid(Integer announcementsid) {
        this.announcementsid = announcementsid;
    }

    public String getAnnouncementname() {
        return announcementname;
    }

    public void setAnnouncementname(String announcementname) {
        this.announcementname = announcementname == null ? null : announcementname.trim();
    }

    public String getAnnouncement975() {
        return announcement975;
    }

    public void setAnnouncement975(String announcement975) {
        this.announcement975 = announcement975 == null ? null : announcement975.trim();
    }

    public Date getAnnouncement977() {
        return announcement977;
    }

    public void setAnnouncement977(Date announcement977) {
        this.announcement977 = announcement977;
    }

    public Date getAnnouncement979() {
        return announcement979;
    }

    public void setAnnouncement979(Date announcement979) {
        this.announcement979 = announcement979;
    }

    public String getAnnouncement981() {
        return announcement981;
    }

    public void setAnnouncement981(String announcement981) {
        this.announcement981 = announcement981 == null ? null : announcement981.trim();
    }

    public Integer getSmcreatorid() {
        return smcreatorid;
    }

    public void setSmcreatorid(Integer smcreatorid) {
        this.smcreatorid = smcreatorid;
    }

    public Integer getSmownerid() {
        return smownerid;
    }

    public void setSmownerid(Integer smownerid) {
        this.smownerid = smownerid;
    }

    public Integer getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Integer modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Integer getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(Integer approvedby) {
        this.approvedby = approvedby;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}