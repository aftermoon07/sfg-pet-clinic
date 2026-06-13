package guru.springframework.petclinicdata.repositories;

import guru.springframework.petclinicdata.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
