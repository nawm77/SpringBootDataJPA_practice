package com.example.springdatajpa_hometask.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
public class Bike extends Vehicle{
    private final static String TYPE = "Bike";
    public Bike(String model, BigDecimal price, String fuelType) {
        super(TYPE, model, price, fuelType);
    }
    @Override
    public String toString(){
        return "Bike{" +
                "model=" + this.getModel() + '\'' +
                ", price=" + this.getPrice() + '\'' +
                ", fuel type =" + this.getFuelType() + "}";
    }
}
