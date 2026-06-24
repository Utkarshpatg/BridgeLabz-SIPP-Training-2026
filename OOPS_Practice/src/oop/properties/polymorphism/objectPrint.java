package oop.properties.polymorphism;

public class objectPrint {
    int num;
    public objectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "objectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        objectPrint obj = new objectPrint(54);
        System.out.println(obj);
    }
}
