package com.ravel.petclinic.model;

import javax.persistence.*;

@Entity
public class Owner extends Person {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
