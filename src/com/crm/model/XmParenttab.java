package com.crm.model;

public class XmParenttab {
    private Integer parenttabid;

    private String parenttabLabel;

    private Integer sequence;

    private Integer visible;

    public Integer getParenttabid() {
        return parenttabid;
    }

    public void setParenttabid(Integer parenttabid) {
        this.parenttabid = parenttabid;
    }

    public String getParenttabLabel() {
        return parenttabLabel;
    }

    public void setParenttabLabel(String parenttabLabel) {
        this.parenttabLabel = parenttabLabel == null ? null : parenttabLabel.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}