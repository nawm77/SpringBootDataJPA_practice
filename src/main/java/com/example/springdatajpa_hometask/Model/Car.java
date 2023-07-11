package com.example.springdatajpa_hometask.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
public class Car extends Vehicle{
    private final static String TYPE = "Car";
    private Integer seats;

    public Car(String model, BigDecimal price, String fuelType, Integer seats) {
        super(TYPE, model, price, fuelType);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + this.getModel() + '\'' +
                ", price=" + this.getPrice() + '\'' +
                ", fuel type=" + this.getFuelType() + '\'' +
                ", seats=" + this.getSeats() +
                '}';
    }
}
