package com.xuz.db1.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer lUserId;

    private String vcUserName;

    private String vcUserPassword;

    public Integer getlUserId() {
        return lUserId;
    }

    public void setlUserId(Integer lUserId) {
        this.lUserId = lUserId;
    }

    public String getVcUserName() {
        return vcUserName;
    }

    public void setVcUserName(String vcUserName) {
        this.vcUserName = vcUserName == null ? null : vcUserName.trim();
    }

    public String getVcUserPassword() {
        return vcUserPassword;
    }

    public void setVcUserPassword(String vcUserPassword) {
        this.vcUserPassword = vcUserPassword == null ? null : vcUserPassword.trim();
    }
}