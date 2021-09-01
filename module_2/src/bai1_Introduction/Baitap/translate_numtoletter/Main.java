package bai1_Introduction.Baitap.translate_numtoletter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number!");
        int input = sc.nextInt();

        int hangDonVi  = input % 10; // 11 % 10 = 1
        int hangChuc = (input%100)/10; // 11 % 100 = 11 => 11 /10 = 1
        int hangTram = (input%1000)/100; // (11 % 1000) /100 = 0
        System.out.println(hangTram + " , " + hangChuc + " , " + hangDonVi + " , ");

        String unitString = "";
        switch (hangDonVi) {
            case 0:
                unitString = "" ;
                break;
            case 1:
                unitString = "one";
                break;
            case 2:
                unitString = "two";
                break;
            case 3:
                unitString = "three";
                break;
            case 4:
                unitString = "four";
                break;
            case 5:
                unitString = "five";
                break;
            case 6:
                unitString = "six";
                break;
            case 7:
                unitString = "seven";
                break;
            case 8:
                unitString = "eight";
                break;
            case 9:
                unitString = "nine";
                break;

        }
        String dozensString = "";
        switch (hangChuc) {
            case 1:
                switch (hangDonVi) {
                    case 0:
                        unitString = "ten";
                        break;
                    case 1:
                        unitString = "eleven";
                        break;
                    case 2:
                        unitString = "twelve";
                        break;
                    case 3:
                        unitString = "thirteen";
                        break;
                    case 4:
                        unitString = "fourteen";
                        break;
                    case 5:
                        unitString = "fifteen";
                        break;
                    case 6:
                        unitString = "sixteen";
                        break;
                    case 7:
                        unitString = "seventeen";
                        break;
                    case 8:
                        unitString = "eightteen";
                        break;
                    case 9:
                        unitString = "nineteen";
                        break;

                }
                break;
            case 2:
                dozensString = "twenty";
                break;
            case 3:
                dozensString = "thirty";
                break;
            case 4:
                dozensString = "fourty";
                break;
            case 5:
                dozensString = "fifty";
                break;
            case 6:
                dozensString = "sixty";
                break;
            case 7:
                dozensString = "seventy";
                break;
            case 8:
                dozensString = "eighty";
                break;
            case 9:
                dozensString = "ninety";
                break;
        }
        String hundredsString = "";
        switch (hangTram) {
            case 1:
                hundredsString = "one";
                break;
            case 2:
                hundredsString = "two";
                break;
            case 3:
                hundredsString = "three";
                break;
            case 4:
                hundredsString = "four";
                break;
            case 5:
                hundredsString = "five";
                break;
            case 6:
                hundredsString = "six";
                break;
            case 7:
                hundredsString = "seven";
                break;
            case 8:
                hundredsString = "eight";
                break;
            case 9:
                hundredsString = "nine";
                break;
        }
        if (input >= 0) {
            if (input < 20) {
                switch (input) {
                    case 0:
                        System.out.printf("zero");
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 15:
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        System.out.printf("" + unitString);
                        break;
                }
            } else if (input < 100) {
                System.out.println(dozensString + unitString);
            } else if (input < 1000) {
                // %s biêu thị cthay thế cho chuỗi tương ứng với hundredsString,dozensString,unitString
                // printf in ra và format  kết hợp với %s \n dùng xuống dòng
                System.out.println(hundredsString+dozensString+unitString);
            } else {
                System.out.printf("out of ability");
            }
        } else {
            System.out.printf("out of ability");
        }

    }
}


