package com.example.domain.dizhi;

import java.io.Serializable;

public class ChengShi implements Serializable {
    private Integer cId;
    private String cName;
    private String cPinyin;
    private Integer cShengfenId;
    private ShengFen shengFen;


    public ChengShi() {
    }

    public ChengShi(String cName, String cPinyin, Integer cShengfenId, ShengFen shengFen) {
        this.cName = cName;
        this.cPinyin = cPinyin;
        this.cShengfenId = cShengfenId;
        this.shengFen = shengFen;
    }

    public ChengShi(Integer cId, String cName, String cPinyin, Integer cShengfenId, ShengFen shengFen) {
        this.cId = cId;
        this.cName = cName;
        this.cPinyin = cPinyin;
        this.cShengfenId = cShengfenId;
        this.shengFen = shengFen;
    }


    @Override
    public String toString() {
        return "ChengShi{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cPinyin='" + cPinyin + '\'' +
                ", cShengfenId=" + cShengfenId +
                ", shengFen=" + shengFen +
                '}';
    }

    public ShengFen getShengFen() {
        return shengFen;
    }

    public void setShengFen(ShengFen shengFen) {
        this.shengFen = shengFen;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcPinyin() {
        return cPinyin;
    }

    public void setcPinyin(String cPinyin) {
        this.cPinyin = cPinyin;
    }

    public Integer getcShengfenId() {
        return cShengfenId;
    }

    public void setcShengfenId(Integer cShengfenId) {
        this.cShengfenId = cShengfenId;
    }
}
