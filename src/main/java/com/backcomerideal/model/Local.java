package com.backcomerideal.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "locales_comerciales")
public class Local {
    @Id
    private String localId;
    private String localName;
    private String address;
    private String districtId;
    private String district;
    @JsonProperty("isAvailability")
    private boolean isAvailability;
    private String activityType;
    private int totalDistrictStore;
    private float longitude;
    private float latitude;
    private float rentalPrice;
    private float salePrice;

    // Constructor vacío (necesario para JPA)
    public Local() {
    }

    // Constructor con todos los campos
    public Local(String localId, String localName, String address, String districtId, String district,
                 boolean isAvailability, String activityType, int totalDistrictStore, float longitude,
                 float latitude, float rentalPrice, float salePrice) {
        this.localId = localId;
        this.localName = localName;
        this.address = address;
        this.districtId = districtId;
        this.district = district;
        this.isAvailability = isAvailability;
        this.activityType = activityType;
        this.totalDistrictStore = totalDistrictStore;
        this.longitude = longitude;
        this.latitude = latitude;
        this.rentalPrice = rentalPrice;
        this.salePrice = salePrice;
    }

    // Getters y setters para cada campo
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public boolean isAvailability() {
        return isAvailability;
    }

    public void setAvailability(boolean availability) {
        isAvailability = availability;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public int getTotalDistrictStore() {
        return totalDistrictStore;
    }

    public void setTotalDistrictStore(int totalDistrictStore) {
        this.totalDistrictStore = totalDistrictStore;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(float rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }
}
