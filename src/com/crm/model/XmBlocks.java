package com.crm.model;

public class XmBlocks {

	private Integer blockid;

    private Integer tabid;

    private String blocklabel;

    private Integer sequence;

    private Integer showTitle;

    private Integer visible;

    private Integer createView;

    private Integer editView;

    private Integer detailView;
    
    private String tabname;

    public Integer getBlockid() {
        return blockid;
    }

    public void setBlockid(Integer blockid) {
        this.blockid = blockid;
    }

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public String getBlocklabel() {
        return blocklabel;
    }

    public void setBlocklabel(String blocklabel) {
        this.blocklabel = blocklabel == null ? null : blocklabel.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Integer showTitle) {
        this.showTitle = showTitle;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getCreateView() {
        return createView;
    }

    public void setCreateView(Integer createView) {
        this.createView = createView;
    }

    public Integer getEditView() {
        return editView;
    }

    public void setEditView(Integer editView) {
        this.editView = editView;
    }

    public Integer getDetailView() {
        return detailView;
    }

    public void setDetailView(Integer detailView) {
        this.detailView = detailView;
    }

	public String getTabname() {
		return tabname;
	}

	public void setTabname(String tabname) {
		this.tabname = tabname;
	}
    
    

}