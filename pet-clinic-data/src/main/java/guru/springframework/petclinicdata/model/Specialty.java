package guru.springframework.petclinicdata.model;

public class Specialty extends BaseEntity {
    private String Description;
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        this.Description = description;
    }
}
