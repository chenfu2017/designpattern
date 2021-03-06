package com.chenfu.dp.simpleFactory;

public class FruitFactory {
    public Fruit create(String classname){
        switch (classname) {
            case "apple":
                return new Apple();
            case "banana":
                return new Banana();
            case "orange":
                return new Orange();
        }
        return null;
    }
}
