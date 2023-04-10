package com.ravel.petclinic.bootstrap;

import com.ravel.petclinic.map.OwnerServiceMap;
import com.ravel.petclinic.map.PetServiceMap;
import com.ravel.petclinic.map.VeterinarianServiceMap;
import com.ravel.petclinic.model.Owner;
import com.ravel.petclinic.model.Pet;
import com.ravel.petclinic.model.PetType;
import com.ravel.petclinic.model.Veterinarian;
import com.ravel.petclinic.service.OwnerService;
import com.ravel.petclinic.service.PetService;
import com.ravel.petclinic.service.VeterinarianService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final PetService petService;
    private final OwnerService ownerService;

    private final VeterinarianService veterinarianService;
    public DataLoader(){
        petService = new PetServiceMap();
        ownerService = new OwnerServiceMap();
        veterinarianService = new VeterinarianServiceMap();
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Ravel");
        owner.setLastName("Melo");
        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Karol");
        owner1.setLastName("Lima");
        ownerService.save(owner1);

        System.out.println("Loaded Owners");

        Veterinarian vet = new Veterinarian();
        vet.setId(1L);
        vet.setFirstName("Fernando");
        vet.setLastName("Vasconcelos");
        vet.setVetCode("VET01345");
        veterinarianService.save(vet);

        Veterinarian vet1 = new Veterinarian();
        vet1.setId(1L);
        vet1.setFirstName("Antonio");
        vet1.setLastName("Vasconcelos");
        vet1.setVetCode("VET01344");

        veterinarianService.save(vet1);

        System.out.println("Loading vets ...");

        PetType petType = new PetType();
        petType.setName("Shitzu");
        petType.setId(1L);
        Pet pet = new Pet();
        pet.setOwner(owner);
        pet.setId(1L);
        pet.setPetType(petType);
        pet.setBirthDate(LocalDate.now());

        petService.save(pet);

        System.out.println("Loading Pet");





    }
}
