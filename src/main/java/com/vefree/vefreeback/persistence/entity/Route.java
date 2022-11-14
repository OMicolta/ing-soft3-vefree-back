package com.vefree.vefreeback.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String source;
    private String destination;
    private String details;

    @OneToMany(mappedBy = "route")
    private List<Service> services;


    public Route() {
    }

    public Route(Integer id, String source, String destination, String details) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
