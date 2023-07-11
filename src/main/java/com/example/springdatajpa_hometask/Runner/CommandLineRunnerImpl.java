package com.example.springdatajpa_hometask.Runner;

import com.example.springdatajpa_hometask.Model.Bike;
import com.example.springdatajpa_hometask.Model.Car;
import com.example.springdatajpa_hometask.Model.Plane;
import com.example.springdatajpa_hometask.Model.Truck;
import com.example.springdatajpa_hometask.Repository.BikeRepository;
import com.example.springdatajpa_hometask.Repository.CarRepository;
import com.example.springdatajpa_hometask.Repository.PlaneRepository;
import com.example.springdatajpa_hometask.Repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private final BikeRepository bikeRepository;
    private final CarRepository carRepository;
    private final PlaneRepository planeRepository;
    private final TruckRepository truckRepository;

    @Autowired
    public CommandLineRunnerImpl(BikeRepository bikeRepository, CarRepository carRepository, PlaneRepository planeRepository, TruckRepository truckRepository) {
        this.bikeRepository = bikeRepository;
        this.carRepository = carRepository;
        this.planeRepository = planeRepository;
        this.truckRepository = truckRepository;
    }

    @Override
    public void run(String... args){
        try{
            seedData();
            bikeRepository.findAll().forEach(System.out::println);
            carRepository.findAll().forEach(System.out::println);
            planeRepository.findAll().forEach(System.out::println);
            truckRepository.findAll().forEach(System.out::println);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void seedData(){
        bikeRepository.save(new Bike("Giant", BigDecimal.valueOf(30000), "noFuel"));
        bikeRepository.save(new Bike("Cannondale", BigDecimal.valueOf(50000), "noFuel"));
        bikeRepository.save(new Bike("Scott", BigDecimal.valueOf(100000), "noFuel"));
        carRepository.save(new Car("BMW", BigDecimal.valueOf(3000000), "Diesel", 5));
        carRepository.save(new Car("Mercedes Benz", BigDecimal.valueOf(2000000), "Electro", 5));
        carRepository.save(new Car("Audi", BigDecimal.valueOf(2500000), "Diesel", 2));
        planeRepository.save(new Plane("Airbus A321neo", BigDecimal.valueOf(30000000), "kerosene", "S7", 140));
        planeRepository.save(new Plane("Boeing 747", BigDecimal.valueOf(50000000), "kerosene", "Air China", 8));
        planeRepository.save(new Plane("Airbus A380", BigDecimal.valueOf(50000000), "kerosene", "Singapore Airlines", 340));
        truckRepository.save(new Truck("MAN TGX", BigDecimal.valueOf(12000000), "Diesel", 30.5));
        truckRepository.save(new Truck("Mercedes Benz Actros", BigDecimal.valueOf(14000000), "Diesel", 32D));
        truckRepository.save(new Truck("Renault Premium Lander", BigDecimal.valueOf(8000000), "Diesel", 18D));
    }
}
