package com.company;

import java.util.Scanner;
public class Car {
    Scanner scan = new Scanner(System.in);

    protected String brand;
    protected String model;
    protected float maximumSpeed;
    protected float currentSpeed;
    protected float numberOfKilometersTraveled;
    protected float tankCapacity;
    protected float amountOfFuelInTheTank;

    public Car(){}

    public Car(String brand, String model, float maximumSpeed, float tankCapacity) {
        this.brand = brand;
        this.model = model;
        this.maximumSpeed = maximumSpeed;
        this.currentSpeed = 0;
        this.numberOfKilometersTraveled = 0;
        this.tankCapacity = tankCapacity;
        this.amountOfFuelInTheTank = 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getMaximumSpeed() {
        return maximumSpeed;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }

    public float getNumberOfKilometersTraveled() {
        return numberOfKilometersTraveled;
    }

    public float getTankCapacity() {
        return tankCapacity;
    }

    public float getAmountOfFuelInTheTank() {
        return amountOfFuelInTheTank;
    }

    public String toString(){
        return "Car brand: " + getBrand() + "\n"
                + "Car model: " + getModel() + "\n"
                + "Car maximum speed: " + getMaximumSpeed() + "\n"
                + "Car current speed: " + getCurrentSpeed() + "\n"
                + "Car mileage: " + getNumberOfKilometersTraveled() + "\n"
                + "Car tank capacity: " + getTankCapacity() + "\n"
                + "Car tank amount of fuel: " + getAmountOfFuelInTheTank();
    }

    public void increaseMaximumSpeed(float maximumSpeed){
        this.maximumSpeed = maximumSpeed;
    }

    public void increaseTravelKilometer(float numberOfKilometersTraveled){
        if(this.numberOfKilometersTraveled * 4 <= amountOfFuelInTheTank) {
            this.numberOfKilometersTraveled += numberOfKilometersTraveled;
            this.amountOfFuelInTheTank -= this.numberOfKilometersTraveled * 4;
        }else
            stop();
    }

    public void speedUp(float increaseSpeedTo){
        if(increaseSpeedTo < maximumSpeed - this.currentSpeed)
            this.currentSpeed += increaseSpeedTo;
    }

    public void slowDown(float decreaseSpeedTo){
        this.currentSpeed -= decreaseSpeedTo;
    }

    public void stop(){
        currentSpeed = 0;
        System.out.println("Car has stopped!");
    }

    public void refuel(float increaseFuel){
        if(this.amountOfFuelInTheTank + increaseFuel <= tankCapacity)
            this.amountOfFuelInTheTank += increaseFuel;
    }

    public void refuelToFull(){
        this.amountOfFuelInTheTank = tankCapacity;
    }

    public boolean empty(){
        return amountOfFuelInTheTank == 0;
    }

    public boolean full(){
        return amountOfFuelInTheTank == tankCapacity;
    }

    public void startNewJourney(){
        numberOfKilometersTraveled = 0;
    }

    public float price(){
        float priceOfLiter = 3.0f;
        float carCombustion = 15.5f;
        return numberOfKilometersTraveled * carCombustion * priceOfLiter;
    }

    public void displayData(){
        System.out.println(getBrand() + '\n'
                + getModel() + '\n'
                + getMaximumSpeed() + '\n'
                + getCurrentSpeed() + '\n'
                + getNumberOfKilometersTraveled() + '\n'
                + getTankCapacity() + '\n'
                + getAmountOfFuelInTheTank() + '\n'
                + "You can add fuel : " + (tankCapacity-amountOfFuelInTheTank));
    }
}
