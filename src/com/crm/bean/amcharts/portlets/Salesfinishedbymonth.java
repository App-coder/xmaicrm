package com.crm.bean.amcharts.portlets;
/**
 * 公司最近6个月销售任务完成情况
 * 
 * User: zhujun
 * Date: 2012-8-12
 * Time: 下午8:17:49
 */
public class Salesfinishedbymonth {
	
	private String month;
	private String sum;
	private String finished;
	private String colorOfSum;
	private String colorOfFinished;
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	public String getFinished() {
		return finished;
	}
	public void setFinished(String finished) {
		this.finished = finished;
	}
	public String getColorOfSum() {
		return colorOfSum;
	}
	public void setColorOfSum(String colorOfSum) {
		this.colorOfSum = colorOfSum;
	}
	public String getColorOfFinished() {
		return colorOfFinished;
	}
	public void setColorOfFinished(String colorOfFinished) {
		this.colorOfFinished = colorOfFinished;
	}
}
