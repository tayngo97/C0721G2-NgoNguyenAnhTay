package services;

import models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employeelist = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static{
        Employee employee1 = new Employee("Nam", 1990, "Male", 204331, 1990, "nam@gmail.com", "AA116", Employee.INTERMEDIATE, Employee.RECEPTION, 12000);
        Employee employee2 = new Employee("Long", 1990, "Male", 204332, 1991, "Long@gmail.com", "AA110", Employee.AFFTERUNIVERSITY, Employee.SUPERVIOR, 10000);
        Employee employee3 = new Employee("Lam", 1990, "Male", 204333, 1991, "lam@gmail.com", "AA112", Employee.COLLEGE, Employee.WAITERS, 6000);
        employeelist.add(employee1);employeelist.add(employee2);employeelist.add(employee3);
    }

    public void showInfoList() {
        for (Employee e : employeelist) {
            System.out.println(e);
        }
    }

    public void addNewEmployee() {
        System.out.println("Enter new name");
        String name = scanner.nextLine();
        System.out.println("Enter new bithday");
        int birth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new gender");
        String gender = scanner.nextLine();
        System.out.println("Enter new CMND");
        int cmnd = scanner.nextInt();
        System.out.println("Enter new phone");
        int phone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new email");
        String email = scanner.nextLine();
        System.out.println("Enter new ID");
        String ID = scanner.nextLine();
        System.out.println("Enter new level");
        String level = scanner.nextLine();
        System.out.println("Enter new position");
        String position = scanner.nextLine();
        System.out.println("Enter new Salary");
        int salary = scanner.nextInt();
        Employee employee = new Employee(name, birth, gender, cmnd, phone, email, ID, level, position, salary);
        employeelist.add(employee);
    }

    public void editInfoEmployee() {
        System.out.println("Enter name of employee to edit !");
        String name = scanner.nextLine();
        for (Employee e : employeelist) {
            if (e.getName().equals(name)) {
                while (true) {
                    System.out.println("1 Edit name" + "\n" + "2 Edit birthday" + "\n" + "3 Edit gender" + "\n" + "4 Edit CMND" + "\n" + "5 Edit phoneNumber" + "\n" + "6 Edit email" + "\n" + "7 Edit level" + "\n" + "8 Edit level" + "\n" + "9 Edit position" + "\n" + "10 Edit salary" + "\n" + "11 Finish edit");
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
                            String ID = scanner.nextLine();
                            e.setStaffID(ID);
                            break;
                        case 8:
                            System.out.println("Enter new level" + "\n" + "1.INTERMEDIATE" + "\n" + "2.COLLEGE" + "\n" + "3.UNIVERSITY" + "\n" + "4.AFFTERUNIVERSITY");
                            int choice1 = scanner.nextInt();
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
                                default:
                                    System.out.println("Invalid");
                                    break;
                            }
                            break;
                        case 9:
                            System.out.println("Enter new position" + "\n" +"1.RECEPTION" + "\n" +"2.WAITERS" + "\n" +"3.EXPERT" + "\n" +"4.SUPERVIOR" + "\n" +"5.MANAGER" + "\n" +"6.GM" + "\n");
                            int choice2 = scanner.nextInt();
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
                                default:
                                    System.out.println("Invalid");
                                    break;
                            }
                            break;
                        case 10:
                            System.out.println("Enter new Salary");
                            int salary = scanner.nextInt();
                            e.setSalary(salary);
                            break;
                        case 11:
                            return;
                        case 12:
                            System.out.println("Invalid input");
                            continue;
                    }
                }
            }
        }
        showInfoList();
    }


}
