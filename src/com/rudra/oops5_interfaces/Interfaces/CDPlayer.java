package com.rudra.oops5_interfaces.Interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("start music");
    }

    @Override
    public void stop() {
     System.out.println("stop music");
    }
}
