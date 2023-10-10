package com.example.carshop.controller;

import com.example.carshop.dao.OptionRepository;
import com.example.carshop.entity.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/options")
@CrossOrigin("http://localhost:4200/")
public class OptionController {

    @Autowired
    OptionRepository optionRepository;

    @GetMapping("/all")
    @ResponseBody List<Option> getAllOptions() {
        return optionRepository.findAll();
    }
}
