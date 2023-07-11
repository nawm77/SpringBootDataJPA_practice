package com.example.springdatajpa_hometask.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
public class Truck extends Vehicle{
    private final static String TYPE = "Truck";
    private Double loadCapacity;

    public Truck(String model, BigDecimal price, String fuelType, Double loadCapacity) {
        super(TYPE, model, price, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model=" + this.getModel() + '\'' +
                ", loadCapacity=" + this.getLoadCapacity() + '\'' +
                ", price=" + this.getPrice() + '\'' +
                ", fuel type=" + this.getFuelType() +
                '}';
    }
}
