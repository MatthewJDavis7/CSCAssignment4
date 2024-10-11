package CSC.example.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;


    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalById(int animalId) {
        return animalRepository.findById(animalId).orElse(null);
    }


    public List<Animal> getAnimalsBySpecies(String species) {
        return animalRepository.getAnimalsBySpecies(species);
    }


    public void addNewAnimal(Animal animal) {
        animalRepository.save(animal);
    }


    public void updateAnimal(int animalId, Animal animal) {
        Animal existing = getAnimalById(animalId);
        existing.setName(animal.getName());
        existing.setSpecies(animal.getSpecies());

        //Technically the 4 lines above are not necessary because the save method merges by default.
        animalRepository.save(existing);
    }


    public void deleteAnimalById(int animalId) {
        animalRepository.deleteById(animalId);
    }
}