package com.crm.mapper.settings.other;

import com.crm.model.XmOrganizationdetails;

public interface XmOrganizationdetailsMapper {
    int deleteByPrimaryKey(String organizationname);

    int insert(XmOrganizationdetails record);

    int insertSelective(XmOrganizationdetails record);

    XmOrganizationdetails selectByPrimaryKey(String organizationname);

    int updateByPrimaryKeySelective(XmOrganizationdetails record);

    int updateByPrimaryKeyWithBLOBs(XmOrganizationdetails record);

    int updateByPrimaryKey(XmOrganizationdetails record);

	XmOrganizationdetails getDetails();

	void update(XmOrganizationdetails details);
}
