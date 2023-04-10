package com.ravel.petclinic.model;

import javax.persistence.Entity;

@Entity
public class Veterinarian extends Person{

    private String vetCode;

    public String getVetCode() {
        return vetCode;
    }

    public void setVetCode(String vetCode) {
        this.vetCode = vetCode;
    }
}
