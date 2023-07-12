package com.example.springdatajpa_hometask.Runner;

import com.example.springdatajpa_hometask.Model.Bike;
import com.example.springdatajpa_hometask.Model.Car;
import com.example.springdatajpa_hometask.Model.Plane;
import com.example.springdatajpa_hometask.Model.Truck;
import com.example.springdatajpa_hometask.Service.BikeService;
import com.example.springdatajpa_hometask.Service.CarService;
import com.example.springdatajpa_hometask.Service.PlaneService;
import com.example.springdatajpa_hometask.Service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private final CarService carService;
    private final BikeService bikeService;
    private final TruckService truckService;
    private final PlaneService planeService;

    @Autowired
    public CommandLineRunnerImpl(CarService carService, BikeService bikeService, TruckService truckService, PlaneService planeService) {
        this.carService = carService;
        this.bikeService = bikeService;
        this.truckService = truckService;
        this.planeService = planeService;
    }

    @Override
    public void run(String... args){
        try{
            seedData();
            carService.findAllCars().forEach(System.out::println);
            bikeService.findAllBikes().forEach(System.out::println);
            planeService.findAllPlanes().forEach(System.out::println);
            planeService.findAllPlanesByModel("Boeing 747").forEach(System.out::println);
            truckService.findAllTruck().forEach(System.out::println);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void seedData(){
        carService.saveListOfCars(List.of(new Car("BMW", BigDecimal.valueOf(3000000), "Diesel", 5),
                new Car("Mercedes Benz", BigDecimal.valueOf(2000000), "Electro", 5),
                new Car("Audi", BigDecimal.valueOf(2500000), "Hybrid", 2))
        );
        bikeService.saveListOfBikes(List.of(new Bike("Giant", BigDecimal.valueOf(30000), "noFuel"),
                new Bike("Cannondale", BigDecimal.valueOf(50000), "noFuel"),
                new Bike("Scott", BigDecimal.valueOf(100000), "noFuel")));
        planeService.saveListOfPlanes(List.of(new Plane("Airbus A321neo", BigDecimal.valueOf(30000000), "kerosene", "S7", 140),
                new Plane("Boeing 747", BigDecimal.valueOf(50000000), "kerosene", "Air China", 8),
                new Plane("Airbus A380", BigDecimal.valueOf(50000000), "kerosene", "Singapore Airlines", 340)));
        truckService.saveListOfTruck(List.of(new Truck("MAN TGX", BigDecimal.valueOf(12000000), "Diesel", 30.5),
                new Truck("Mercedes Benz Actros", BigDecimal.valueOf(14000000), "Diesel", 32D),
                new Truck("Renault Premium Lander", BigDecimal.valueOf(8000000), "Diesel", 18D)));
    }
}
