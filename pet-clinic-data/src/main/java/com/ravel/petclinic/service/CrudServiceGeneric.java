package com.ravel.petclinic.service;

import java.util.Set;

public interface CrudServiceGeneric<T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T typeObject);
    void delete(T typeObject);
    void deleteById(ID id);


}
