package com.ravel.petclinic.service;

import com.ravel.petclinic.model.Veterinarian;
import com.ravel.petclinic.repository.VeterninarianRepository;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class VeterinarianService {

    private final VeterninarianRepository veterninarianRepository;

    public VeterinarianService(VeterninarianRepository veterninarianRepository) {
        this.veterninarianRepository = veterninarianRepository;
    }

    public void saveVet(Veterinarian veterinarian){
        veterninarianRepository.save(veterinarian);
    }

    public Set<Veterinarian> getAllVets(){
        return veterninarianRepository.findAll();
    }
}
