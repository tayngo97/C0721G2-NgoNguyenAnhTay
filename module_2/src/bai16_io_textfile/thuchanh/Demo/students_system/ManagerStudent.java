package bai16_io_textfile.thuchanh.Demo.students_system;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerStudent {
   public static List<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

//    static {
//        Student student1 = new Student(123,"thien", 24, "ldh");
//        Student student2 = new Student(124,"minh", 23, "abc");
//        Student student3 = new Student(125,"thinh", 25, "nbk");
//        Student student4 = new Student(126,"long", 30, "sdc");
//        Student student5 = new Student(127,"dat", 20, "lhh");
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//        studentList.add(student5);
//    }
//    public int getSize(){
//        int count = 0;
//        for (int i = 0; i < studentList.length; i++) {
//            count++;
//        }
//        return count;
//    }
//
//    public void add() {
//        System.out.println("Enter ID:");
//        int id = Integer.parseInt(sc.nextLine());
//        System.out.println("Enter name:");
//        String name = sc.nextLine();
//        System.out.println("Enter age:");
//        int age = Integer.parseInt(sc.nextLine());
//        System.out.println("Enter address:");
//        String address = sc.nextLine();
//        Student student = new Student(id, name, age, address);
//        for (int i = 0; i < studentList.length; i++) {
//            if (studentList[i] == null) {
//                studentList[i] = student;
//                break;
//            }
//        }
//    }
//
//    public void deleteID(String nameStudent) {
//        for (int i = 0; i < studentList.length; i++) {
//            if (studentList[i].name.equals(nameStudent)) {
//                for (int j = i; j < studentList.length; j++) {
//                    if (studentList[j + 1] != null) {
//                        studentList[j] = studentList[j + 1];
//                    } else {
//                        studentList[j] = null;
//                        break;
//                    }
//                }
//                break;
//            }
//        }
//        printList();
//    }
//
//    public void editID(int idStudent) {
//        for (int i = 0; i < studentList.length; i++) {
//            if (idStudent == studentList[i].id) {
//                boolean checkEdit = true;
//                while (checkEdit) {
//                    System.out.println(studentList[i].toString());
//                    System.out.print("1.ID\n" +
//                            "2.Name\n" +
//                            "3.Age\n" +
//                            "4.Address\n" +
//                            "0.Exit\n" +
//                            "Choose section you want to edit:");
//                    switch (Integer.parseInt(sc.nextLine())) {
//                        case 1:
//                            System.out.print("Enter new ID:");
//                            studentList[i].setId(Integer.parseInt(sc.nextLine()));
//                            break;
//                        case 2:
//                            System.out.print("Enter new Name:");
//                            studentList[i].setName(sc.nextLine());
//                            break;
//                        case 3:
//                            System.out.print("Enter new age");
//                            studentList[i].setAge(Integer.parseInt(sc.nextLine()));
//                            break;
//                        case 4:
//                            System.out.print("Enter new address");
//                            studentList[i].setAddress(sc.nextLine());
//                            break;
//                        case 0:
//                            checkEdit = false;
//                            break;
//                        default:
//                            System.out.println("invalid value, please enter ordinal number(1,2,3,4)");
//                    }
//                }
//                break;
//            }
//        }
//        printList();
//    }
//
//    public Boolean search(String infor) {
//        for (int i = 0; i < studentList.length; i++) {
//            if (infor.equals(String.valueOf(studentList[i].getId()))
//                    ||infor.equals(String.valueOf(studentList[i].getAge()))
//                    ||infor.equals(studentList[i].getName())
//                    ||infor.equals(studentList[i].getAddress())
//            ) {
//                System.out.println(studentList[i]);
//                return true;
//            }
//        }
//        System.out.println("this infor isn't exist");
//        return false;
//    }
//
    public void printList(){
        for (Student e: studentList) {
            System.out.print(e + "\n");
        }
    }

    public void writeDataInFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for (Student sinhvien: studentList) {
                    oos.writeObject(sinhvien);
            }

            oos.flush();
            oos.close();
        }catch (Exception e){
                e.printStackTrace();
        }
    }

    public void readDataInFile(File f1) {
        try {
            InputStream is = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(is);
            Student st = null ;
            while (true){
                Object oj = ois.readObject();
                if (oj == null){
                    break;
                }
                if (oj !=null){
                    st = (Student) oj;
                    this.studentList.add(st);
                }

            }
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
