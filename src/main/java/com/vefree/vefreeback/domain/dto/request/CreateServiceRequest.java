package com.vefree.vefreeback.domain.dto.request;

import java.util.Date;

public class CreateServiceRequest {
    private String name;
    private String description;
    private Date initialDate;
    private Integer vehicleTypeId;
    private Integer providerUserId;
    private Integer beneficiaryUserId;
    private Integer statusId;
    private Integer routeId;

    public CreateServiceRequest() {
    }

    public CreateServiceRequest(String name, String description, Date initialDate, Integer vehicleTypeId, Integer providerUserId, Integer beneficiaryUserId, Integer statusId, Integer routeId) {
        this.name = name;
        this.description = description;
        this.initialDate = initialDate;
        this.vehicleTypeId = vehicleTypeId;
        this.providerUserId = providerUserId;
        this.beneficiaryUserId = beneficiaryUserId;
        this.statusId = statusId;
        this.routeId = routeId;
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

    public Integer getProviderUserId() {
        return providerUserId;
    }

    public void setProviderUserId(Integer providerUserId) {
        this.providerUserId = providerUserId;
    }

    public Integer getBeneficiaryUserId() {
        return beneficiaryUserId;
    }

    public void setBeneficiaryUserId(Integer beneficiaryUserId) {
        this.beneficiaryUserId = beneficiaryUserId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }
}
