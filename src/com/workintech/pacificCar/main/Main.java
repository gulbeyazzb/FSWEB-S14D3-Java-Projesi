package com.workintech.pacificCar.main;

import com.workintech.pacificCar.Car;
import com.workintech.pacificCar.Ford;
import com.workintech.pacificCar.Holden;
import com.workintech.pacificCar.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        car.startEnginee();

        car.accelerate();

        car.brake();

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        mitsubishi.startEnginee();

        mitsubishi.accelerate();

        mitsubishi.brake();

        Car ford = new Ford(6, "Ford Falcon");

        ford.startEnginee();

        ford.accelerate();

        ford.brake();

        Car holden = new Holden(6, "Holden Commodore");

        holden.startEnginee();

        holden.accelerate();

        holden.brake();
    }
}
