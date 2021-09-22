package ManagerOfficerSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer() ;

        while (true){
            System.out.println("Select your choice");
            System.out.println("1.To add the officer");
            System.out.println("2.To search the officer");
            System.out.println("3.To showlist Information the officer");
            System.out.println("4.Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Selection the type of officer to Add");
                    System.out.println("1.Worker");
                    System.out.println("2.Engineer");
                    System.out.println("3.Staff");
                    int inputChoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (inputChoice){
                        case 1:
                            System.out.println("Enter name ");
                            String inputName = scanner.nextLine();
                            System.out.println("Enter age ");
                            int inputAge = scanner.nextInt();
                            System.out.println("Enter gender ");
                            scanner.nextLine();
                            String inputGender = scanner.nextLine();
                            System.out.println("Enter Adderss");
                            String inputAdrr = scanner.nextLine();
                            System.out.println("Enter lever");
                            int inputLever = scanner.nextInt();
                            Worker worker = new Worker(inputName,inputAge,inputGender,inputAdrr,inputLever);
                            managerOfficer.addOfficer(worker);
                            managerOfficer.showInfoList();
                            break;
                        case 2:
                            System.out.println("Enter name ");
                            String inputName1 = scanner.nextLine();
                            System.out.println("Enter age ");
                            int inputAge1 = scanner.nextInt();
                            System.out.println("Enter gender ");
                            scanner.nextLine();
                            String inputGender1 = scanner.nextLine();
                            System.out.println("Enter Adderss");
                            String inputAdrr1 = scanner.nextLine();
                            System.out.println("Enter lever");
                            String inputBranh = scanner.nextLine();
                            Engineer engineer = new Engineer(inputName1,inputAge1,inputGender1,inputAdrr1,inputBranh);
                            managerOfficer.addOfficer(engineer);
                            System.out.println(engineer);
                            managerOfficer.showInfoList();
                            break;
                        case 3:
                            System.out.println("Enter name ");
                            String inputName2 = scanner.nextLine();
                            System.out.println("Enter age ");
                            int inputAge2 = scanner.nextInt();
                            System.out.println("Enter gender ");
                            scanner.nextLine();
                            String inputGender2 = scanner.nextLine();
                            System.out.println("Enter Adderss");
                            String inputAdrr2 = scanner.nextLine();
                            System.out.println("Enter lever");
                            String inputTask = scanner.nextLine();
                            Staff staff = new Staff(inputName2,inputAge2,inputGender2,inputAdrr2,inputTask);
                            managerOfficer.addOfficer(staff);
                            managerOfficer.showInfoList();
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    } break;

                case 2:
                    System.out.println("Enter name to search");
                    String name = scanner.nextLine();
                    managerOfficer.searchInfo(name).forEach(o -> System.out.println(o.toString()));
                    break;
                case 3: managerOfficer.showInfoList();break;
                case 4: return;
                default:
                    System.out.println("Invalid"); continue;
            }
        }

    }
}
