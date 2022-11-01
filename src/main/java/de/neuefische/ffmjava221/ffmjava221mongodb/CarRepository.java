package de.neuefische.ffmjava221.ffmjava221mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CarRepository extends MongoRepository<Car, String> {

    List<Car> findByManufacturer(String manufacturer);

    /*
        @Query("advanced mongodb queries here")
        Car findByXYZ();
    */
}
