package com.example.springdatajpa_hometask.Repository;

import com.example.springdatajpa_hometask.Model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
}
