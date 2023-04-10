package com.ravel.petclinic.map;

import com.ravel.petclinic.model.Pet;
import com.ravel.petclinic.service.MapService;
import com.ravel.petclinic.service.PetService;

import java.util.Set;

public class PetServiceMap extends MapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
