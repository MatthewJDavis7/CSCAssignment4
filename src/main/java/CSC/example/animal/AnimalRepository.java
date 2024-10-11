package CSC.example.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Provides the actual database transactions.
 */
@Repository
public interface AnimalRepository  extends JpaRepository<Animal, Integer> {

    List<Animal> getAnimalsBySpecies(String species);

    @Query(value = "select * from animals a where lower(a.name) like lower(concat('%', :name, '%'))", nativeQuery = true)
    List<Animal> getAnimalsByName(String name);

}
