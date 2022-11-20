package com.vefree.vefreeback.domain.dto.request;

public class CreateVehicleTypeRequest {
    private String name;
    private String description;

    public CreateVehicleTypeRequest() {
    }

    public CreateVehicleTypeRequest(String name, String description) {
        this.name = name;
        this.description = description;
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
}
