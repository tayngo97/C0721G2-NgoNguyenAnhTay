package controllers;

import services.*;
import utils.GetChoiceInMenu;

public class FuramaController {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        PromotionServiceImpl promotionService = new PromotionServiceImpl();

        boolean flagMain = true;
        while (flagMain) {
            System.out.println("====||FURAMA RESORT SYSTEM||====" + "\n" + "1.Employee Management" + "\n" + "2.Customer Management" + "\n" + "3.Facility Management" + "\n" + "4.Booking Management" + "\n" + "5.Promotion Management" + "\n" + "6.Exit");
            int choice = GetChoiceInMenu.getChoice();
            switch (choice) {
                case 1: {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("====||EMPLOYEE SYSTEM||====" + "\n" + "1.Display list employee" + "\n" + "2.Add new employee" + "\n" + "3.Edit employee" + "\n" + "4.Delete employee" + "\n" + "5.Search employee" + "\n" + "6.Return main menu");
                        int choice1 = GetChoiceInMenu.getChoice();
                        switch (choice1) {
                            case 1:
                                employeeService.show();
                                break;
                            case 2:
                                employeeService.add();
                                break;
                            case 3:
                                employeeService.edit();
                                break;
                            case 4:
                                employeeService.delete();
                                break;
                            case 5:
                                employeeService.searchEmployee();
                                break;
                            case 6:
                                flag = false;
                                break;
                            default:
                                System.err.println("Invalid,try again !");
                        }
                    }
                    break;
                }
                case 2: {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("====||CUSTOMER SYSTEM||====" + "\n" + "1.Display list customer" + "\n" + "2.Add new customer" + "\n" + "3.Edit customer" + "\n" + "4.Search customer" + "\n" + "5.Return main menu");
                        int choice1 = GetChoiceInMenu.getChoice();
                        switch (choice1) {
                            case 1:
                                customerService.showInfoCustomer();
                                break;
                            case 2:
                                customerService.add();
                                break;
                            case 3:
                                customerService.edit();
                                break;
                            case 4:
                                customerService.search();
                                break;
                            case 5:
                                flag = false;
                                break;
                            default:
                                System.err.println("Invalid,try again !");
                        }
                    }
                    break;
                }

                case 3: {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("====||FACILITIES SYSTEM||====" + "\n" + "1.Display list facility" + "\n" + "2.Add new facility" + "\n" + "3.Display maintenance list" + "\n" + "4.Return main menu");
                        int choice1 = GetChoiceInMenu.getChoice();
                        switch (choice1) {
                            case 1:
                                facilityService.show();
                                break;
                            case 2:
                                facilityService.add();
                                break;
                            case 3:
                                facilityService.showMaintenanceList();
                                break;
                            case 4:
                                flag = false;
                                break;
                            default:
                                System.err.println("Invalid,try again !");
                        }
                    }
                    break;
                }

                case 4: {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("====||BOOKING SYSTEM||====" + "\n" + "1.Add new booking" + "\n" + "2.Display list booking" + "\n" + "3.Delete a booking" + "\n" + "4.Create new contracts" + "\n" + "5.Display list contracts" + "\n" + "6.Edit  contracts" + "\n" + "7.Delete contracts" + "\n" + "8.Return main menu");
                        int choice1 = GetChoiceInMenu.getChoice();
                        switch (choice1) {
                            case 1:
                                bookingService.add();
                                break;
                            case 2:
                                bookingService.show();
                                break;
                            case 3:
                                bookingService.delete();
                                break;
                            case 4:
                                contractService.add();
                                break;
                            case 5:
                                contractService.show();
                                break;
                            case 6:
                                contractService.edit();
                                break;
                            case 7:
                                contractService.delete();
                                break;
                            case 8:
                                flag = false;
                                break;
                            default:
                                System.err.println("Invalid,try again !");
                        }
                    }
                    break;
                }
                case 5: {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("====||VOUCHER SYSTEM||====" + "\n" + "1.Display list customer use service based on year " + "\n" + "2.Display list customer get voucher in this month" + "\n" + "3.Return main menu");
                        int choice1 = GetChoiceInMenu.getChoice();
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
                            default:
                                System.err.println("Invalid,try again !");
                        }
                    }
                    break;
                }
                case 6: {
                    flagMain = false;
                    break;
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
