package com.crm.bean.amcharts.portlets;

import java.math.BigDecimal;

public class Gathersyear {
	private String month;
	private BigDecimal lastYearGather;
	private BigDecimal yearGather;
	private String colorOfLastYear;
	private String colorOfYear;
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getColorOfLastYear() {
		return colorOfLastYear;
	}
	public void setColorOfLastYear(String colorOfLastYear) {
		this.colorOfLastYear = colorOfLastYear;
	}
	public String getColorOfYear() {
		return colorOfYear;
	}
	public void setColorOfYear(String colorOfYear) {
		this.colorOfYear = colorOfYear;
	}
	public BigDecimal getLastYearGather() {
		return lastYearGather;
	}
	public void setLastYearGather(BigDecimal lastYearGather) {
		this.lastYearGather = lastYearGather;
	}
	public BigDecimal getYearGather() {
		return yearGather;
	}
	public void setYearGather(BigDecimal yearGather) {
		this.yearGather = yearGather;
	}
}
