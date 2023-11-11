package com.example.animalslaughterhouse.api.controller;


import com.example.animalslaughterhouse.api.model.Animal;
import com.example.animalslaughterhouse.percistance.SlaughterService;
import org.apache.catalina.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animal/")
public class AnimalController {
    private SlaughterService slaughterService;

    @Autowired

    public AnimalController(SlaughterService slaughterService) {
        this.slaughterService = slaughterService;
    }

    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals() {
        return new ResponseEntity<>(slaughterService.getAllAnimals(), HttpStatus.OK);
    }


    @GetMapping("date/")
    public ResponseEntity<List<Animal>> getAllAnimalsByDate(String date) {
        List<Animal> existing = slaughterService.getALLanimalsByDate(date);

            if (!(existing.equals(slaughterService.getAllAnimals())))


        return new ResponseEntity<>(existing, HttpStatus.OK);
        return null;
    }
}
