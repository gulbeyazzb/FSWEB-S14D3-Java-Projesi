package com.workintech.pacificCar;

import java.util.Objects;

public class Car {
    private boolean engine;

    private int cylinders;

    private String name;

    private int wheels;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine=true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public void startEnginee(){
        System.out.println("the car's engine is starting");
    }

    public void accelerate(){
        System.out.println("the car is accelerating");
    }

    public void brake() {
        System.out.println("the car is braking");
    }
}
