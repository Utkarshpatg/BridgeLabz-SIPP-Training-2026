package oop.abstractDemo;

public class Daughter extends Parent {
    public Daughter(int age){
        super(age);
    }
    @Override
    void career() {

        System.out.println("hiii i am a girl");
    }

    @Override
    void partner() {

        System.out.println("hii partner girl");
    }
}
