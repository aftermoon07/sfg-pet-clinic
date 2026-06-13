package guru.springframework.petclinicdata.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pets")

public class Pet extends BaseEntity {
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private petType petType;

    @ManyToOne
    @JoinColumn(name =  "owner_id")
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;


    private Set<Visit> visits= new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public petType getPetType() {
        return petType;
    }

    public void setPetType(petType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }
}
