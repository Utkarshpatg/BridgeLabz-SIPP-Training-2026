package oop.generics.compairing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student ram = new Student(12,88.56f);
        Student shyam = new Student(6,99.54f);
        Student rohit = new Student(2,85.56f);
        Student mohit = new Student(8,94.54f);
        Student geeta = new Student(17,89.56f);
        Student sita = new Student(4,79.54f);
        Student[] list = {ram, shyam, rohit, mohit, geeta, sita};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);
//            }
//        });
        Arrays.sort(list, (o1,o2) -> -(int)(o1.marks - o2.marks));  // lamba function
        System.out.println(Arrays.toString(list));

//        if(ram.compareTo(shyam) < 0){
//            System.out.println("ram has less marks");
//        }
//        else if(ram.compareTo(shyam) > 0){
//            System.out.println("ram has more marks");
//        }
//        else{
//
//            System.out.println("ram and shyam achive equal marks");
//        }
//        System.out.println(ram.compareTo(shyam));
    }
}
