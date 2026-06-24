package oop.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}


//Polymorphism  ---> poly - many : morphism - way to represent

//types of polymorphism:
//1- compile time/ static polymorphism (achieved via method overloading)
//            method overloading --> same name but types, arguments, return types, ordering can be diffrent.
//            Ex:
//                  multiple constructor:
//                        A a = new A();     ->> compile time polymorphism  / method overloading
//                        A a2 = new A(3,4);

//2- run time / dynamic polymorphism: Achieved by method overriding
//                overriding --> more classes parent as well as child class have same function