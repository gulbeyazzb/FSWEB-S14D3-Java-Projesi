package com.workintech.rdcompany;

public class CarSkeleton {
    private String name;

    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean startEngine() {
        System.out.println("Car is starting");
        return true;
    }

    protected void runEngine(CarSkeleton car) {
        System.out.println(car.name + "'s enginee is running");
    }

    public void drive(CarSkeleton car) {
        if (startEngine()) {
            runEngine(car);
            System.out.println("car can be driven");
        } else {
            System.out.println("car can not be driven");
        }
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
