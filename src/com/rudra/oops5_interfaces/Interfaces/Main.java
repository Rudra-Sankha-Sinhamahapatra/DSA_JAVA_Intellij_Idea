package com.rudra.oops5_interfaces.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car=new Car();
        Engine car=new Car();

        car.accelerate();
        car.start();
        car.stop();

        Media carMedia=new Car();
        carMedia.stop();

        NiceCar car2=new NiceCar();
        car2.start();
        car2.startMusic();
        car2.upgradeEngine();
        car2.start();
    }
}
