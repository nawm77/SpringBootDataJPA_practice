package com.example.springdatajpa_hometask.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
public class Plane extends Vehicle{
    private final static String TYPE = "Plane";
    private String airline;
    private Integer passengerCapacity;

    public Plane(String model, BigDecimal price, String fuelType, String airline, Integer passengerCapacity) {
        super(TYPE, model, price, fuelType);
        this.airline = airline;
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + this.getModel() + '\'' +
                ", price=" + this.getPrice() + '\'' +
                ", fuel type=" + this.getFuelType() + '\'' +
                ", airline=" + this.getAirline() + '\'' +
                ", passengerCapacity=" + this.getPassengerCapacity() +
                '}';
    }
}
