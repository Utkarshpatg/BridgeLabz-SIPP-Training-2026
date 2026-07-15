package oop.abstractDemo;

public class Son extends Parent {
    public Son(int age){
        super(age);
    }
    @Override
    void normal(){
        super.normal();
    }
    @Override
    void career() {

        System.out.println("hiii i am boy");
    }

    @Override
    void partner() {

        System.out.println("hii partner boy");
    }
}
