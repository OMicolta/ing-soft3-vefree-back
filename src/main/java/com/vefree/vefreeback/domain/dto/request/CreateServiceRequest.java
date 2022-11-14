package com.vefree.vefreeback.domain.dto.request;

import com.vefree.vefreeback.domain.dto.RouteDto;
import com.vefree.vefreeback.domain.dto.StatusDto;
import com.vefree.vefreeback.domain.dto.UserDto;
import com.vefree.vefreeback.domain.dto.VehicleTypeDto;
import com.vefree.vefreeback.persistence.entity.Route;
import com.vefree.vefreeback.persistence.entity.Status;
import com.vefree.vefreeback.persistence.entity.User;
import com.vefree.vefreeback.persistence.entity.VehicleType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class CreateServiceRequest {
    private String name;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date initialDate;
    private Integer vehicleTypeId;
    private Integer providerUserId;
    private Integer beneficiaryUserId;
    private Integer statusId;
    private Integer routeId;


    private VehicleTypeDto vehicleType;

    private UserDto userProvider;

    private UserDto userBeneficiary;

    private StatusDto status;

    private RouteDto route;


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
