package services;

import models.person.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        Customer customer1 = new Customer("Steven", 1980, "Male", 100029, 906959, "Steven@gmail.com", "C101", "Member", "Newyork");
        Customer customer2 = new Customer("Jonh", 1985, "Male", 100030, 906979, "Jonh@gmail.com", "C102", "Silver", "Canada");
        Customer customer3 = new Customer("Anna", 1987, "Female", 100031, 906958, "Anna@gmail.com", "C103", "Member", "US");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
    }

    public static Customer getOb(String id){
        for ( Customer e: customerList) {
            if (e.getCustomerID().equals(id)){
                return e;
            }
        }
        return null;
    }


    @Override
    public void addNewCustomer() {
        System.out.println("Enter  name");
        String name = scanner.nextLine();
        System.out.println("Enter  bithday");
        int birrt = scanner.nextInt();
        System.out.println("Enter  gender");
        String gender = scanner.nextLine();
        System.out.println("Enter  CMND");
        int cmnd = scanner.nextInt();
        System.out.println("Enter  phone");
        int phone = scanner.nextInt();
        System.out.println("Enter  email");
        String email = scanner.nextLine();
        System.out.println("Customer ID");
        String ID = scanner.nextLine();
        System.out.println("Enter  typeOfGuest");
        String typeOfGuest = scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        Customer customer = new Customer(name,birrt,gender,cmnd,phone,email,ID,typeOfGuest,address);
        customerList.add(customer);
        showInfoCustomer();
    }

    @Override
    public void editInfoCustomer() {
        System.out.println("Enter name of employee to edit !");
        String name = scanner.nextLine();
        for (Customer e : customerList) {
            if (e.getName().equals(name)) {
                while (true) {
                    System.out.println("1 Edit name" + "\n" +  "2 Edit birthday" + "\n" +  "3 Edit gender" + "\n" +  "4 Edit CMND" + "\n" +  "5 Edit phoneNumber" + "\n" +  "6 Edit email" + "\n" +  "7 Edit Customer ID" + "\n" +  "8 Edit typeOfGuest" + "\n" +  "9 Edit address" + "\n" +  "10 Edit Customer ID" + "\n" +  "11 Finish edit");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter new name");
                            String name1 = scanner.nextLine();
                            e.setName(name1);
                            break;
                        case 2:
                            System.out.println("Enter new bithday");
                            int birrt = scanner.nextInt();
                            e.setBirthday(birrt);
                            break;
                        case 3:
                            System.out.println("Enter new gender");
                            String gender = scanner.nextLine();
                            e.setGender(gender);
                            break;
                        case 4:
                            System.out.println("Enter new CMND");
                            int cmnd = scanner.nextInt();
                            e.setCMND(cmnd);
                            break;
                        case 5:
                            System.out.println("Enter new phone");
                            int phone = scanner.nextInt();
                            e.setPhoneNumber(phone);
                            break;
                        case 6:
                            System.out.println("Enter new email");
                            String email = scanner.nextLine();
                            e.setEmail(email);
                            break;
                        case 7:
                            System.out.println("Enter new customerID");
                            String id1 = scanner.nextLine();
                            e.setCustomerID(id1);
                            break;
                        case 8:
                            System.out.println("Enter new typeOfGuest");
                            System.out.println("a.DIAMOND" + "\n" + "b.PLATINUM" + "\n" + "c.GOLD" + "\n" + "d.SILVER" + "\n" + "e.MEMBER");
                            String choice1 = scanner.nextLine();
                            switch (choice1){
                                case "a" : e.setTypeOfGuest(Customer.DIAMOND);break;
                                case "b" : e.setTypeOfGuest(Customer.PLATINUM);break;
                                case "c" : e.setTypeOfGuest(Customer.GOLD);break;
                                case "d" : e.setTypeOfGuest(Customer.SILVER);break;
                                case "e" : e.setTypeOfGuest(Customer.MEMBER);break;
                                default: break;
                            }
                            break;
                        case 9:
                            System.out.println("Enter new address");
                            e.setAddress(scanner.nextLine());
                        case 11:
                            return;
                        case 12:
                            System.out.println("Invalid input");
                            continue;
                    }
                }
            }
        }
        showInfoCustomer();
    }


    @Override
    public  void showInfoCustomer() {
        for (Customer e: customerList) {
            System.out.println(e);
        }
    }


}
