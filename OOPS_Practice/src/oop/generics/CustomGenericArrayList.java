package oop.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList <T> {
    private Object [] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // size is also working as index value
    public CustomGenericArrayList(){
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object []temp = new Object[data.length *2];
//        copy current item in a new item
        for(int i = 0;i<data.length; i++){
            temp[i] = (data[i]);
        }
        data = temp;
    }

    public boolean isFull(){
        return size == data.length;
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        for(int i =0;i<10;i++){
//            list.add(2*i);
//        }

//        System.out.println(list);

//        ArrayList<Integer> list2 = new ArrayList<>();


        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
        for(int i = 1; i<=14;i++){
            list3.add(2*i);
        }
        System.out.println(list3);








//        list2.add(5);
//        list.add(45);
//        list.remove(0);
//        list.set(1,5675);
//        list.size();
//        list.isEmpty();
    }
}
