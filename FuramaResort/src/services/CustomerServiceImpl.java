package services;

import models.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    protected static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        Customer customer1 = new Customer("Steven", 1980, "Male", 100029, 906959, "Steven@gmail.com", "C101", "Member", "Newyork");
        Customer customer2 = new Customer("Jonh", 1985, "Male", 100030, 906979, "Jonh@gmail.com", "C102", "Silver", "Canada");
        Customer customer3 = new Customer("Anna", 1987, "Female", 100031, 906958, "Anna@gmail.com", "C103", "Member", "US");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
    }

    public static Customer getOb(String id) {
        for (Customer e : customerList) {
            if (e.getCustomerID().equals(id)) {
                return e;
            }
        }
        return null;
    }


    @Override
    public void addNewCustomer() {
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                System.out.println("Enter  name");
                String name = scanner.nextLine();
                System.out.println("Enter  bithday");
                int birrt = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter  gender");
                String gender = scanner.nextLine();
                System.out.println("Enter  CMND");
                int cmnd = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter  phone");
                int phone = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter  email");
                String email = scanner.nextLine();
                System.out.println("Customer ID");
                String ID = scanner.nextLine();
                System.out.println("Enter  typeOfGuest");
                String typeOfGuest = scanner.nextLine();
                System.out.println("Enter address");
                String address = scanner.nextLine();
                Customer customer = new Customer(name, birrt, gender, cmnd, phone, email, ID, typeOfGuest, address);
                customerList.add(customer);
            } catch (Exception exception) {
                System.err.println("Invalid input,try again !");
                flag = true;
            }
        }
    }

    @Override
    public void editInfoCustomer() {
        showInfoCustomer();
        System.out.println("Enter name of customer to edit !");
        String name = scanner.nextLine();
        for (Customer e : customerList) {
            if (e.getName().equals(name)) {
                boolean flag = true;
                while (flag) {
                    flag = false;
                    try {
                        System.out.println("1 Edit name" + "\n" + "2 Edit birthday" + "\n" + "3 Edit gender" + "\n" + "4 Edit CMND" + "\n" + "5 Edit phoneNumber" + "\n" + "6 Edit email" + "\n" + "7 Edit Customer ID" + "\n" + "8 Edit typeOfGuest" + "\n" + "9 Edit address" + "\n" + "10 Edit Customer ID" + "\n" + "11 Finish edit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("Enter new name");
                                e.setName(scanner.nextLine());
                                break;
                            case 2:
                                System.out.println("Enter new bithday");
                                e.setBirthday(Integer.parseInt(scanner.nextLine()));
                                break;
                            case 3:
                                System.out.println("Enter new gender");
                                e.setGender(scanner.nextLine());
                                break;
                            case 4:
                                System.out.println("Enter new CMND");
                                e.setCMND(Integer.parseInt(scanner.nextLine()));
                                break;
                            case 5:
                                System.out.println("Enter new phone");
                                e.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                                break;
                            case 6:
                                System.out.println("Enter new email");
                                e.setEmail(scanner.nextLine());
                                break;
                            case 7:
                                System.out.println("Enter new customerID");
                                e.setCustomerID(scanner.nextLine());
                                break;
                            case 8:
                                boolean flag1 = true;
                                while (flag1) {
                                    flag1 = false;
                                    try {
                                        System.out.println("Enter new typeOfGuest" + "\n" + "1.DIAMOND" + "\n" + "2.PLATINUM" + "\n" + "3.GOLD" + "\n" + "4.SILVER" + "\n" + "5.MEMBER");
                                        int choice1 = Integer.parseInt(scanner.nextLine());
                                        switch (choice1) {
                                            case 1:
                                                e.setTypeOfGuest(Customer.DIAMOND);
                                                break;
                                            case 2:
                                                e.setTypeOfGuest(Customer.PLATINUM);
                                                break;
                                            case 3:
                                                e.setTypeOfGuest(Customer.GOLD);
                                                break;
                                            case 4:
                                                e.setTypeOfGuest(Customer.SILVER);
                                                break;
                                            case 5:
                                                e.setTypeOfGuest(Customer.MEMBER);
                                                break;
                                        }
                                    } catch (Exception exception) {
                                        System.err.println("Invalid input,try again!");
                                        flag1 = true;
                                    }
                                }
                                break;
                            case 9:
                                System.out.println("Enter new address");
                                e.setAddress(scanner.nextLine());
                                break;
                            case 11:
                                flag = false;
                                break;
                        }
                    } catch (Exception exception) {
                        System.err.println("Invalid input !");
                        flag = true;
                    }
                }
            }
        }
        showInfoCustomer();
    }


    @Override
    public void showInfoCustomer() {
        for (Customer e : customerList) {
            System.out.println(e);
        }
    }

    public static void show() {
        for (Customer e : customerList) {
            System.out.println(e);
        }
    }
}
