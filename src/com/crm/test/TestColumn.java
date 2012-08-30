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
		c.setTitle("负责人");
		c.setField("userName");
		c.setResizable(false);
		System.out.println(JsonUtil.getJsonString4JavaPOJO(c));;
		
	}

}
