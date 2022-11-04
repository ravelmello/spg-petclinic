package com.ravel.petclinic.map;

import com.ravel.petclinic.model.Veterinarian;
import com.ravel.petclinic.service.MapService;

import java.util.Set;

public class VeterinarianServiceMap extends MapService<Veterinarian, Long> {
    @Override
    public Set<Veterinarian> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Veterinarian veterinarian) {
        super.delete(veterinarian);
    }

    @Override
    public Veterinarian save(Veterinarian veterinarian) {
        return super.save(veterinarian.getId(), veterinarian);
    }

    @Override
    public Veterinarian findById(Long id) {
        return super.findById(id);
    }
}
