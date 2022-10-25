package com.ravel.petclinic.service;

import com.ravel.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Set<Owner> findAll();
    Owner save(Owner owner);
    Owner findByName(String name);

}
