package de.neuefische.ffmjava221.ffmjava221mongodb;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService service;

    @GetMapping
    List<Car> getCars() {
        return service.getCars();
    }

    @PutMapping
    Car save(@RequestBody  Car car) {
        return service.save(car);
    }

}
