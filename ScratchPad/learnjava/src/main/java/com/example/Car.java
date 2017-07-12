package com.example;

/**
 * Created by hannesv on 2017/07/05.
 */

public class Car extends Vechile{
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public void accelerate() {
        System.out.println("Accerating the Car");
    }

    public void turnOnNOS() {
        this.horsepower += 100;
    }
}
