package com.ehrFrontEnd.models;

import javax.persistence.*;

@Entity
public class Chart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHART_ID")
    private Long id;

    private Boolean Adl;
    private Boolean Bb;
    private Boolean Nutrition;
    private String Observation;
    private Object Vitals;

    public Chart() {
    }

    public Chart(Long id, Boolean adl, Boolean bb, Boolean nutrition, String observation, Object vitals) {
        this.id = id;
        Adl = adl;
        Bb = bb;
        Nutrition = nutrition;
        Observation = observation;
        Vitals = vitals;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAdl() {
        return Adl;
    }

    public void setAdl(Boolean adl) {
        Adl = adl;
    }

    public Boolean getBb() {
        return Bb;
    }

    public void setBb(Boolean bb) {
        Bb = bb;
    }

    public Boolean getNutrition() {
        return Nutrition;
    }

    public void setNutrition(Boolean nutrition) {
        Nutrition = nutrition;
    }

    public String getObservation() {
        return Observation;
    }

    public void setObservation(String observation) {
        Observation = observation;
    }

    public Object getVitals() {
        return Vitals;
    }

    public void setVitals(Object vitals) {
        Vitals = vitals;
    }
}
