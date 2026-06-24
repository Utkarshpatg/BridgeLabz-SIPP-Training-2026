package oop.Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("power Engine start");
    }

    @Override
    public void stop() {
        System.out.println("power Engine stop");

    }

    @Override
    public void acc() {
        System.out.println("power Engine accelerate");

    }
}
