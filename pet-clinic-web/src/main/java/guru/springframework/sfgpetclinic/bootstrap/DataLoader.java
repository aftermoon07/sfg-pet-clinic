package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.petclinicdata.model.Owner;
import guru.springframework.petclinicdata.model.Vet;
import guru.springframework.petclinicdata.services.OwnerService;
import guru.springframework.petclinicdata.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    // 💡 FIXED: Clean constructor mapping with exactly 2 parameters
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam"); 
        vet1.setLastName("Axe");
        vetService.save(vet1); // 👈 Will now save directly to the wired-up service bean!

        Vet vet2 = new Vet();
        vet2.setFirstName("Jesse");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}