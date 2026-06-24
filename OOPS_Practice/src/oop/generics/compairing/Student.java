package oop.generics.compairing;

public class Student implements Comparable<Student> {
    int roll_no ;
    float marks;

    public Student(int roll_no, float marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks-o.marks);
        /*
        if diff = 0 : means both are equal
        if diff < 1 : means o is bigger else o is smalller
         */
        return diff;
    }

}
