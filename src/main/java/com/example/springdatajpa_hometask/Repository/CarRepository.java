package com.example.springdatajpa_hometask.Repository;

import com.example.springdatajpa_hometask.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
