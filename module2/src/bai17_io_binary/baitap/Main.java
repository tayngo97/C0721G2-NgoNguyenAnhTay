package bai17_io_binary.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
//        ProductManager.readDataFromFile();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("------Menu------" + "\n" + "1.Add product" + "\n" + "2.Show list" + "\n" + "3.Search Product" + "\n" + "4Exit" + "\n" + "Enter your choice");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.showList();
                    break;
                case 3:
                    System.out.println("Enter id");
                    int id = Integer.parseInt(scanner.nextLine());
                    productManager.searchProduct(id);
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
