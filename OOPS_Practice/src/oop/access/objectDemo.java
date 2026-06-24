package oop.access;

public class objectDemo {
    int num;
    float gpa;

    public objectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }


    /*
    @Override
    public String toString() {   // it gives only string representation
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable { // it call when garbage collection hit
        super.finalize();
    }


 */



    public objectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();  // unique representation of an object via a number
//          return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num ==((objectDemo)obj).num;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) {
        objectDemo obj = new objectDemo(34,78.2f);
        objectDemo obj2 = new objectDemo(34,56.5f);
        if(obj == obj2){
            System.out.println("1obj is equals to obj2");
        }
        if(obj.equals(obj2)){
            System.out.println("2obj is equals to obj2");
        }
        System.out.println(obj.getClass().getClass());
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }

}
