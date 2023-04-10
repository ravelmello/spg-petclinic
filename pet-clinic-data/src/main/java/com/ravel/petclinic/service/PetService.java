package com.ravel.petclinic.service;

import com.ravel.petclinic.model.Pet;
import com.ravel.petclinic.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class PetService implements Serializable {

    private final PetRepository repository;

    public PetService(PetRepository repository) {
        this.repository = repository;
    }

    public void savePet(Pet pet) {
        repository.save(pet);
    }
}

