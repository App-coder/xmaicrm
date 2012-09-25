package com.crm.model;

public class XmSalesTotal {
	private Integer type;
	private String last_name;
	private String duedate;
	private float sumactualamount;
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public float getSumactualamount() {
		return sumactualamount;
	}
	public void setSumactualamount(float sumactualamount) {
		this.sumactualamount = sumactualamount;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

}
