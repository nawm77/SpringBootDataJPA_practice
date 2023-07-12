package com.example.springdatajpa_hometask.Repository;

import com.example.springdatajpa_hometask.Model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {
    List<Plane> findAllByModel(String model);
}
