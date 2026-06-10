package guru.springframework.petclinicdata.services.map;

import guru.springframework.petclinicdata.model.PetType;
import guru.springframework.petclinicdata.services.PetTypeService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) { // 💡 FIXED: Capitalized to 'deleteById' to match core CrudService contracts
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
}