package bai15_exception_debug.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter size a");
                int a = scanner.nextInt();
                System.out.println("Enter size b");
                int b = scanner.nextInt();
                System.out.println("Enter size c");
                int c = scanner.nextInt();
                CheckSizeTriangle.checkTriangle(a,b,c);
            } catch (IllegalTriangleException e) {
                flag = true;
                System.out.println(e);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
