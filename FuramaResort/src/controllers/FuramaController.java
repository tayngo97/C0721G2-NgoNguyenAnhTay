package controllers;

import models.person.Customer;
import models.person.Employee;
import models.service.Facility;
import models.service.Villa;
import services.*;


import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        PromotionServiceImpl promotionService = new PromotionServiceImpl();

        boolean flagMain = true;
        while (flagMain) {
            System.out.println("Menu" + "\n" + "1.Employee Management" + "\n" + "2.Customer Management" + "\n" + "3.Facility Management" + "\n" + "4.Booking Management" + "\n" + "5.Promotion Management" + "\n" + "6.Exit");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Invalid input,you have to enter a number");
                continue;
            }
            switch (choice) {
                case 1: {
                    boolean flag = true;
                    while (flag) {
                        int choice1 = 0;
                        while (flag) {
                            flag = false;
                            try {
                                System.out.println("1.Display list employee" + "\n" + "2.Add new employee" + "\n" + "3.Edit employee" + "\n" + "4.Return main menu");
                                choice1 = Integer.parseInt(scanner.nextLine());
                            } catch (Exception e) {
                                System.err.println("Invalid input,you have to enter a number");
                                flag = true;
                            }
                        }
                        flag = true;
                        switch (choice1) {
                            case 1:
                                employeeService.showInfoList();
                                break;
                            case 2:
                                employeeService.addNewEmployee();
                                break;
                            case 3:
                                employeeService.editInfoEmployee();
                                break;
                            case 4:
                                flag = false;
                                break;
                        }
                    }
                    break;
                }
                case 2: {
                    boolean flag = true;
                    while (flag) {
                        int choice1 = 0;
                        while (flag) {
                            flag = false;
                            try {
                                System.out.println("1.Display list customer" + "\n" + "2.Add new customer" + "\n" + "3.Edit customer" + "\n" + "4.Return main menu");
                                choice1 = Integer.parseInt(scanner.nextLine());
                            } catch (Exception e) {
                                System.err.println("Invalid input,you have to enter a number");
                                flag = true;
                            }
                        }
                        flag = true;
                        switch (choice1) {
                            case 1:
                                customerService.showInfoCustomer();
                                break;
                            case 2:
                                customerService.addNewCustomer();
                                break;
                            case 3:
                                customerService.editInfoCustomer();
                                break;
                            case 4:
                                flag = false;
                        }
                    }
                    break;
                }
                case 3: {
                    boolean flag = true;
                    while (flag) {
                        int choice1 = 0;
                        while (flag) {
                            flag = false;
                            try {
                                System.out.println("1.Display list facility" + "\n" + "2.Add new facility" + "\n" + "3.Display maintenance list" + "\n" + "4.Return main menu");
                                choice1 = Integer.parseInt(scanner.nextLine());
                            } catch (Exception e) {
                                System.err.println("Invalid input,you have to enter a number");
                                flag = true;
                            }
                        }
                        flag = true;
                        switch (choice1) {
                            case 1:
                                facilityService.showFacilityList();
                                break;
                            case 2:
                                facilityService.addNewService();
                                break;
                            case 3:
                                facilityService.showMaintenanceList();
                                break;
                            case 4:
                                flag = false;
                                break;
                        }
                    }
                    break;
                }
                case 4: {
                    boolean flag = true;
                    while (flag) {
                        int choice1 = 0;
                        while (flag) {
                            flag = false;
                            try {
                                System.out.println("1.Add new booking" + "\n" + "2.Display list booking" + "\n" + "3.Create new contracts" + "\n" + "4.Display list contracts" + "\n" + "5.Edit  contracts" + "\n" + "6.Return main menu");
                                choice1 = Integer.parseInt(scanner.nextLine());
                            } catch (Exception e) {
                                System.err.println("Invalid input,you have to enter a number");
                                flag = true;
                            }
                        }
                        flag = true;
                        switch (choice1) {
                            case 1:
                                bookingService.addNewBooking();
                                break;
                            case 2:
                                bookingService.showBooking();
                                break;
                            case 3:
                                contractService.CreateNewContracts();
                                break;
                            case 4:
                                contractService.DisplayListContracts();
                                break;
                            case 5:
                                contractService.EditContracts();
                                break;
                            case 6:
                                flag = false;
                                break;
                        }
                    }
                    break;
                }
                case 5:
                    boolean flag = true;
                    while (flag) {
                        int choice1 = 0;
                        while (flag) {
                            flag = false;
                            try {
                                System.out.println("1.Display list customer use service based on year " + "\n" + "2.Display list customer get voucher in this month" + "\n" + "3.Return main menu");
                                choice1 = Integer.parseInt(scanner.nextLine());
                            } catch (Exception e) {
                                System.err.println("Invalid input,you have to enter a number");
                                flag = true;
                            }
                        }
                        flag = true;
                        switch (choice1) {
                            case 1:
                                promotionService.displayCustomerUseService();
                                break;
                            case 2:
                                promotionService.displayCustomerGetVoucher();
                                break;
                            case 3:
                                flag = false;
                                break;
                        }
                    }
                    break;
                case 6:
                    flagMain = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
