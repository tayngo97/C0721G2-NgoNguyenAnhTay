package bai12_javacolletion.baitap.product_manager;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product(123,"Iphone","Apple",20000000));
        productManager.addProduct(new Product(124,"Nokia","Nokia",10000000));
        productManager.addProduct(new Product(125,"Huawei","Huawei",15000000));

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
                    System.out.print("Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter name:");
                    String name = scanner.nextLine();
                    System.out.print("Enter branch: ");
                    String branch = scanner.nextLine();
                    System.out.print("Enter price: ");
                    int price = scanner.nextInt();
                    Product product = new Product(id, name, branch, price);
                    productManager.addProduct(product);
                    System.out.println(product);
                    break;
                }
                case 2: {
                    System.out.println("Enter id of product !");
                    int id = scanner.nextInt();
                    productManager.editProduct(id);
                    productManager.showList();
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
                case 6:{
                    productManager.sortIncreaseProduct();
                    productManager.showList();
                    break;
                }
                case 7:{
                    productManager.sorDecreaseProduct();
                    productManager.showList();
                    break;
                }
                case 8: return;
                default:
                    System.out.println("Invalid"); continue;
            }
        }
    }
}
