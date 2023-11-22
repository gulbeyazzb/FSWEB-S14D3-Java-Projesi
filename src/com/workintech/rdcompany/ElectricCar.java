package com.workintech.rdcompany;

public class ElectricCar extends CarSkeleton{


    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String name, String description,int batterySize, double avgKmPerCharge) {
        super(name, description);
        this.batterySize=batterySize;
        this.avgKmPerCharge=avgKmPerCharge;
    }

    @Override
    public boolean startEngine() {
        if(batterySize>20){
            return true;
        }else{
            return false;
        }
    }

   @Override
    public void drive(CarSkeleton car) {
        if (startEngine()) {
            System.out.println("electric car's enginee is starting");
            runEngine(car);
            System.out.println("electric car can be driven");
        } else {
            System.out.println("electric car's enginee is not starting because batterySize is low");
            System.out.println("electric car can not be driven");
        }
    }



}
