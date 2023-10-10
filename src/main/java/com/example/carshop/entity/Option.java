package com.example.carshop.entity;


import com.example.carshop.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "options")
public class Option extends BaseEntity {

    @Column(name = "name")
    private String name;
}
