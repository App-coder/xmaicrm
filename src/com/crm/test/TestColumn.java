package com.crm.test;

import com.crm.bean.easyui.Column;
import com.crm.bean.easyui.expand.CVColumn;
import com.crm.util.JsonUtil;

public class TestColumn {

	public static void main(String[] args) {
		TestColumn t = new TestColumn();
		t.GetJson();

	}
	
	public void GetJson(){
		CVColumn c = new CVColumn();
		c.setTitle("负责人");
		c.setField("userName");
		c.setResizable(false);
		c.setEntitytype("entitytype");
		c.setFieldcolname("fieldcolname");
		c.setFieldlabel("fieldlabel");
		c.setFieldname("fieldname");
		c.setFieldtabname("fieldtabname");
		c.setFieldtypeofdata("fieldtypeofdata");
		System.out.println(JsonUtil.getJsonString4JavaPOJO(c));;
		
	}

}
