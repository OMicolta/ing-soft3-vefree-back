package com.vefree.vefreeback.domain.dto.request;

import javax.persistence.*;
import java.util.Date;

public class CreateServiceRequest {
    private String name;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date initialDate;
    private Integer vehicleTypeId;
    private String providerUser;
    private Character status;
    private String source;
    private String destination;

    public CreateServiceRequest() {
    }

    public CreateServiceRequest(String name, String description, Date initialDate, Integer vehicleTypeId, String providerUser, Character status) {
        this.name = name;
        this.description = description;
        this.initialDate = initialDate;
        this.vehicleTypeId = vehicleTypeId;
        this.providerUser = providerUser;
        this.status = status;
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

    public String getProviderUser() {
        return providerUser;
    }

    public void setProviderUser(String providerUser) {
        this.providerUser = providerUser;
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

}
