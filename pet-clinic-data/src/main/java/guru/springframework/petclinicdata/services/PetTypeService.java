package guru.springframework.petclinicdata.services;

import guru.springframework.petclinicdata.model.PetType;

// 💡 FIXED: Cleaned up the file to extend CrudService cleanly without adding secondary lowercase typo contracts
public interface PetTypeService extends CrudService<PetType, Long> {
}