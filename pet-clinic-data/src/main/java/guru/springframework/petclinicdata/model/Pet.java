package guru.springframework.petclinicdata.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private petType petType;
    private Owner owner;
    private LocalDate birthDate;

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
}
