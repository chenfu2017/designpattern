package com.chenfu.dp.FactoryMethod;


public class CatFactory implements AnimalFactory {

	public Animal createAnimal(){
		return new Cat();
	}

}