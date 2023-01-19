package Polymorphism;

import org.w3c.dom.ls.LSOutput;

public class CarMain {

    public static void main(String[] args) {

        // Creating a base car from Car class
        Car carBase = new Car("base car", 6);
        System.out.println("\n===== Creating base car from Car class =====");
        System.out.println(carBase.startEngine());
        System.out.println(carBase.accelerate());
        System.out.println(carBase.brake());

        System.out.println("\n===== Creating car from Ferrari class =====");
        Ferrari carOne = new Ferrari("Berlinetta", 12);
        System.out.println(carOne.startEngine());
        System.out.println(carOne.accelerate());
        System.out.println(carOne.brake());

        System.out.println("\n===== Creating car from Land Rover class =====");
        LandRover carTwo = new LandRover("Range Rover", 8);
        System.out.println(carTwo.startEngine());
        System.out.println(carTwo.accelerate());
        System.out.println(carTwo.brake());
    }
}
