package com.example.carshop.entity;

import com.example.carshop.base.BaseEntity;
import com.example.carshop.option_selected.OptionSelected;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "CAR")
public class Car extends BaseEntity {

    @Column(name = "MAKE")
    private String make;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "TRANSMISSION")
    private String transmission;

    @Column(name = "ENGINE")
    private String engine;

    @Column(name = "FUEL_TYPE")
    private String fuelType;

    @Column(name = "EDITION")
    private String edition;

    @Column(name = "PRICE", precision = 10, scale = 2)
    private BigDecimal price;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "car_id")
    private List<OptionSelected> selectedOptions;
}
