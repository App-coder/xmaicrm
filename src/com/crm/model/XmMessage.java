package com.crm.model;

public class XmMessage {
    private Integer id;

    private Integer recipient;

    private Integer sender;

    private Integer received;

    private Integer deletedSender;

    private Integer deletedRecipient;

    private String message;

    private String type;

    private String stamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecipient() {
        return recipient;
    }

    public void setRecipient(Integer recipient) {
        this.recipient = recipient;
    }

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getDeletedSender() {
        return deletedSender;
    }

    public void setDeletedSender(Integer deletedSender) {
        this.deletedSender = deletedSender;
    }

    public Integer getDeletedRecipient() {
        return deletedRecipient;
    }

    public void setDeletedRecipient(Integer deletedRecipient) {
        this.deletedRecipient = deletedRecipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }
}