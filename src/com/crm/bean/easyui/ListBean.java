package com.crm.bean.easyui;

import java.util.HashMap;
import java.util.List;

public class ListBean {
	private long total;
	private List rows;
	private List<HashMap<String, String>> footer;
    private List<Object> report_footer;
	
	public ListBean(){
		
	}
	
	public <T> ListBean(List<T> obj){
		this.rows = obj;
		this.total = obj.size();
	}
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}

	public List<HashMap<String, String>> getFooter() {
		return footer;
	}

	public void setFooter(List<HashMap<String, String>> footer) {
		this.footer = footer;
	}

	public List<Object> getReport_footer() {
		return report_footer;
	}

	public void setReport_footer(List<Object> report_footer) {
		this.report_footer = report_footer;
	}
	


	
}
