package oop.Interface;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.stop();
//        car.acc();

//        Media play = new Car();
//        play.start();            for this we need to create seprate classes for these interfaces


        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
