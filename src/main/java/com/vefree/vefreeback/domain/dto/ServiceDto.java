package com.vefree.vefreeback.domain.dto;

import java.util.Date;

public class ServiceDto {
    private Integer id;
    private String name;
    private String description;
    private Date initialDate;
    private Integer vehicleTypeId;
    private String providerName;
    private String providerId;
    private String beneficiaryName;
    private String beneficiaryId;
    private Character status;

    private String source;

    private String destination;



    public ServiceDto() {
    }

    public ServiceDto(Integer id, String name, String description, Date initialDate, Integer vehicleTypeId, String providerName, String providerId, String beneficiaryName, String beneficiaryId, Character status, String source, String destination) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.initialDate = initialDate;
        this.vehicleTypeId = vehicleTypeId;
        this.providerName = providerName;
        this.providerId = providerId;
        this.beneficiaryName = beneficiaryName;
        this.beneficiaryId = beneficiaryId;
        this.status = status;
        this.source = source;
        this.destination = destination;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Integer getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }
}
