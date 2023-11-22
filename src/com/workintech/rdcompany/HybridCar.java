package com.workintech.rdcompany;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int batterySize;

    private int cylinders;

    public HybridCar(String name, String description, int batterySize, double avgKmPerLitre,int cylinders) {
        super(name, description);
        this.batterySize = batterySize;
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;

    }

    @Override
    public boolean startEngine() {
        if (batterySize > 20) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void drive(CarSkeleton car) {
        if (startEngine()) {
            System.out.println("HybridCar's enginee is starting");
            runEngine(car);
            System.out.println("Hybrid car can be driven");
        } else {
            System.out.println("HybridCar's enginee is not starting because batterySize is low");
            System.out.println("Hybrid car can not be driven");
        }
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", batterySize=" + batterySize +
                ", cylinders=" + cylinders +
                '}';
    }
}
