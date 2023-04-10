package com.ravel.petclinic.repository;

import com.ravel.petclinic.model.Veterinarian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface VeterninarianRepository extends CrudRepository<Veterinarian, Long> {

    @Override
    <S extends Veterinarian> S save(S s);

    Set<Veterinarian> findAll();
}
