package guru.springframework.petclinicdata.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {
    private petType  petType;
    private Owner owner;
    private LocalDate date;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
