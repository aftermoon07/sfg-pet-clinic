package guru.springframework.petclinicdata.services.map;

import guru.springframework.petclinicdata.model.Specialty;
import guru.springframework.petclinicdata.services.SpecialtiesService; // 💡 Matches the video typo import
import org.springframework.stereotype.Service;

import java.util.Set;

@Service // 💡 Registers it into the Spring Context
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtiesService { //
    @Override
    public Set<Specialty> findAll() {
        return super.findAll(); //
    }

    @Override
    public Specialty findByid(Long id) {
        return super.findById(id); //
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object); //
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object); //
    }
}