package guru.springframework.petclinicdata.services.map;

import guru.springframework.petclinicdata.model.BaseEntity; // 👈 Crucial import
import guru.springframework.petclinicdata.model.Specialty;

import java.util.*;

// 💡 Update generics: T must extend BaseEntity so we can access getId() and setId()
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public abstract Specialty findByid(Long id);

    // 💡 Refactored Save Method: Automatically manages ID generation
    public T save(T object) {
        if (object != null) {
            if (object.getId() == null) { // If no ID exists, auto-generate one
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    // 💡 Private helper method to generate sequential IDs (1, 2, 3...)
    private Long getNextId() {
        Long nextId = null;
        try {
            // Finds the current maximum ID in the map keyset and adds 1
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            // If the map is completely empty, start at ID 1
            nextId = 1L;
        }
        return nextId;
    }
}