package guru.springframework.petclinicdata.services;

import guru.springframework.petclinicdata.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findbyId(Long id);
    Vet save(Vet Vet);
    Set<Vet> findAll();
}
