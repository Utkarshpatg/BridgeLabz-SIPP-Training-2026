package oop.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int  b = 0;
        try{
//            divide(a,b);
//            throw new Exception("just for fun");
            String name = "utkarsh";
            if(name.equals("utkarsh")){
                throw new MyException("name is utkarsh");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }

        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("normal exception");
        }
        finally {
            System.out.println("this will always run");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("please do not divide it with zero");
        }
        return a/b;
    }
}
