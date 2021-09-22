package controllers;

import models.person.Customer;
import models.person.Employee;
import models.service.Facility;
import models.service.Villa;
import services.BookingServiceImpl;
import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;
import services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController  {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();


        while (true) {
            System.out.println("Menu" + "\n" + "1.Employee Management" + "\n" + "2.Customer Management" + "\n" + "3.Facility Management" + "\n" + "4.Booking Management" + "\n" + "5.Promotion Management" + "\n" + "6.Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("a.Display list employee" + "\n" + "b.Add new employee" + "\n" + "c.Edit employee" + "\n" + "d.Return main menu");
                        String choice1 = scanner.nextLine();
                        switch (choice1) {
                            case "a":
                                employeeService.showInfoList();
                                break;
                            case "b":
                                employeeService.addNewEmployee();
                                break;
                            case "c":
                                employeeService.editInfoEmployee();
                                break;
                            case "d":
                                flag = false;
                                break;
                            default:
                                System.out.println("Invalid input ");
                                continue;
                        }
                    }
                    break;
                }
                case 2: {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("a.Display list customer" + "\n" + "b.Add new customer" + "\n" + "c.Edit customer" + "\n" + "d.Return main menu");
                        String choice1 = scanner.nextLine();
                        switch (choice1) {
                            case "a":
                                customerService.showInfoCustomer();
                                break;
                            case "b":
                                customerService.addNewCustomer();
                                break;
                            case "c":
                                customerService.editInfoCustomer();
                                break;
                            case "d":
                                flag = false;
                            default:
                                System.out.println("Invalid input ");
                                continue;
                        }
                    }
                    break;
                }


                case 3: {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("a.Display list facility" + "\n" + "b.Add new facility" + "\n" + "c.Display maintenance list" + "\n" + "d.Return main menu");
                        String choice4 = scanner.nextLine();
                        switch (choice4) {
                            case "a":
                                facilityService.showFacilityList();
                                break;
                            case "b":
                                facilityService.addNewService();
                                break;
                            case "c":
                                facilityService.showMaintenanceList();
                                break;
                            case "d":
                                flag = false;
                                break;
                            default:
                                System.out.println("Invalid");
                        }
                    }
                    break;
                }
                case 4: {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("1.Add new booking" + "\n" + "2.Display list booking" + "\n" + "3.Create new contracts" + "\n" + "4.Display list contracts" + "\n" + "5.Edit  contracts" + "\n" + "6.Return main menu");
                        int choice3 = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice3) {
                            case 1:
                                customerService.showInfoCustomer();
                                facilityService.showFacilityList();
                                bookingService.addNewBooking();
                                break;
                            case 2:
                                bookingService.showBooking();
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                flag = false;
                                break;
                            default:
                                System.out.println("Invalid sss");
                        }
                    }
                    break;
                }
                case 5:
                    System.out.println("1.Display list customer use service");
                    System.out.println("2.Display list customer get voucher");
                    System.out.println("3.Return main menu");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
