package com.example.springdatajpa_hometask.Service.Impl;

import com.example.springdatajpa_hometask.Repository.*;
import com.example.springdatajpa_hometask.Service.VehiclePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiclePriceServiceImpl implements VehiclePriceService {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehiclePriceServiceImpl(VehicleRepository vehicleRepository, CarRepository carRepository, BikeRepository bikeRepository, PlaneRepository planeRepository, TruckRepository truckRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Double getAveragePrice() {
        return vehicleRepository.findAll().stream()
                .mapToDouble(v -> v.getPrice().doubleValue())
                .average().orElse(Double.NaN);
    }

    @Override
    public Double getMinPrice() {
        return vehicleRepository.findAll()
                .stream()
                .mapToDouble(v -> v.getPrice().doubleValue())
                .min().orElse(Double.NaN);
    }

    @Override
    public Double getMaxPrice() {
        return vehicleRepository.findAll()
                .stream()
                .mapToDouble(v -> v.getPrice().doubleValue())
                .max().orElse(Double.NaN);
    }
}
