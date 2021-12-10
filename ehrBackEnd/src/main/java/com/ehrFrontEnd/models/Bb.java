package com.ehrFrontEnd.models;

import javax.persistence.*;

@Entity
public class Bb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BB_ID")
    private Long id;

    private Boolean used;

    public Bb(Long id, Boolean used) {
        this.id = id;
        this.used = used;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }
}
