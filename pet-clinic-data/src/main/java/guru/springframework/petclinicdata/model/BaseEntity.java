package guru.springframework.petclinicdata.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 👈 Check that this matches your ID field name

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}