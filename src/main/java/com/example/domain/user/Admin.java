package com.example.domain.user;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer aId;
    private String aName;
    private String aPassWord;

    @Override
    public String toString() {
        return "Admin{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aPassWord='" + aPassWord + '\'' +
                '}';
    }

    public Admin() {
    }

    public Admin(String aName, String aPassWord) {
        this.aName = aName;
        this.aPassWord = aPassWord;
    }

    public Admin(Integer aId, String aName, String aPassWord) {
        this.aId = aId;
        this.aName = aName;
        this.aPassWord = aPassWord;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPassWord() {
        return aPassWord;
    }

    public void setaPassWord(String aPassWord) {
        this.aPassWord = aPassWord;
    }
}
