package com.example;

import Shape.Rectangel;
import Shape.Traingle;

public class MyClass {

    public static void main(String[] args) {

        Person person = new Person("Hannes", "Visser", 26);
        person.speakName();

        Vechile vechile = new Vechile("Honda", "Civic");
        vechile.accelerate();

        Car car = new Car("Chevy", "Camero");

        Bus bus = new Bus("Yellow", "Bus");

        car.addToOdometer(-100);
        car.addToOdometer(500);


        vechile.printDetails();
        car.printDetails();

        System.out.println(car.getOdometer());

        Rectangel rect = new Rectangel();
        rect.calculateArea(5,6);

        Traingle traingle = new Traingle();
        traingle.calculateArea(5,8);

    }
}
