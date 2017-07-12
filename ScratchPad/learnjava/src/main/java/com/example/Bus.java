package com.example;

/**
 * Created by hannesv on 2017/07/05.
 */

public class Bus extends Vechile {

    public Bus(String make, String model) {
        super(make, model);
    }

    @Override
    public void accelerate() {


        System.out.println("Accerating the bus");
    }
}
