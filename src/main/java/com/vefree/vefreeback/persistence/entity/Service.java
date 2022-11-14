package com.vefree.vefreeback.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    @Column(name = "initial_date")
    private Date initialDate;
    @Column(name = "vehicle_type_id")
    private Integer vehicleTypeId;
    @Column(name = "provider_user_id")
    private Integer providerUserId;
    @Column(name = "beneficiary_user_id")
    private Integer beneficiaryUserId;
    @Column(name = "status_id")
    private Integer statusId;
    @Column(name = "route_id")
    private Integer routeId;

    @ManyToOne
    @JoinColumn(name = "vehicle_type_id", insertable = false, updatable = false)
    private VehicleType vehicleType;

    @ManyToOne
    @JoinColumn(name = "provider_user_id", insertable = false, updatable = false)
    private User userProvider;

    @ManyToOne
    @JoinColumn(name = "beneficiary_user_id", insertable = false, updatable = false)
    private User userBeneficiary;

    @ManyToOne
    @JoinColumn(name = "status_id", insertable = false, updatable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "route_id", insertable = false, updatable = false)
    private Route route;

    public Service() {
    }

    public Service(Integer id, String name, String description, Date initialDate, Integer vehicleTypeId, Integer providerUserId, Integer beneficiaryUserId, Integer statusId, Integer routeId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.initialDate = initialDate;
        this.vehicleTypeId = vehicleTypeId;
        this.providerUserId = providerUserId;
        this.beneficiaryUserId = beneficiaryUserId;
        this.statusId = statusId;
        this.routeId = routeId;
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
