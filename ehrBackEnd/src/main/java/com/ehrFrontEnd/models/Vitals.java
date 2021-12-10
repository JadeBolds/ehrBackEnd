package com.ehrFrontEnd.models;

import javax.persistence.*;

@Entity
public class Vitals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VITALS_ID")
    private Long id;

    private Double temp;
    private Integer pulse;
    private Integer respirations;
    private String bloodPressure;

    public Vitals(Long id, Double temp, Integer pulse, Integer respirations, String bloodPressure) {
        this.id = id;
        this.temp = temp;
        this.pulse = pulse;
        this.respirations = respirations;
        this.bloodPressure = bloodPressure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public Integer getRespirations() {
        return respirations;
    }

    public void setRespirations(Integer respirations) {
        this.respirations = respirations;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
}
