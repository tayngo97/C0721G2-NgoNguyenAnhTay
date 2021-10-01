package services;

import models.person.Customer;
import models.person.Employee;
import services.exception_validate.CheckAgeInput;
import services.exception_validate.IllegalAgeInputException;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static File file = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\customer.csv");
    protected static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);


    public static Customer getOb(String id) {
        customerList = readDataFromFile();
        for (Customer e : customerList) {
            if (e.getCustomerID().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public void addNewCustomer() {
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                System.out.println("Enter  name");
                String name = scanner.nextLine();
                String birrt = CheckAgeInput.checkAgeInput();
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
                if (file.length()>0){
                    customerList = readDataFromFile();
                }
                customerList.add(customer);
                writeToFile(customerList);
            } catch (Exception exception) {
                System.err.println("Invalid input,try again !");
                flag = true;
            }
        }
    }

    public void deleteCustomer() {
        System.out.println("Enter name to delete !");
        String name = scanner.nextLine();
        customerList = readDataFromFile();
        customerList.removeIf(e -> e.getName().equals(name));
        writeToFile(customerList);
        showInfoCustomer();
    }

    public void searchCustomer() {
        boolean flag = false;
        System.out.println("Enter customer name :");
        String name = scanner.nextLine();
        customerList = readDataFromFile();
        for (Customer customer : customerList) {
            if (customer.getName().equals(name)) {
                System.out.println(customer);
                flag = true;
            }
        }
        if (!flag) {
            System.err.println("Not found !");
        }
    }

    public void editInfoCustomer() {
        customerList = readDataFromFile();
        System.out.println("Enter name of customer to edit !");
        String name = scanner.nextLine();
        for (Customer e : customerList) {
            if (e.getName().equals(name)) {
                boolean flag = true;
                while (flag) {
                    try {
                        System.out.println("1 Edit name" + "\n" + "2 Edit birthday" + "\n" + "3 Edit gender" + "\n" + "4 Edit CMND" + "\n" + "5 Edit phoneNumber" + "\n" + "6 Edit email" + "\n" + "7 Edit Customer ID" + "\n" + "8 Edit typeOfGuest" + "\n" + "9 Edit address" + "\n" + "10 Finish edit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("Enter new name");
                                e.setName(scanner.nextLine());
                                break;
                            case 2:
                                System.out.println("Enter new bithday");
                                String birth = CheckAgeInput.checkAgeInput();
                                e.setBirthday(birth);
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
                                while (flag) {
                                    flag = false;
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
                                        flag = true;
                                    }
                                }
                                flag = true;
                                break;
                            case 9:
                                System.out.println("Enter new address");
                                e.setAddress(scanner.nextLine());
                                break;
                            case 10:
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
        writeToFile(customerList);
        showInfoCustomer();
    }

    public void showInfoCustomer() {
        customerList = readDataFromFile();
        for (Customer e : customerList) {
            System.out.println(e);
        }
    }

    public static void show() {
        customerList = readDataFromFile();
        for (Customer e : customerList) {
            System.out.println(e);
        }
    }

    public static List<Customer> readDataFromFile() {
        List<Customer> customerList = new LinkedList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] customer = line.split(",");

                customerList.add(new Customer(customer[0],customer[1], customer[2], Integer.parseInt(customer[3]), Integer.parseInt(customer[4]),
                        customer[5], customer[6], customer[7], customer[8]));
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return customerList;
    }

    public static void writeToFile(List<Customer> customers) {

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Customer customer : customers) {
                bw.write(customer.stringToWrite());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
