package com.example.carshop.dao;

import com.example.carshop.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OptionRepository extends JpaRepository<Option, Integer> {

    @Transactional(readOnly = true)
    List<Option> findAll();
}
