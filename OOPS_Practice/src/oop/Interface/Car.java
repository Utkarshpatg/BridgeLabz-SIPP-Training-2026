package oop.Interface;

public class Car implements Engine,Brake,Media{

    @Override
    public void brake() {
        System.out.println("i breake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a noraml car");

    }

    @Override
    public void acc() {
        System.out.println("i accelerate like a normal car");
    }
}
