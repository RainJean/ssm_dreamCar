package com.example.domain.carInfo;

import java.io.Serializable;

public class Driving implements Serializable{
    private Integer drivingId;
    private String drivingMethod;
    private String brakeType;
    private String frontSuspensionType;
    private String rearSuspensionType;
    private String frontbrakingType;
    private String rearbrakingType;
    private String parkingBrakeType;
    private String frontTireRule;
    private String rearTireRule;

    @Override
    public String toString() {
        return "Driving{" +
                "drivingId=" + drivingId +
                ", drivingMethod='" + drivingMethod + '\'' +
                ", brakeType='" + brakeType + '\'' +
                ", frontSuspensionType='" + frontSuspensionType + '\'' +
                ", rearSuspensionType='" + rearSuspensionType + '\'' +
                ", frontbrakingType='" + frontbrakingType + '\'' +
                ", rearbrakingType='" + rearbrakingType + '\'' +
                ", parkingBrakeType='" + parkingBrakeType + '\'' +
                ", frontTireRule='" + frontTireRule + '\'' +
                ", rearTireRule='" + rearTireRule + '\'' +
                '}';
    }

    public Driving() {
    }

    public Driving(String drivingMethod, String brakeType, String frontSuspensionType, String rearSuspensionType, String frontbrakingType, String rearbrakingType, String parkingBrakeType, String frontTireRule, String rearTireRule) {
        this.drivingMethod = drivingMethod;
        this.brakeType = brakeType;
        this.frontSuspensionType = frontSuspensionType;
        this.rearSuspensionType = rearSuspensionType;
        this.frontbrakingType = frontbrakingType;
        this.rearbrakingType = rearbrakingType;
        this.parkingBrakeType = parkingBrakeType;
        this.frontTireRule = frontTireRule;
        this.rearTireRule = rearTireRule;
    }

    public Driving(Integer drivingId, String drivingMethod, String brakeType, String frontSuspensionType, String rearSuspensionType, String frontbrakingType, String rearbrakingType, String parkingBrakeType, String frontTireRule, String rearTireRule) {
        this.drivingId = drivingId;
        this.drivingMethod = drivingMethod;
        this.brakeType = brakeType;
        this.frontSuspensionType = frontSuspensionType;
        this.rearSuspensionType = rearSuspensionType;
        this.frontbrakingType = frontbrakingType;
        this.rearbrakingType = rearbrakingType;
        this.parkingBrakeType = parkingBrakeType;
        this.frontTireRule = frontTireRule;
        this.rearTireRule = rearTireRule;
    }

    public Integer getDrivingId() {
        return drivingId;
    }

    public void setDrivingId(Integer drivingId) {
        this.drivingId = drivingId;
    }

    public String getDrivingMethod() {
        return drivingMethod;
    }

    public void setDrivingMethod(String drivingMethod) {
        this.drivingMethod = drivingMethod;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public String getFrontSuspensionType() {
        return frontSuspensionType;
    }

    public void setFrontSuspensionType(String frontSuspensionType) {
        this.frontSuspensionType = frontSuspensionType;
    }

    public String getRearSuspensionType() {
        return rearSuspensionType;
    }

    public void setRearSuspensionType(String rearSuspensionType) {
        this.rearSuspensionType = rearSuspensionType;
    }

    public String getFrontbrakingType() {
        return frontbrakingType;
    }

    public void setFrontbrakingType(String frontbrakingType) {
        this.frontbrakingType = frontbrakingType;
    }

    public String getRearbrakingType() {
        return rearbrakingType;
    }

    public void setRearbrakingType(String rearbrakingType) {
        this.rearbrakingType = rearbrakingType;
    }

    public String getParkingBrakeType() {
        return parkingBrakeType;
    }

    public void setParkingBrakeType(String parkingBrakeType) {
        this.parkingBrakeType = parkingBrakeType;
    }

    public String getFrontTireRule() {
        return frontTireRule;
    }

    public void setFrontTireRule(String frontTireRule) {
        this.frontTireRule = frontTireRule;
    }

    public String getRearTireRule() {
        return rearTireRule;
    }

    public void setRearTireRule(String rearTireRule) {
        this.rearTireRule = rearTireRule;
    }
}
