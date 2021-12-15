package bai15_exception_debug.baitap;

public class IllegalTriangleException  extends Exception{

    public IllegalTriangleException(){
        System.err.println("Day khong phai la 3 canh tam giac !");
    }
}
