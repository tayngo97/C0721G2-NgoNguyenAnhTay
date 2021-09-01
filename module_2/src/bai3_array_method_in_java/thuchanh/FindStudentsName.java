package bai3_array_method_in_java.thuchanh;

import java.util.Scanner;

public class FindStudentsName {
    public static void main(String[] args) {
        String[] students ;
        int size ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number element of Arrays");
        size = scanner.nextInt();

        students = new String[size];

        int i = 0 ;
        scanner.nextLine();// khi nextInt rồi Enter xuống dòng thì nextLine sẽ nhận Enter = \n
        while (i < students.length){
            System.out.println("Enter element :" + (i+1) );
            students[i] = scanner.nextLine();
            i++;
        }

        System.out.println("Student list :");
        for (int j =0;j<students.length;j++){
            System.out.print(students[j] + "\t");
        }
        System.out.println("\n");

        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        boolean isExist = false ;
        for (int j =0;j<students.length;j++){
            if (students[j].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is " + j );
                isExist = true ;
                break;
            }
        }
        if (!isExist){
            System.out.println("Can not fint the name " + input_name + " in the list");
        }
    }
}
