package com.vefree.vefreeback.domain.dto.request;

public class CancelServiceRequest {
    private Integer serviceId;
    private String userId;

    public CancelServiceRequest() {
    }

    public CancelServiceRequest(Integer serviceId, String userId) {
        this.serviceId = serviceId;
        this.userId = userId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
