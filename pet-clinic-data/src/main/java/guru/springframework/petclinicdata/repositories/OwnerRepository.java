package guru.springframework.petclinicdata.repositories;

import guru.springframework.petclinicdata.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
