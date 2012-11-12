package com.crm.mapper.module;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.crm.model.XmFaqcategory;

public interface XmFaqcategoryMapper {
    int deleteByPrimaryKey(String faqcategoryid);

    int insert(XmFaqcategory record);

    int insertSelective(XmFaqcategory record);

    XmFaqcategory selectByPrimaryKey(String faqcategoryid);

    int updateByPrimaryKeySelective(XmFaqcategory record);

    int updateByPrimaryKey(XmFaqcategory record);
    
    List<XmFaqcategory> getFaqCategoryByParentid(@Param("parentfaqcategoryid") int parentfaqcategoryid);
    
    List<XmFaqcategory> getFaqCategory();
}