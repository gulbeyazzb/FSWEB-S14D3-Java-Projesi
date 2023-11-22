package com.workintech.pacificCar;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEnginee() {
        System.out.println("Mitsubishi's engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi is braking");

    }
}
