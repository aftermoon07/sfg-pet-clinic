package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.petclinicdata.model.Owner;
import guru.springframework.petclinicdata.model.Pet;
import guru.springframework.petclinicdata.model.PetType;
import guru.springframework.petclinicdata.model.Vet;
import guru.springframework.petclinicdata.services.OwnerService;
import guru.springframework.petclinicdata.services.PetTypeService;
import guru.springframework.petclinicdata.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    // 💡 FIXED: Clean constructor mapping with exactly 2 parameters
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog=new PetType();
        dog.setName("Dog");
        PetType savedDogPetType=petTypeService.save(dog);


        PetType cat=new PetType();
        cat.setName("Cat");
        PetType savedCatPetType=petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Main St");
        owner1.setCity("Miami");
        owner1.setTelephone("1234567890");
        Pet mikesPet=new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setName("Rosco");
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("456 Main St");
        owner2.setCity("Miami");
        owner2.setTelephone("987654321");
        ownerService.save(owner2);
        Pet fionaCat=new Pet();
        fionaCat.setName("Meow");
        fionaCat.setPetType(savedCatPetType);
        fionaCat.setBirthDate(LocalDate.now());
        fionaCat.setOwner(owner2);
        owner2.getPets().add(fionaCat);
        petTypeService.save(savedCatPetType);
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