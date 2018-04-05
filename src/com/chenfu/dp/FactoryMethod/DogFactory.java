package com.chenfu.dp.FactoryMethod;


public class DogFactory implements AnimalFactory {

	public Animal createAnimal(){
		return new Dog();
	}

}