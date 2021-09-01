package bai2_loop_in_java.baitap.display_primenumber;

public class Main {
    public static void main(String[] args) {
        int number = 20 ;
        int count = 0 ;
        int N = 2;

        while (count < number){
            if (isPrime(N)){
                System.out.print(N + " ,");
                count++;
            }

            if (N == 2){
                N ++;
            } else {
                N += 2;
            }
        }
    }

    public static boolean isPrime(int N){
        for (int i = 2; i<= Math.sqrt(N);i++){
            if (N%i==0){
                return false ;
            }
        } return true ;
    }

}
