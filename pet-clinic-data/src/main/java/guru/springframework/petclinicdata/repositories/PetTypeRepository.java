package guru.springframework.petclinicdata.repositories;

import guru.springframework.petclinicdata.model.petType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<petType, Long> {

}
