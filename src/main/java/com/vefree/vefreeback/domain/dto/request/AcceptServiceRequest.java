package com.vefree.vefreeback.domain.dto.request;


public class AcceptServiceRequest {
    private Integer serviceId;
    private String beneficiaryName;
    private String beneficiaryId;

    public AcceptServiceRequest() {
    }

    public AcceptServiceRequest(Integer serviceId, String beneficiaryName, String beneficiaryId) {
        this.serviceId = serviceId;
        this.beneficiaryName = beneficiaryName;
        this.beneficiaryId = beneficiaryId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }
}
