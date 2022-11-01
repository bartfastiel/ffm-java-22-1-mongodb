package de.neuefische.ffmjava221.ffmjava221mongodb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository repository;

    public List<Car> getCars() {
        return repository.findAll();
    }

    public Car save(Car car) {
        return repository.save(car);
    }

    public Optional<Car> findById(String id) {
        return repository.findById(id);
    }

    public List<Car> findByManufacturer(String manufacturer) {
        return repository.findByManufacturer(manufacturer);
    }
}
