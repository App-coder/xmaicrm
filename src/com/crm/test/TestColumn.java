package com.crm.test;

import com.crm.bean.easyui.Column;
import com.crm.util.JsonUtil;

public class TestColumn {

	public static void main(String[] args) {
		TestColumn t = new TestColumn();
		t.GetJson();

	}
	
	public void GetJson(){
		Column c = new Column();
		c.setTitle("客户名称 ");
		c.setField("accountname");
		System.out.println(JsonUtil.getJsonString4JavaPOJO(c));;
		
	}

}
