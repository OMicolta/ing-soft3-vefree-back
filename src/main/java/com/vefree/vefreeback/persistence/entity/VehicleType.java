package com.vefree.vefreeback.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vehicle_type")
public class VehicleType {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "vehicleType")
    private List<Service> services;


    public VehicleType() {
    }

    public VehicleType(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
}
