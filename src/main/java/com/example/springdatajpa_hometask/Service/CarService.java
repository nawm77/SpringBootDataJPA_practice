package com.example.springdatajpa_hometask.Service;

import com.example.springdatajpa_hometask.Model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    void saveCar(Car car);
    void deleteCar(Car car);
    void deleteCarById(Long id);
    Optional<Car> findCarById(Long id);
    List<Car> findAllCars();
    List<Car> findAllCarsByModel(String model);
    void saveListOfCars(List<Car> cars);
}
