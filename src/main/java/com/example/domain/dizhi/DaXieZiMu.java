package com.example.domain.dizhi;

import java.io.Serializable;

public class DaXieZiMu implements Serializable {
    private Integer zId;
    private String zZiMu;


    @Override
    public String toString() {
        return "DaXieZiMu{" +
                "zId=" + zId +
                ", zZiMu='" + zZiMu + '\'' +
                '}';
    }

    public Integer getzId() {
        return zId;
    }

    public void setzId(Integer zId) {
        this.zId = zId;
    }

    public String getzZiMu() {
        return zZiMu;
    }

    public void setzZiMu(String zZiMu) {
        this.zZiMu = zZiMu;
    }

    public DaXieZiMu(Integer zId, String zZiMu) {
        this.zId = zId;
        this.zZiMu = zZiMu;
    }

    public DaXieZiMu() {
    }
}
