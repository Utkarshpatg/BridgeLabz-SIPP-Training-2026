package oop.Interface.extendDemo;

public interface A {
//  static interface method should always have a body
//  call via the interface name
    static void greeting(){
        System.out.println("hey! i am static method");
    }

   default void fun(){
       System.out.println("i am in A");

   }
}
