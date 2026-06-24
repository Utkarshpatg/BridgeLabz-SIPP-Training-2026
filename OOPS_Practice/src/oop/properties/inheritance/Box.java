package oop.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;
//    double weight = 0;

    static void greeting(){
        System.out.println("hey, i am in box. greetings");
    }
    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void informationo() {
        System.out.printf("Running the box");
    }

}
