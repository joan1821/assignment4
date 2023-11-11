package com.example.animalslaughterhouse.percistance;

import com.example.animalslaughterhouse.api.model.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

@Service
public class SlaughterService {
    private List<Animal> animals;

    public SlaughterService() {
        this.animals = new ArrayList<>();
        animals.add(new Animal("cow","01/01/2011",110.23,
                112,"The British slaughterHouse"));
        animals.add(new Animal("cat","01/01/2011",1.23,
                122,"The British slaughterHouse"));
        animals.add(new Animal("sheep","02/02/2012",33.45,
                113,"The Italian slaughterHouse"));
        animals.add(new Animal("ox","03/03/2013",50.67,
                114,"The French slaughterHouse"));
        animals.add(new Animal("turkey","04/04/2014",10.78,
                115,"The Sweedish slaughterHouse"));
        animals.add(new Animal("chicken","05/05/2015",50.23,
                116,"The Danish slaughterHouse"));

    }
    public List<Animal> getAllAnimals()
    {
        return animals;
    }


    public List<Animal> getALLanimalsByDate(String date)
    {
        List<Animal> existing= new ArrayList<>();
        for (Animal animal: animals) {
            if (animal.getDate().equals(date))
                existing.add(animal);
        }
        return existing;
    }



}
