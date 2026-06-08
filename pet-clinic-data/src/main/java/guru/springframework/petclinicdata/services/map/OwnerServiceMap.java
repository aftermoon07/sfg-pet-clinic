package guru.springframework.petclinicdata.services.map;

import guru.springframework.petclinicdata.model.Owner;
import guru.springframework.petclinicdata.services.OwnerService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service // Registers it smoothly into the Spring Context
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll(); // Delegates directly to your abstract parent map engine
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id); // Performs standard primary key lookup
    }

    @Override
    public Owner save(Owner object) {
        // Automatically manages the entity primary key tracking
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null; // Required interface placeholder contract
    }
} // 👈 This single closing brace now perfectly wraps ALL your methods inside the class boundaries!