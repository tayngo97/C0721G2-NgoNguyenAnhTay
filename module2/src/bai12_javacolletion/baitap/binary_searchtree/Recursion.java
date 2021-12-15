package bai12_javacolletion.baitap.binary_searchtree;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(fibonaci(5));
    }
    // 1 1 2 3 5 8
    public static int fibonaci(int n){
        if (n<2) return 1; // điểm dừng
        else return fibonaci(n-2) + fibonaci(n-1);
    }

    // fib (3) + fib(4)
    //   fib(1) + fib(2) + fib(2) + fib(3)
    //   1 +  1 + 1 + fib(1) + fib(2)
    //   3 + 1 + 1 = 5


//    public static int giaithua(int n){
//        if (n == 2){  // điểm dừng
//            return  2;
//        } else return n * giaithua(n-1);
//    }  // 5 * 4 * 3 * 2
}
