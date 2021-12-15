package bai12_javacolletion.baitap.product_manager;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();


        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To add product");
            System.out.println("Enter 2: To edit product by id ");
            System.out.println("Enter 3: To delete information product");
            System.out.println("Enter 4: To show list product");
            System.out.println("Enter 5: To search  product");
            System.out.println("Enter 6: To sort Up by price");
            System.out.println("Enter 7: To sort Down by price ");
            System.out.println("Enter 8: To exit ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    productManager.addProduct();
                    break;
                }
                case 2: {
                    productManager.editProduct();
                    break;
                }
                case 3: {
                    System.out.println("Enter id to delete");
                    int id = scanner.nextInt();
                    productManager.deleteProduct(id);
                    break;
                }
                case 4: {
                    productManager.showList();
                    break;
                }
                case 5: {
                    scanner.nextLine();
                    System.out.println("Enter name to search");
                    String name = scanner.nextLine();
                    System.out.println(productManager.searchProduct(name));
                    break;
                }
                case 6: {
                    productManager.sortIncreaseProduct();
                    productManager.showList();
                    break;
                }
                case 7: {
                    productManager.sorDecreaseProduct();
                    productManager.showList();
                    break;
                }
                case 8:
                    return;
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
