package bai15_exception_debug.baitap;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
