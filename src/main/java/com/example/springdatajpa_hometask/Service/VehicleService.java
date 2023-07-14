package com.example.springdatajpa_hometask.Service;

import java.math.BigDecimal;

public interface VehicleService {
    BigDecimal getAveragePrice();
    void analyzePrices();
}
