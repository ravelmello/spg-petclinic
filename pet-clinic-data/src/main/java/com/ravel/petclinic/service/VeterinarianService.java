package com.ravel.petclinic.service;

import com.ravel.petclinic.model.Veterinarian;

import java.util.Set;

public interface VeterinarianService {

    Set<Veterinarian> findAll();
    Veterinarian save(Veterinarian veterinarian);
    Veterinarian findById(Long id);
}
