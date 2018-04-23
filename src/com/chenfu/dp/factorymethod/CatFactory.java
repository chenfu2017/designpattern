package com.chenfu.dp.factorymethod;


public class CatFactory implements AnimalFactory {

	public Animal createAnimal(){
		return new Cat();
	}

}