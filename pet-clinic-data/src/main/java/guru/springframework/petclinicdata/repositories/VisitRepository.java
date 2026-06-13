package guru.springframework.petclinicdata.repositories;

import guru.springframework.petclinicdata.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
