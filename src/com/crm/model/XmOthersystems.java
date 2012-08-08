package com.crm.model;

public class XmOthersystems {
    private Integer id;

    private String server;

    private Integer serverPort;

    private String serverUsername;

    private String serverPassword;

    private String serverType;

    private String dbName;

    private String dbPrefix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server == null ? null : server.trim();
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public String getServerUsername() {
        return serverUsername;
    }

    public void setServerUsername(String serverUsername) {
        this.serverUsername = serverUsername == null ? null : serverUsername.trim();
    }

    public String getServerPassword() {
        return serverPassword;
    }

    public void setServerPassword(String serverPassword) {
        this.serverPassword = serverPassword == null ? null : serverPassword.trim();
    }

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType == null ? null : serverType.trim();
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName == null ? null : dbName.trim();
    }

    public String getDbPrefix() {
        return dbPrefix;
    }

    public void setDbPrefix(String dbPrefix) {
        this.dbPrefix = dbPrefix == null ? null : dbPrefix.trim();
    }
}