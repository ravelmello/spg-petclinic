package com.ravel.petclinic.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class MapService<T, ID> implements CrudServiceGeneric<T, ID> {
    public Map<ID, T> map = new HashMap<>();

    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    protected T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

}
