package com.ravel.petclinic.service;

import com.ravel.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Set<Pet> findAll();
    Pet save(Pet pet);
    Pet findById(Long id);
}

