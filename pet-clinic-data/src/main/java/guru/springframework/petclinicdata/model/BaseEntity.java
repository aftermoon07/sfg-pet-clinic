package guru.springframework.petclinicdata.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id; // 👈 Check that this matches your ID field name

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}