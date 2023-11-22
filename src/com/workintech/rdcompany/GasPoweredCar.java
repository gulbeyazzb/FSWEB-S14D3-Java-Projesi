package com.workintech.rdcompany;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, int cylinders, double avgKmPerLitre) {
        super(name, description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public boolean startEngine() {
        if (cylinders >= 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void drive(CarSkeleton car) {
        if (startEngine()) {
            System.out.println("gas powered car's enginee is starting");
            runEngine(car);
            System.out.println("gas powered car can be driven");
        } else {
            System.out.println("gas powered car's enginee is not starting because batterySize is low");
            System.out.println("gas powered car can not be driven");
        }
    }

}
