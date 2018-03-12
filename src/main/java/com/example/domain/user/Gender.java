package com.example.domain.user;

import java.io.Serializable;

public class Gender implements Serializable {
    private Integer gId;
    private String gName;

    @Override
    public String toString() {
        return "Gender{" +
                "gId=" + gId +
                ", gName='" + gName + '\'' +
                '}';
    }

    public Gender() {
    }

    public Gender(Integer gId, String gName) {
        this.gId = gId;
        this.gName = gName;
    }

    public Gender(String gName) {
        this.gName = gName;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }
}