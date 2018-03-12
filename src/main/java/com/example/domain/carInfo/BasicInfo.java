package com.example.domain.carInfo;

import java.io.Serializable;

public class BasicInfo implements Serializable {
    private Integer carId;
    private String brand;
    private String carGrade;
    private String engineType;
    private String gearbox;
    private String bodywork;
    private String LWH;
    private String wheelbase;
    private String cargoVolume;
    private String weight;

    public BasicInfo() {
    }

    public BasicInfo(String brand, String carGrade, String engineType, String gearbox, String bodywork, String LWH, String wheelbase, String cargoVolume, String weight) {
        this.brand = brand;
        this.carGrade = carGrade;
        this.engineType = engineType;
        this.gearbox = gearbox;
        this.bodywork = bodywork;
        this.LWH = LWH;
        this.wheelbase = wheelbase;
        this.cargoVolume = cargoVolume;
        this.weight = weight;
    }

    public BasicInfo(Integer carId, String brand, String carGrade, String engineType, String gearbox, String bodywork, String LWH, String wheelbase, String cargoVolume, String weight) {
        this.carId = carId;
        this.brand = brand;
        this.carGrade = carGrade;
        this.engineType = engineType;
        this.gearbox = gearbox;
        this.bodywork = bodywork;
        this.LWH = LWH;
        this.wheelbase = wheelbase;
        this.cargoVolume = cargoVolume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BasicInfo{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", carGrade='" + carGrade + '\'' +
                ", engineType='" + engineType + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", bodywork='" + bodywork + '\'' +
                ", LWH='" + LWH + '\'' +
                ", wheelbase='" + wheelbase + '\'' +
                ", cargoVolume='" + cargoVolume + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarGrade() {
        return carGrade;
    }

    public void setCarGrade(String carGrade) {
        this.carGrade = carGrade;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getBodywork() {
        return bodywork;
    }

    public void setBodywork(String bodywork) {
        this.bodywork = bodywork;
    }

    public String getLWH() {
        return LWH;
    }

    public void setLWH(String LWH) {
        this.LWH = LWH;
    }

    public String getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(String wheelbase) {
        this.wheelbase = wheelbase;
    }

    public String getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(String cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
