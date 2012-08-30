package com.crm.model;

public class XmRelatedlists {
    private Integer relationId;

    private Integer tabid;

    private Integer relatedTabid;

    private String name;

    private Integer sequence;

    private String label;

    private Integer presence;

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public Integer getRelatedTabid() {
        return relatedTabid;
    }

    public void setRelatedTabid(Integer relatedTabid) {
        this.relatedTabid = relatedTabid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }
}