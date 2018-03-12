package com.example.domain.dizhi;

import java.io.Serializable;

public class ShengFen implements Serializable {
    private Integer sId;
    private String sName;
    private Integer sZiMuId;
    private String sPinyin;
    private DaXieZiMu daXieZiMu;

    public ShengFen() {
    }

    public ShengFen(String sName, Integer sZiMuId, String sPinyin, DaXieZiMu daXieZiMu) {
        this.sName = sName;
        this.sZiMuId = sZiMuId;
        this.sPinyin = sPinyin;
        this.daXieZiMu = daXieZiMu;
    }

    public ShengFen(Integer sId, String sName, Integer sZiMuId, String sPinyin, DaXieZiMu daXieZiMu) {
        this.sId = sId;
        this.sName = sName;
        this.sZiMuId = sZiMuId;
        this.sPinyin = sPinyin;
        this.daXieZiMu = daXieZiMu;
    }

    @Override
    public String toString() {
        return "ShengFen{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sZiMuId=" + sZiMuId +
                ", sPinyin='" + sPinyin + '\'' +
                ", daXieZiMu=" + daXieZiMu +
                '}';
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsZiMuId() {
        return sZiMuId;
    }

    public void setsZiMuId(Integer sZiMuId) {
        this.sZiMuId = sZiMuId;
    }

    public String getsPinyin() {
        return sPinyin;
    }

    public void setsPinyin(String sPinyin) {
        this.sPinyin = sPinyin;
    }

    public DaXieZiMu getDaXieZiMu() {
        return daXieZiMu;
    }

    public void setDaXieZiMu(DaXieZiMu daXieZiMu) {
        this.daXieZiMu = daXieZiMu;
    }
}