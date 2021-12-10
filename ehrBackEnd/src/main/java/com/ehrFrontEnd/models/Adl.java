package com.ehrFrontEnd.models;

import javax.persistence.*;

@Entity
public class Adl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADL_ID")
    private Long id;

    private Boolean eating;
    private Boolean bathing;
    private Boolean dressing;
    private Boolean transfering;

    public Adl(Long id, Boolean eating, Boolean bathing, Boolean dressing, Boolean transfering) {
        this.id = id;
        this.eating = eating;
        this.bathing = bathing;
        this.dressing = dressing;
        this.transfering = transfering;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEating() {
        return eating;
    }

    public void setEating(Boolean eating) {
        this.eating = eating;
    }

    public Boolean getBathing() {
        return bathing;
    }

    public void setBathing(Boolean bathing) {
        this.bathing = bathing;
    }

    public Boolean getDressing() {
        return dressing;
    }

    public void setDressing(Boolean dressing) {
        this.dressing = dressing;
    }

    public Boolean getTransfering() {
        return transfering;
    }

    public void setTransfering(Boolean transfering) {
        this.transfering = transfering;
    }
}
