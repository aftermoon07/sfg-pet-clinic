package guru.springframework.petclinicdata.services.map;

import guru.springframework.petclinicdata.model.Pet;
import guru.springframework.petclinicdata.services.CrudService;
import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll(); // Delegates directly to the underlying abstract map engine
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object); // Links the Pet entity primary key to the storage engine
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}