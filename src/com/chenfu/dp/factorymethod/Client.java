package com.chenfu.dp.factorymethod;

public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new CatFactory();
        Animal cat = animalFactory.createAnimal();
        cat.say();
        animalFactory = new DogFactory();
        Animal dog = animalFactory.createAnimal();
        dog.say();
    }
}
