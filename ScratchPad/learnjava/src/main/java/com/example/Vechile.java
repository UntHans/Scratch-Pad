package com.example;

/**
 * Created by hannesv on 2017/07/05.
 */

public class Vechile {
    private String make;
    private String model;
    protected int horsepower;
    private int odometer = 0;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOdometer() {
        return odometer;
    }

//    public void setOdometer(int odometer) {
//
//        if (odometer > 0){
//            this.odometer = odometer;
//        }
//    }

    public void addToOdometer(int milesToAdd) {
        if (milesToAdd > 0) {
            this.odometer += milesToAdd;
        }
    }

    public Vechile(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void accelerate(){
        //Write some code to accelerate a vechile
        System.out.println("Accerlating Vechile");
    }

    public void printDetails(){
        System.out.println("Make: " + this.make + " Model: " + this.model);
    }
}
