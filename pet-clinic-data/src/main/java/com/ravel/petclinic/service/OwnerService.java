package com.ravel.petclinic.service;

import com.ravel.petclinic.model.Owner;

public interface OwnerService extends CrudServiceGeneric<Owner, Long>{
    Owner findByName(String name);

}
 