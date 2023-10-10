package com.example.carshop.option_selected;

import com.example.carshop.base.BaseEntity;
import com.example.carshop.entity.Car;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "OPTION_SELECTED")
public class OptionSelected extends BaseEntity {

    @Column(name = "car_id")
    private Integer carId;

    @Column(name = "option_id")
    private Integer selectedOption;

    @Column(name = "price")
    private BigDecimal price;
}
