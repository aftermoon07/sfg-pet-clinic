package guru.springframework.petclinicdata.services;

import guru.springframework.petclinicdata.model.Owner;

import java.util.Set;

public interface OwnerService
{
    Owner findbyId(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
