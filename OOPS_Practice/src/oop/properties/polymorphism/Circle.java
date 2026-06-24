package oop.properties.polymorphism;

public class Circle extends Shapes{
    // this will runwhen obj of circle is created
    // hence it is overriding the parent method
    @Override   // this is called annotation
    void area(){
        System.out.println("area pie * r * r");
    }
}
