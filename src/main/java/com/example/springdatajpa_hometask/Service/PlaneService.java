package com.example.springdatajpa_hometask.Service;

import com.example.springdatajpa_hometask.Model.Plane;

import java.util.List;
import java.util.Optional;

public interface PlaneService {
    void savePlane(Plane plane);
    void deletePlane(Plane plane);
    void deletePlaneById(Long id);
    Optional<Plane> findPlaneById(Long id);
    List<Plane> findAllPlanes();
    List<Plane> findAllPlanesByModel(String model);
    void saveListOfPlanes(List<Plane> planes);
}
