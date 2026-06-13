package guru.springframework.petclinicdata.model;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name="first name")
    private String firstName;

    @Column(name = "last name")
    private String lastName;

    // 🚨 CRUCIAL: Thymeleaf requires these exact public getter names!
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}