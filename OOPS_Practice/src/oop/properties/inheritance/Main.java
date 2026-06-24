package oop.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6,5.3,2.4);
        Box box2 = new Box(box1);
//        System.out.printf(box1.l + " " + box1.h + " " + box1.w);


//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 4, 2, 5);
//        System.out.printf(box4.h + " " + box4.weight);

//        Box box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5);


//        BoxWeight box7 = new BoxWeight(2,3,4,5);  //calling this constructor for using super keyword


//        BoxPrice box = new BoxPrice(5,8,200);


//            box1.greeting();
        BoxWeight box = new BoxWeight();
        BoxWeight.greeting(); // you can inherit but you cannot override
    }
}




/*
types of inheritance

1 - single inheritance : one class extends another class
2- multi level inheritance: box -> boxweight -> boxprice (lower base class has full idea of
    above parent class but parent class has no idea of lower child classs)

3- multiple inheritance: one class extending more than one classes.
  "java does not support this eg:- class A n = 5 and class B n =10 --> then class C => C.n = ??(5/10)

4- Hierarchial inheritance : one classs is inherited by many classes
                    A (parent class) ----> B,C,D

5- Hybrid inheritance: combination of single and multiple inheritance "not in java check interfaces lecture"
            like:- A-->B,C-->D

 */
