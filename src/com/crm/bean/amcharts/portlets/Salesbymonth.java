package com.crm.bean.amcharts.portlets;

import java.math.BigDecimal;

/**
 * 公司最近6个月销售情况
 * 
 * User: zhujun
 * Date: 2012-8-13
 * Time: 下午11:19:07
 */
public class Salesbymonth {
	private String m;
	private BigDecimal total;
	private int so_count;
	private String colorOfTotal = "#728DA2";
	private String colorOfCount = "#8BBA00"; 
	public String getM() {
		return m;
	}
	public void setM(String m) {
		this.m = m;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public int getSo_count() {
		return so_count;
	}
	public void setSo_count(int so_count) {
		this.so_count = so_count;
	}
	public String getColorOfTotal() {
		return colorOfTotal;
	}
	public void setColorOfTotal(String colorOfTotal) {
		this.colorOfTotal = colorOfTotal;
	}
	public String getColorOfCount() {
		return colorOfCount;
	}
	public void setColorOfCount(String colorOfCount) {
		this.colorOfCount = colorOfCount;
	}
	
}
