package guru.springframework.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "guru.springframework.sfgpetclinic",    // Scans your web module controllers and loaders
        "guru.springframework.petclinicdata"   // 👈 Crucial: Forces Spring to discover your @Service map beans!
})
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgPetClinicApplication.class, args);
    }
}