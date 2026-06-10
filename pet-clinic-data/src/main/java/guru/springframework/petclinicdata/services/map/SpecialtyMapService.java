package guru.springframework.petclinicdata.services.map;

import guru.springframework.petclinicdata.model.Specialty;
import guru.springframework.petclinicdata.services.SpecialtiesService; // Matches your interface
import org.springframework.stereotype.Service;

import java.util.Set;

@Service // Registers it smoothly into the Spring Context
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtiesService { //

    @Override
    public Set<Specialty> findAll() {
        return super.findAll(); //
    }

    @Override
    public Specialty findById(Long id) { // 💡 FIXED: Strictly 'findById' with a capital 'I'
        return super.findById(id); //
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object); //
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object); //
    }

    @Override
    public void deleteById(Long id) { // 💡 FIXED: Uses capital 'I' to match standard Map signatures
        super.deleteById(id);
    }
}