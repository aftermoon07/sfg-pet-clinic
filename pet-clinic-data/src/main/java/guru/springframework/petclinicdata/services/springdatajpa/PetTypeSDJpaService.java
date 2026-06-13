package guru.springframework.petclinicdata.services.springdatajpa;

import guru.springframework.petclinicdata.model.petType;
import guru.springframework.petclinicdata.repositories.PetTypeRepository;
import guru.springframework.petclinicdata.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {
    private final PetTypeRepository petTypeRepository;
    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<petType> findAll() {
       Set<petType> petTypes = new HashSet<>();
       petTypeRepository.findAll().forEach(petTypes::add);
        return  petTypes;
    }

    @Override
    public petType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public petType save(petType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(petType object) {
        petTypeRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);

    }
}
