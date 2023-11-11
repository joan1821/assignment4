package com.example.animalslaughterhouse.api.model;

import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Animal {

    private String animalName;
    private String date;

    private double weight;

    private int registrationNumber;

    private String origin;

    public Animal(String animalName, String date, double weight,
                  int registrationNumber, String origin) {
        this.animalName = animalName;
        this.date = date;
        this.weight = weight;
        this.registrationNumber = registrationNumber;
        this.origin = origin;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }



}


