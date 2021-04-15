package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car car = new Car("Ferrari", "488 Italia", 320.8f, 200.24f);
        car.refuelToFull();
        car.increaseMaximumSpeed(324.55f);
        car.increaseTravelKilometer(33.7f);
        car.speedUp(150.4f);
        car.slowDown(48.7f);
//        car.stop();
        car.refuel(54.32f);
        car.price();
        System.out.println(car.toString());
    }
}
