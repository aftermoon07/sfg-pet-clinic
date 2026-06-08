package guru.springframework.petclinicdata.model;

public class Person extends BaseEntity {

    private String firstName;
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