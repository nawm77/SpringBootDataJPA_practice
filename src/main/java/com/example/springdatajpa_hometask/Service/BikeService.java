package com.example.springdatajpa_hometask.Service;

import com.example.springdatajpa_hometask.Model.Bike;

import java.util.List;
import java.util.Optional;

public interface BikeService {
    void saveBike(Bike bike);
    void saveListOfBikes(List<Bike> bikes);
    void deleteBike(Bike bike);
    void deleteBikeById(Long id);
    Optional<Bike> findBikeById(Long id);
    List<Bike> findAllBikes();
    List<Bike> findAllBikesByModel(String model);
}
