package com.ehrFrontEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.*;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PATIENT_ID")
    private Long id;

    private String name;
    private Integer roomNumber;
    private Integer bedNumber;
    @OneToOne
    @JoinColumn(name = "chart_chart_id")
    private Chart chart;

    public Chart getChart() {
        return chart;
    }

    public Patient(Long id, String name, Integer roomNumber, Integer bedNumber, Chart chart) {
        this.id = id;
        this.name = name;
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.chart = chart;
    }

    public Patient() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }
}
