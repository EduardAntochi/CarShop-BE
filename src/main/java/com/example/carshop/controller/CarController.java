package com.example.carshop.controller;

import com.example.carshop.dao.CarRepository;
import com.example.carshop.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
@CrossOrigin("http://localhost:4200/")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/allcars")
    public @ResponseBody List<Car> cars() {
        List<Car> cars = carRepository.findAll();
        System.out.println(String.format("All Cars: %d", cars.size()));
        return cars;
    }

    @GetMapping("/car/{carId}")
    public @ResponseBody Car getCar(@PathVariable("carId") Integer carId) {
        Optional<Car> car = carRepository.findById(carId);
        System.out.println(String.format("Getting a car: %s", car));
        return car.get();
    }

    @PostMapping("/updateCarDetails")
    public @ResponseBody String updateCarDetails(@RequestBody Car car) {
        System.out.println(String.format("Update Car: %s", car));
        carRepository.save(car);
        return "";
    }

    @PostMapping("/new-car")
    public @ResponseBody Car newCar(@RequestBody Car car) {
        System.out.println(String.format("Save Car: %s", car));
        return carRepository.save(car);
    }

    @PostMapping("/delete-car")
    public @ResponseBody String deleteCar(@RequestBody Car car) {
        System.out.println(String.format("Save Car: %s", car));
        carRepository.delete(car);
        return "";
    }
}
