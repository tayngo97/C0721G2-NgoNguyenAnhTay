package bai17_io_binary.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    protected static Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();
    protected static File file = new File("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\src\\product_data.txt");


    public void addProduct(){
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter branch");
        String branch = scanner.nextLine();
        System.out.println("Enter price");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id,name,branch,price,new TypeProduct("AA1","Milk"));

        if (file.length() > 0){
            products = readDataFromFile();
        }

        products.add(product);
        writeToFile(products);
    }



    public void showList(){
        List<Product> productArrayList =  readDataFromFile();
        for (Product o: productArrayList) {
            System.out.println(o);
        }
    }

    public  void searchProduct(int id){
        List<Product> productArrayList =  readDataFromFile();
        for (Product o: productArrayList) {
            if (o.getId() == id){
                System.out.println(o);
            }
        }
    }

    public  static List<Product> readDataFromFile(){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
        }catch(Exception ex){
            System.out.println("File is empty");
        }
        return products;
    }

    public static void writeToFile(List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
