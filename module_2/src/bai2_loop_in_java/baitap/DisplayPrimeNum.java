package bai2_loop_in_java.baitap;

public class DisplayPrimeNum {
    public static void main(String[] args) {
        int number = 20 ;
        int count = 0 ;
        int n = 2;

        while (count != number){
            if (isPrime(n)){
                System.out.print(n + " ,");
                count++;
            }
            if (n == 2){
                n ++;
            } else {
                n += 2;
            }
        }
    }

    public static boolean isPrime(int num){
        for (int i = 2; i<= Math.sqrt(num);i++){
            if (num%i==0){
                return false ;
            }
        } return true ;
    }

}
