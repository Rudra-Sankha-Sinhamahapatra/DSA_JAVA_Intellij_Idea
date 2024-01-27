package com.rudra.oops5_interfaces.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player=new CDPlayer();
    public NiceCar(){
        engine=new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();//will call powerengine start function because we have declared as powerengine type
    }
    public void stop(){
        engine.stop();//will call powerengine stop function because we have declared as powerengine type
    }
    public void startMusic(){
        player.start();//will call cd player start function because we have declared as cd player type
    }

    public void stopMusic(){
        player.stop();//will call cd player stop function because we have declared as cd player type
    }
    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }
}
