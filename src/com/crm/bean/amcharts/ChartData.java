package com.crm.bean.amcharts;

import java.util.List;

import com.crm.bean.amcharts.chartdata.ChartObject;

/**
 * 
 * 报表基本数据
 * 
 * User: zhujun
 * Date: 2012-8-7
 * Time: 上午12:11:29
 */
public class ChartData {
	private String categoryField;
	private String valueField;
	private String colorField;
	private List<ChartObject> data;
	public String getCategoryField() {
		return categoryField;
	}
	public void setCategoryField(String categoryField) {
		this.categoryField = categoryField;
	}
	public String getValueField() {
		return valueField;
	}
	public void setValueField(String valueField) {
		this.valueField = valueField;
	}
	public String getColorField() {
		return colorField;
	}
	public void setColorField(String colorField) {
		this.colorField = colorField;
	}
	public List<ChartObject> getData() {
		return data;
	}
	public void setData(List<ChartObject> data) {
		this.data = data;
	}
	
	
	
}
