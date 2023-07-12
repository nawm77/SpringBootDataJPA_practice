package com.example.springdatajpa_hometask.Repository;

import com.example.springdatajpa_hometask.Model.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
    List<Truck> findAllByModel(String model);
}
