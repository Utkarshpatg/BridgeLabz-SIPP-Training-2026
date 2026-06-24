package oop.generics.compairing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<5;i++){
            arr.add(i+1);
        }
//        arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);
        Operation sum = (a,b) -> a + b;
        Operation mult = (a,b) -> a * b;
        Operation sub = (a,b) -> a - b;

        LambdaFunction myCalc = new LambdaFunction();
        System.out.println(myCalc.operatoin(5,3,sum));
        System.out.println(myCalc.operatoin(5,3,mult));
        System.out.println(myCalc.operatoin(5,3,sub));

    }
    private int operatoin(int a ,int b,Operation op){
        return op.operation(a,b);
    }
}

interface Operation {
    int operation (int a , int b);
//    int operation (int a,int b);
}

