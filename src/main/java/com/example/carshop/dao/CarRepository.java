package com.example.carshop.dao;

import com.example.carshop.entity.Car;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


public interface CarRepository extends JpaRepository<Car, Integer> {

    @Transactional(readOnly = true)
    List<Car> findAll();

    @Transactional
    Optional<Car> findById(Integer id);

    @Transactional
    Car save(Car car) throws DataAccessException;

    @Transactional
    void delete(Car car);
}
