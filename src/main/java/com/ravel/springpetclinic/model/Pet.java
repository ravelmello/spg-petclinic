package com.ravel.springpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet {
    private PetType petType;
    private Owner ownder;
    private LocalDate birthDate;
}
