package com.ravel.petclinic.repository;

import com.ravel.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface PetRepository extends CrudRepository<com.ravel.petclinic.model.Pet, Long> {

    @Override
    <S extends Pet> S save(S s);
    Set<Pet> findAll();
    Optional<Pet> findById(Long id);

}
