package com.ravel.petclinic.service;

import com.ravel.petclinic.model.Owner;
import com.ravel.petclinic.repository.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;


    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public void saveOwner(Owner owner){
        ownerRepository.save(owner);
    }

    public List<Owner> getOwners(){
        return ownerRepository.findAll();
    }
}
 