package bai16_io_textfile.thuchanh.Demo.students_system;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();


        while(true) {
            System.out.println("Optione\n" +
                    "1. Add\n" +
                    "2. Show\n" +
                    "3. Delete\n" +
                    "4. Edit\n" +
                    "5. Search\n" +
                    "0. Exit\n");
            System.out.print("Your choice:");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());


            switch (choice) {
//                case 1:
////                    managerStudent.add();
////                    break;
                case 2:
                    managerStudent.printList();
                    break;
//                case 3:
//                    //delete
//                    System.out.print("Enter student's name to delete");
//                    managerStudent.deleteID(sc.nextLine());
//                    break;
//                case 4:
//                    //edit
//                    System.out.print("Enter student's ID to edit");
//                    managerStudent.editID(sc.nextInt());
//                    break;
//                case 5:
//                    //search
//                    boolean searchedCheck= false;
//                    do {
//                        System.out.print("Enter information of student to search:");
//                        searchedCheck = managerStudent.search(sc.nextLine());
//                    }while(searchedCheck);
//                    break;
                case 6:
                    System.out.println("Nhap ten File");
                    String tenFile = sc.nextLine();
                    File f = new File(tenFile);
                    managerStudent.writeDataInFile(f);
                    break;
                case 7:
                    System.out.println("Nhap ten File");
                    //C:\C0721G2_NgoNguyenAnhTay\module_2\student_data.txt
                    String tenFile1 = sc.nextLine();
                    File f1 = new File(tenFile1);
                    managerStudent.readDataInFile(f1);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid value, please enter ordinal number(1,2,3,4)");
            }
        }
    }
}
