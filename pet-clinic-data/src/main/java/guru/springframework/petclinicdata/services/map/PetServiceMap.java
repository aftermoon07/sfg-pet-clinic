package guru.springframework.petclinicdata.services.map;

import guru.springframework.petclinicdata.model.Pet;
import guru.springframework.petclinicdata.services.PetService;
import org.springframework.stereotype.Service; // 👈 Enforces Spring Component registration
import java.util.Set;

@Service // 👈 Registers PetServiceMap cleanly into the Spring Application Context
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll(); // Delegates directly to your package-private abstract parent engine
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id); // Handles basic memory lookup assignments
    }
    @Override
    public Pet save(Pet object) {
        return super.save(object); // 👈 Clean
    }

    @Override
    public void delete(Pet object) {
        super.delete(object); // Safely filters out the entity instance from memory
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); // Safely drops primary identification keys
    }
}