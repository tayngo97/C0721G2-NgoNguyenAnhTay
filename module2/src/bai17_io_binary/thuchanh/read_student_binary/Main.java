package bai17_io_binary.thuchanh.read_student_binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {

            FileOutputStream fos = new FileOutputStream(path,true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            try {
                oos.writeObject(students);
            } catch (IOException e) {
                e.printStackTrace();
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students =(List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        writeToFile("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\src\\student_data.csv",students);


        List<Student> studentList = readDataFromFile("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\src\\student_data.csv");
        studentList.forEach(System.out::println);
    }
}
