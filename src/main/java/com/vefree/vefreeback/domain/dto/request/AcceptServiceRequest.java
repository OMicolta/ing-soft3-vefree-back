package com.vefree.vefreeback.domain.dto.request;


public class AcceptServiceRequest {
    private Integer serviceId;
    private String beneficiaryUser;
    private Character status;

    public AcceptServiceRequest() {
    }

    public AcceptServiceRequest(Integer serviceId, String beneficiaryUser, Character status) {
        this.serviceId = serviceId;
        this.beneficiaryUser = beneficiaryUser;
        this.status = status;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getBeneficiaryUser() {
        return beneficiaryUser;
    }

    public void setBeneficiaryUser(String beneficiaryUser) {
        this.beneficiaryUser = beneficiaryUser;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }
}
