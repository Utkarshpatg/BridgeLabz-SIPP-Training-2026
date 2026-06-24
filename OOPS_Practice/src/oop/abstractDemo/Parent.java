package oop.abstractDemo;

public abstract class Parent {
    int age;
    public Parent(int age){
        this.age = age;
    }
    void normal(){
        System.out.println("this is normal");
    }
    static void hello(){
        System.out.println("hii");
    }

    abstract void career();
    abstract void partner();
}

/*
An abstract method means “incomplete method, subclass must override it.”

Abstract methods don’t have a body.

Abstract classes cannot be instantiated directly.
 */
