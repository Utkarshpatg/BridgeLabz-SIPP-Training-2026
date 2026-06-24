package oop.access;

public class subClass extends A{
    public subClass(int num,String name) {
        super(num,name);
    }

    public static void main(String[] args) {
        subClass obj = new subClass(45,"utkarsh");
        int n = obj.num;

        System.out.println(obj instanceof A);
    }
}
