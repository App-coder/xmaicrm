package com.crm.service.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmFaqcategory;


public interface XmFaqcategorysService {
	List<XmFaqcategory> getFaqCategoryByParentid(@Param("parentfaqcategoryid") int parentfaqcategoryid);
	String getFaqCategory();

}
