package com.xuz.db2.pojo;

import java.io.Serializable;

public class Dep implements Serializable {
    private Integer lDepId;

    private String vcDepName;

    public Integer getlDepId() {
        return lDepId;
    }

    public void setlDepId(Integer lDepId) {
        this.lDepId = lDepId;
    }

    public String getVcDepName() {
        return vcDepName;
    }

    public void setVcDepName(String vcDepName) {
        this.vcDepName = vcDepName == null ? null : vcDepName.trim();
    }
}