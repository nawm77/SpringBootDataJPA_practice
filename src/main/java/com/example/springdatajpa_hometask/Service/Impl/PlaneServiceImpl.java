package com.example.springdatajpa_hometask.Service.Impl;

import com.example.springdatajpa_hometask.Model.Plane;
import com.example.springdatajpa_hometask.Repository.PlaneRepository;
import com.example.springdatajpa_hometask.Service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaneServiceImpl implements PlaneService {
    private final PlaneRepository planeRepository;

    @Autowired
    public PlaneServiceImpl(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }
    public void savePlane(Plane plane){
        planeRepository.saveAndFlush(plane);
    }

    @Override
    public void deletePlane(Plane plane) {
        planeRepository.delete(plane);
    }

    @Override
    public void deletePlaneById(Long id) {
        planeRepository.deleteById(id);
    }

    @Override
    public Optional<Plane> findPlaneById(Long id) {
        return planeRepository.findById(id);
    }

    @Override
    public List<Plane> findAllPlanes() {
        return planeRepository.findAll();
    }

    @Override
    public List<Plane> findAllPlanesByModel(String model) {
        return planeRepository.findAllByModel(model);
    }

    @Override
    public void saveListOfPlanes(List<Plane> planes) {
        planeRepository.saveAllAndFlush(planes);
    }
}
