package bai3_array_method_in_java.baitap;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vị trí muốn xóa");
        int index = scanner.nextInt(); // vị trí xóa
        int temp = array.length;
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        temp--;
        for (int i = 0; i < temp; i++) {
            System.out.print(array[i]+",");
        }
    }
}
