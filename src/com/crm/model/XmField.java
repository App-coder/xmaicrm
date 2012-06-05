package com.crm.model;

public class XmField {
    private Integer fieldid;

    private Integer tabid;

    private String columnname;

    private String tablename;

    private Integer generatedtype;

    private String uitype;

    private String fieldname;

    private String fieldlabel;

    private Integer readonly;

    private Integer presence;

    private Integer selected;

    private Integer maximumlength;

    private Integer sequence;

    private Integer block;

    private Integer displaytype;

    private String typeofdata;

    private Integer quickcreate;

    private Integer quickcreatesequence;

    private String infoType;
    
    private String tablabel;
    
    private String fieldHtml;
    
    //权限
    private int profileReadonly;
    
    private int visible;

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

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public Integer getGeneratedtype() {
        return generatedtype;
    }

    public void setGeneratedtype(Integer generatedtype) {
        this.generatedtype = generatedtype;
    }

    public String getUitype() {
        return uitype;
    }

    public void setUitype(String uitype) {
        this.uitype = uitype == null ? null : uitype.trim();
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname == null ? null : fieldname.trim();
    }

    public String getFieldlabel() {
        return fieldlabel;
    }

    public void setFieldlabel(String fieldlabel) {
        this.fieldlabel = fieldlabel == null ? null : fieldlabel.trim();
    }

    public Integer getReadonly() {
        return readonly;
    }

    public void setReadonly(Integer readonly) {
        this.readonly = readonly;
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public Integer getMaximumlength() {
        return maximumlength;
    }

    public void setMaximumlength(Integer maximumlength) {
        this.maximumlength = maximumlength;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getDisplaytype() {
        return displaytype;
    }

    public void setDisplaytype(Integer displaytype) {
        this.displaytype = displaytype;
    }

    public String getTypeofdata() {
        return typeofdata;
    }

    public void setTypeofdata(String typeofdata) {
        this.typeofdata = typeofdata == null ? null : typeofdata.trim();
    }

    public Integer getQuickcreate() {
        return quickcreate;
    }

    public void setQuickcreate(Integer quickcreate) {
        this.quickcreate = quickcreate;
    }

    public Integer getQuickcreatesequence() {
        return quickcreatesequence;
    }

    public void setQuickcreatesequence(Integer quickcreatesequence) {
        this.quickcreatesequence = quickcreatesequence;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType == null ? null : infoType.trim();
    }

	public String getTablabel() {
		return tablabel;
	}

	public void setTablabel(String tablabel) {
		this.tablabel = tablabel;
	}

	public int getProfileReadonly() {
		return profileReadonly;
	}

	public void setProfileReadonly(int profileReadonly) {
		this.profileReadonly = profileReadonly;
	}

	public int getVisible() {
		return visible;
	}

	public void setVisible(int visible) {
		this.visible = visible;
	}

	public String getFieldHtml() {
		return fieldHtml;
	}

	public void setFieldHtml(String fieldHtml) {
		this.fieldHtml = fieldHtml;
	}
    
	
	
}