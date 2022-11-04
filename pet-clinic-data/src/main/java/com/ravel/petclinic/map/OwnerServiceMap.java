package com.ravel.petclinic.map;

import com.ravel.petclinic.model.Owner;
import com.ravel.petclinic.service.MapService;

import java.util.Set;

public class OwnerServiceMap extends MapService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId() ,owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
