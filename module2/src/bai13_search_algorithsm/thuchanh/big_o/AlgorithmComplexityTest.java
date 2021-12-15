package bai13_search_algorithsm.thuchanh.big_o;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        /*codes below here */

        int[] frequentChar = new int[255];      //O(1)
        for (int i = 0; i < inputString.length() ; i++) {  // n times depens on input ==> O(n)
            int ascii =  inputString.charAt(i);   //O(1)
            frequentChar[ascii] = frequentChar[ascii] + 1 ;  //O(1)
            // fre = fre[115] + 1
        }

        // f(n) = n * 1^3 ==> O(f(n)) = O(n)

        int max = 0;                                             //{5}  O(1)
        char character = (char) 255; /* empty character */      //{6}  O(1)
        for (int j = 0; j < 255; j++) {                         //{7}  O(255)
            if (frequentChar[j] > max) {                        //{8}   O(1)
                max = frequentChar[j];                          //{9}  O(1)
                character = (char) j;                           //{10}  O(1)
            }
        }

        // f(n) = 255*1 = 255 ==> O((f)n)  = O(255)

        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
