package com.example.springdatajpa_hometask.Service.Impl;

import com.example.springdatajpa_hometask.Model.Car;
import com.example.springdatajpa_hometask.Repository.CarRepository;
import com.example.springdatajpa_hometask.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void saveCar(Car car) {
        carRepository.saveAndFlush(car);
    }

    @Override
    public void deleteCar(Car car) {
        carRepository.delete(car);
    }

    @Override
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public Optional<Car> findCarById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> findAllCarsByModel(String model) {
        return carRepository.findAllByModel(model);
    }

    @Override
    public void saveListOfCars(List<Car> cars) {
        carRepository.saveAllAndFlush(cars);
    }
}
