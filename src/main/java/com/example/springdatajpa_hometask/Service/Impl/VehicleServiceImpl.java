package com.example.springdatajpa_hometask.Service.Impl;

import com.example.springdatajpa_hometask.Model.Vehicle;
import com.example.springdatajpa_hometask.Repository.VehicleRepository;
import com.example.springdatajpa_hometask.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public BigDecimal getAveragePrice(){
        return BigDecimal.valueOf(vehicleRepository.findAll().stream()
                .map(Vehicle::getPrice)
                .mapToDouble(BigDecimal::doubleValue)
                .average().getAsDouble());
    }

    @Override
    public void analyzePrices() {
        List<Vehicle> vehicles = vehicleRepository.findAll();
        Optional<BigDecimal> maxPrice = vehicles.stream()
                .map(Vehicle::getPrice)
                .max(Comparator.naturalOrder());
        maxPrice.ifPresent(price ->
                System.out.println("Max price: " + price));
        Optional<BigDecimal> minPrice = vehicles.stream()
                .map(Vehicle::getPrice)
                .min(Comparator.naturalOrder());
        minPrice.ifPresent(price ->
                System.out.println("Min price: " + price));
    }
}
