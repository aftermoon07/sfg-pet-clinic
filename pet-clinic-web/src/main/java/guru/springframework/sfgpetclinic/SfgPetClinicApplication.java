package guru.springframework.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
        "guru.springframework.sfgpetclinic",
        "guru.springframework.petclinicdata"
})
@EnableJpaRepositories("guru.springframework.petclinicdata.repositories")
@EntityScan("guru.springframework.petclinicdata.model")
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgPetClinicApplication.class, args);
    }
}
