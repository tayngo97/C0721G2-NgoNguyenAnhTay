package bai12_javacolletion.baitap.product_manager;

import java.util.*;
import java.util.stream.Collectors;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        this.products = new ArrayList();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean deleteProduct(int id) {
//        Product product = this.products.stream().filter(product1 -> product1.getId()==id).findFirst().orElse(null);
//        if (product==null) {
//            return false ;
//        }
//        this.products.remove(product);
//        return true ;
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    public void showList() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public boolean searchProduct(String name) {
//      return  this.products.stream().filter(product -> product.getName().equals(name)).collect(Collectors.toList());
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
                return true;
            }
        }
        return false;
    }

    public void editProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                Scanner scanner = new Scanner(System.in);


                while (true) {
                    System.out.println("Enter choice to edit !");
                    System.out.println("1.Edit new id ");
                    System.out.println("2.Edit new name ");
                    System.out.println("3.Edit new branch ");
                    System.out.println("4.Edit new price ");
                    System.out.println("5.Finish edit ");
                    int input = scanner.nextInt();
                    scanner.nextLine();
                    switch (input) {
                        case 1:
                            System.out.println("Enter new id ");
                            int id1 = scanner.nextInt();
                            product.setId(id1); break;
                        case 2:
                            System.out.println("Enter new name");
                            String name = scanner.nextLine();
                            product.setName(name); break;
                        case 3:
                            System.out.println("Enter new branch");
                            String branch = scanner.nextLine();
                            product.setBranch(branch); break;
                        case 4:
                            System.out.println("Enter new price");
                            int price = scanner.nextInt();
                            product.setPrice(price); break;
                        case 5:
                            return;
                        default:
                            System.out.println("Invalid input");
                            continue;
                    }
                }
            }
        }
    }

    public void sortIncreaseProduct() {
        Collections.sort(products, new SortProductComparatorIncrease());
    }

    public void sorDecreaseProduct() {
        Collections.sort(products, new SortProductComparatorDecrease());
    }
}
