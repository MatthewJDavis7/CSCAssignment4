package CSC.example.animal;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalId;

    @Column(nullable = false)
    private String name;

    private String species;


    public Animal(int animalId, String name, String species) {
        this.animalId = animalId;
        this.name = name;
        this.species = species;
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Animal() {
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

