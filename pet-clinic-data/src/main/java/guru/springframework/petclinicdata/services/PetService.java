package guru.springframework.petclinicdata.services;

import guru.springframework.petclinicdata.model.Pet;

import java.util.Set;

public interface PetService {
   Pet findbyId(Long id);
    Pet save(Pet Pet);
    Set<Pet> findAll();
}
