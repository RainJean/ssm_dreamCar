package com.example.domain.carInfo;

import java.io.Serializable;

public class Engine implements Serializable {
    private Integer engineId;
    private String displacement;
    private String AirIntakeForm;
    private String cylinder;
    private String maxPS;
    private String maxNM;
    private String fuelType;
    private String FuelLabel;
    private String OilSupplyWay;
    private String EmissionStandards;

    @Override
    public String toString() {
        return "Engine{" +
                "engineId=" + engineId +
                ", displacement='" + displacement + '\'' +
                ", AirIntakeForm='" + AirIntakeForm + '\'' +
                ", cylinder='" + cylinder + '\'' +
                ", maxPS='" + maxPS + '\'' +
                ", maxNM='" + maxNM + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", FuelLabel='" + FuelLabel + '\'' +
                ", OilSupplyWay='" + OilSupplyWay + '\'' +
                ", EmissionStandards='" + EmissionStandards + '\'' +
                '}';
    }

    public Integer getEngineId() {
        return engineId;
    }

    public void setEngineId(Integer engineId) {
        this.engineId = engineId;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getAirIntakeForm() {
        return AirIntakeForm;
    }

    public void setAirIntakeForm(String airIntakeForm) {
        AirIntakeForm = airIntakeForm;
    }

    public String getCylinder() {
        return cylinder;
    }

    public void setCylinder(String cylinder) {
        this.cylinder = cylinder;
    }

    public String getMaxPS() {
        return maxPS;
    }

    public void setMaxPS(String maxPS) {
        this.maxPS = maxPS;
    }

    public String getMaxNM() {
        return maxNM;
    }

    public void setMaxNM(String maxNM) {
        this.maxNM = maxNM;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelLabel() {
        return FuelLabel;
    }

    public void setFuelLabel(String fuelLabel) {
        FuelLabel = fuelLabel;
    }

    public String getOilSupplyWay() {
        return OilSupplyWay;
    }

    public void setOilSupplyWay(String oilSupplyWay) {
        OilSupplyWay = oilSupplyWay;
    }

    public String getEmissionStandards() {
        return EmissionStandards;
    }

    public void setEmissionStandards(String emissionStandards) {
        EmissionStandards = emissionStandards;
    }

    public Engine() {
    }

    public Engine(String displacement, String airIntakeForm, String cylinder, String maxPS, String maxNM, String fuelType, String fuelLabel, String oilSupplyWay, String emissionStandards) {
        this.displacement = displacement;
        AirIntakeForm = airIntakeForm;
        this.cylinder = cylinder;
        this.maxPS = maxPS;
        this.maxNM = maxNM;
        this.fuelType = fuelType;
        FuelLabel = fuelLabel;
        OilSupplyWay = oilSupplyWay;
        EmissionStandards = emissionStandards;
    }

    public Engine(Integer engineId, String displacement, String airIntakeForm, String cylinder, String maxPS, String maxNM, String fuelType, String fuelLabel, String oilSupplyWay, String emissionStandards) {
        this.engineId = engineId;
        this.displacement = displacement;
        AirIntakeForm = airIntakeForm;
        this.cylinder = cylinder;
        this.maxPS = maxPS;
        this.maxNM = maxNM;
        this.fuelType = fuelType;
        FuelLabel = fuelLabel;
        OilSupplyWay = oilSupplyWay;
        EmissionStandards = emissionStandards;
    }
}
