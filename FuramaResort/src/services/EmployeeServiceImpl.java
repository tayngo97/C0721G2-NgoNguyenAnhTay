package services;

import models.person.Employee;
import utils.EmployeeToCsv;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    protected static EmployeeToCsv employee = new EmployeeToCsv();
    private static List<Employee> employeelist = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    public void showInfoList() {
        employeelist = employee.readDataFromFile();
        for (Employee e :  employeelist) {
            System.out.println(e);
        }
    }

    public void searchEmployee() {
        boolean flag = false;
        System.out.println("Enter employee name :");
        String name = scanner.nextLine();
        employeelist = employee.readDataFromFile();
        for (Employee employee : employeelist) {
            if (employee.getName().equals(name)) {
                System.out.println(employee);
                flag = true;
            }
        }
        if (!flag) {
            System.err.println("Not found !");
        }
    }

    public void addNewEmployee() {
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                System.out.println("Enter new name");
                String name = scanner.nextLine();
                System.out.println("Enter new bithday (number)");
                String birth = scanner.nextLine();
                System.out.println("Enter new gender");
                String gender = scanner.nextLine();
                System.out.println("Enter new CMND (number)");
                int cmnd = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter new phone (number)");
                int phone = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter new email");
                String email = scanner.nextLine();
                System.out.println("Enter new ID");
                String ID = scanner.nextLine();
                System.out.println("Enter new level");
                String level = scanner.nextLine();
                System.out.println("Enter new position");
                String position = scanner.nextLine();
                System.out.println("Enter new Salary (number)");
                int salary = Integer.parseInt(scanner.nextLine());
                Employee employee1 = new Employee(name, birth, gender, cmnd, phone, email, ID, level, position, salary);

                if (EmployeeToCsv.file.length() > 0) {
                    employeelist = employee.readDataFromFile();
                }
                employeelist.add(employee1);
                employee.writeToFile(employeelist);
            } catch (Exception e) {
                System.err.println("Error type of input");
                flag = true;
            }
        }
    }

    public void deleteEmployee() {
        System.out.println("Enter name to delete !");
        String name = scanner.nextLine();
        employeelist = employee.readDataFromFile();
        employeelist.removeIf(e -> e.getName().equals(name));
        employee.writeToFile(employeelist);
        showInfoList();
    }

    public void editInfoEmployee() {
        System.out.println("Enter name of employee to edit !");
        String name = scanner.nextLine();
        employeelist = employee.readDataFromFile();
        for (Employee e : employeelist) {
            if (e.getName().equals(name)) {
                boolean flag = true;
                while (flag) {
                    try {
                        System.out.println("1 Edit name" + "\n" + "2 Edit birthday" + "\n" + "3 Edit gender" + "\n" + "4 Edit CMND" + "\n" + "5 Edit phoneNumber" + "\n" + "6 Edit email" + "\n" + "7 Edit staff ID" + "\n" + "8 Edit level" + "\n" + "9 Edit position" + "\n" + "10 Edit salary" + "\n" + "11 Finish edit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("Enter new name");
                                e.setName(scanner.nextLine());
                                break;
                            case 2:
                                System.out.println("Enter new bithday");
                                e.setBirthday(scanner.nextLine());
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
                                System.out.println("Enter new staff ID");
                                e.setStaffID(scanner.nextLine());
                                break;
                            case 8:
                                boolean flag1 = true;
                                while (flag1) {
                                    flag1 = false;
                                    try {
                                        System.out.println("Enter new level" + "\n" + "1.INTERMEDIATE" + "\n" + "2.COLLEGE" + "\n" + "3.UNIVERSITY" + "\n" + "4.AFFTERUNIVERSITY");
                                        int choice1 = Integer.parseInt(scanner.nextLine());
                                        switch (choice1) {
                                            case 1:
                                                e.setLevel(Employee.INTERMEDIATE);
                                                break;
                                            case 2:
                                                e.setLevel(Employee.COLLEGE);
                                                break;
                                            case 3:
                                                e.setLevel(Employee.UNIVERSITY);
                                                break;
                                            case 4:
                                                e.setLevel(Employee.AFFTERUNIVERSITY);
                                                break;
                                        }
                                    } catch (Exception e1) {
                                        System.err.println("Invalid input, enter number!");
                                        flag1 = true;
                                    }
                                }
                                break;
                            case 9:
                                boolean flag2 = true;
                                while (flag2) {
                                    flag2 = false;
                                    try {
                                        System.out.println("Enter new position" + "\n" + "1.RECEPTION" + "\n" + "2.WAITERS" + "\n" + "3.EXPERT" + "\n" + "4.SUPERVIOR" + "\n" + "5.MANAGER" + "\n" + "6.GM");
                                        int choice2 = Integer.parseInt(scanner.nextLine());
                                        switch (choice2) {
                                            case 1:
                                                e.setPosition(Employee.RECEPTION);
                                                break;
                                            case 2:
                                                e.setPosition(Employee.WAITERS);
                                                break;
                                            case 3:
                                                e.setPosition(Employee.EXPERT);
                                                break;
                                            case 4:
                                                e.setPosition(Employee.SUPERVIOR);
                                                break;
                                            case 5:
                                                e.setPosition(Employee.MANAGER);
                                                break;
                                            case 6:
                                                e.setPosition(Employee.GM);
                                                break;
                                        }
                                    } catch (Exception exception) {
                                        System.err.println("Invalid input,enter number !");
                                        flag2 = true;
                                    }
                                }
                                break;
                            case 10:
                                System.out.println("Enter new Salary");
                                e.setSalary(Integer.parseInt(scanner.nextLine()));
                                break;
                            case 11:
                                flag = false;
                                break;
                            default:
                                System.out.println("Invalid input");
                        }
                    } catch (Exception error) {
                        System.err.println("Invalid input.The value still can not edit,try again !");
                        flag = true;
                    }
                }
            }
        }
        employee.writeToFile(employeelist);
        showInfoList();
    }
}
