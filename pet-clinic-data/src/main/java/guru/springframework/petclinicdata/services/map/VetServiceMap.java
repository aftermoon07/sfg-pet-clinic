package guru.springframework.petclinicdata.services.map;

import guru.springframework.petclinicdata.model.Vet;
import guru.springframework.petclinicdata.services.CrudService;
import java.util.Set;

// Extends the generic map wrapper and implements the generic CrudService contract
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll(); // Delegates directly to the underlying abstract map engine
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id); // Maps the lookup key cleanly
    }

    @Override
    public Vet save(Vet object) {
        // Links the Vet entity primary key to the abstract map storage
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object); // Safely filters out the entity instance
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); // Safely clears the identifier mapping key
    }
}