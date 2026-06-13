package guru.springframework.petclinicdata.services.map;

import guru.springframework.petclinicdata.model.petType;
import guru.springframework.petclinicdata.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<petType, Long> implements PetTypeService {
    @Override
    public Set<petType> findAll() {
        return super.findAll();
    }

    @Override
    public petType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public petType save(petType object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) { // 💡 FIXED: Capitalized to 'deleteById' to match core CrudService contracts
        super.deleteById(id);
    }

    @Override
    public void delete(petType object) {
        super.delete(object);
    }
}
