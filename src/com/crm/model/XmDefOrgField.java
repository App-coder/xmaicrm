package com.crm.model;

import java.io.Serializable;

public class XmDefOrgField implements Serializable{
	
	private static final long serialVersionUID = -8760562014687336443L;

	private Integer fieldid;

    private Integer tabid;

    private Integer visible;

    private Integer readonly;

    public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getReadonly() {
        return readonly;
    }

    public void setReadonly(Integer readonly) {
        this.readonly = readonly;
    }
}