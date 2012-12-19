package com.crm.model;

import java.util.Date;

public class XmUsers {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userHash;

    private String calColor;

    private String firstName;

    private String lastName;

    private String reportsToId;

    private String isAdmin;

    private Integer currencyId;

    private Date dateEntered;

    private Date dateModified;

    private String modifiedUserId;

    private String title;

    private String department;

    private String phoneHome;

    private String phoneMobile;

    private String phoneWork;

    private String phoneOther;

    private String phoneFax;

    private String email1;

    private String email2;

    private String yahooId;

    private String status;

    private String signature;

    private String addressStreet;

    private String addressCity;

    private String addressState;

    private String addressCountry;

    private String addressPostalcode;

    private String tz;

    private String holidays;

    private String namedays;

    private String workdays;

    private Integer weekstart;

    private String dateFormat;

    private String hourFormat;

    private String startHour;

    private String endHour;

    private String homeorder;

    private String activityView;

    private String leadView;

    private String imagename;

    private Integer deleted;

    private String defhomeview;

    private String confirmPassword;

    private Integer isOnline;

    private String lastPing;

    private String prefix;

    private Integer poolsstatus;

    private Integer stuffid;

    private String description;

    private String userPreferences;

    private String buddylist;
    
    private String groupname;
    
    private String rolename;
    
    private String groupid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserHash() {
        return userHash;
    }

    public void setUserHash(String userHash) {
        this.userHash = userHash == null ? null : userHash.trim();
    }

    public String getCalColor() {
        return calColor;
    }

    public void setCalColor(String calColor) {
        this.calColor = calColor == null ? null : calColor.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getReportsToId() {
        return reportsToId;
    }

    public void setReportsToId(String reportsToId) {
        this.reportsToId = reportsToId == null ? null : reportsToId.trim();
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin == null ? null : isAdmin.trim();
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date dateEntered) {
        this.dateEntered = dateEntered;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId == null ? null : modifiedUserId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome == null ? null : phoneHome.trim();
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile == null ? null : phoneMobile.trim();
    }

    public String getPhoneWork() {
        return phoneWork;
    }

    public void setPhoneWork(String phoneWork) {
        this.phoneWork = phoneWork == null ? null : phoneWork.trim();
    }

    public String getPhoneOther() {
        return phoneOther;
    }

    public void setPhoneOther(String phoneOther) {
        this.phoneOther = phoneOther == null ? null : phoneOther.trim();
    }

    public String getPhoneFax() {
        return phoneFax;
    }

    public void setPhoneFax(String phoneFax) {
        this.phoneFax = phoneFax == null ? null : phoneFax.trim();
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1 == null ? null : email1.trim();
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2 == null ? null : email2.trim();
    }

    public String getYahooId() {
        return yahooId;
    }

    public void setYahooId(String yahooId) {
        this.yahooId = yahooId == null ? null : yahooId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet == null ? null : addressStreet.trim();
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity == null ? null : addressCity.trim();
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState == null ? null : addressState.trim();
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry == null ? null : addressCountry.trim();
    }

    public String getAddressPostalcode() {
        return addressPostalcode;
    }

    public void setAddressPostalcode(String addressPostalcode) {
        this.addressPostalcode = addressPostalcode == null ? null : addressPostalcode.trim();
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz == null ? null : tz.trim();
    }

    public String getHolidays() {
        return holidays;
    }

    public void setHolidays(String holidays) {
        this.holidays = holidays == null ? null : holidays.trim();
    }

    public String getNamedays() {
        return namedays;
    }

    public void setNamedays(String namedays) {
        this.namedays = namedays == null ? null : namedays.trim();
    }

    public String getWorkdays() {
        return workdays;
    }

    public void setWorkdays(String workdays) {
        this.workdays = workdays == null ? null : workdays.trim();
    }

    public Integer getWeekstart() {
        return weekstart;
    }

    public void setWeekstart(Integer weekstart) {
        this.weekstart = weekstart;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat == null ? null : dateFormat.trim();
    }

    public String getHourFormat() {
        return hourFormat;
    }

    public void setHourFormat(String hourFormat) {
        this.hourFormat = hourFormat == null ? null : hourFormat.trim();
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour == null ? null : startHour.trim();
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour == null ? null : endHour.trim();
    }

    public String getHomeorder() {
        return homeorder;
    }

    public void setHomeorder(String homeorder) {
        this.homeorder = homeorder == null ? null : homeorder.trim();
    }

    public String getActivityView() {
        return activityView;
    }

    public void setActivityView(String activityView) {
        this.activityView = activityView == null ? null : activityView.trim();
    }

    public String getLeadView() {
        return leadView;
    }

    public void setLeadView(String leadView) {
        this.leadView = leadView == null ? null : leadView.trim();
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename == null ? null : imagename.trim();
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getDefhomeview() {
        return defhomeview;
    }

    public void setDefhomeview(String defhomeview) {
        this.defhomeview = defhomeview == null ? null : defhomeview.trim();
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword == null ? null : confirmPassword.trim();
    }

    public Integer getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

    public String getLastPing() {
        return lastPing;
    }

    public void setLastPing(String lastPing) {
        this.lastPing = lastPing == null ? null : lastPing.trim();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public Integer getPoolsstatus() {
        return poolsstatus;
    }

    public void setPoolsstatus(Integer poolsstatus) {
        this.poolsstatus = poolsstatus;
    }

    public Integer getStuffid() {
        return stuffid;
    }

    public void setStuffid(Integer stuffid) {
        this.stuffid = stuffid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUserPreferences() {
        return userPreferences;
    }

    public void setUserPreferences(String userPreferences) {
        this.userPreferences = userPreferences == null ? null : userPreferences.trim();
    }

    public String getBuddylist() {
        return buddylist;
    }

    public void setBuddylist(String buddylist) {
        this.buddylist = buddylist == null ? null : buddylist.trim();
    }

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
    
    
    
}