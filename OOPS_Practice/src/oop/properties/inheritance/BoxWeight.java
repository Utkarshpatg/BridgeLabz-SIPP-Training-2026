package oop.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){

        this.weight = -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);   //what is this the parent class constructor
        // used to initialise value present in parent class

        this.weight = weight;
//        System.out.println(super.weight);  // this will print 0.0 because it is refering parent class weight
    }
    public BoxWeight(double side,double weight) {
        super(side);   //what is this the parent class constructor
        // used to initialise value present in parent class

        this.weight = weight;
//        System.out.println(super.weight);  // this will print 0.0 because it is refering parent class weight
    }
}
