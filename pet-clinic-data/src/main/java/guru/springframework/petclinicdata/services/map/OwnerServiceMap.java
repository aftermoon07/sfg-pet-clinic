package guru.springframework.petclinicdata.services.map;

import guru.springframework.petclinicdata.model.Owner;

import guru.springframework.petclinicdata.services.OwnerService;

import java.util.Set;
@org.springframework.stereotype.Service
// Implements CrudService directly to match the instructor's exact video layout
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll(); // 👈 Fixed: Uses 'super' instead of 'this' to prevent stack loops
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id); // Matches the Long data type mapping cleanly
    }

    @Override
    public Owner save(Owner object) {
        // 👈 Fixed: Uses lowercase 'save' and passes the entity ID to the map engine
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
        return null;
    }
}