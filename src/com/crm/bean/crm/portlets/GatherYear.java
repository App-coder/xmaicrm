package com.crm.bean.crm.portlets;

import java.math.BigDecimal;

public class GatherYear {
	private String duedate;
	private String gatherscount;
	/**
	 * 计划收款
	 */
	private BigDecimal sumplanamount;
	/**
	 * 实际收款
	 */
	private BigDecimal sumactualamount;
	
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public String getGatherscount() {
		return gatherscount;
	}
	public void setGatherscount(String gatherscount) {
		this.gatherscount = gatherscount;
	}
	public BigDecimal getSumplanamount() {
		return sumplanamount;
	}
	public void setSumplanamount(BigDecimal sumplanamount) {
		this.sumplanamount = sumplanamount;
	}
	public BigDecimal getSumactualamount() {
		return sumactualamount;
	}
	public void setSumactualamount(BigDecimal sumactualamount) {
		this.sumactualamount = sumactualamount;
	}
	
	
}
