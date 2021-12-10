package com.ehrFrontEnd.models;

import javax.persistence.*;

@Entity
public class Observation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OBSERVATION_ID")
    private Long id;

    private String observation;

    public Observation(Long id, String observation) {
        this.id = id;
        this.observation = observation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
