package com.rudra.oops5_interfaces.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine accelerate");
    }
}
