package bai12_javacolletion.baitap.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Collections.sort(studentList);
        for(Student st : studentList){
            System.out.println(st.toString());
        }

        Collections.sort(studentList,new AgeComparator());
        System.out.println("So sanh theo tuoi");
        studentList.forEach(o-> System.out.println(o + " "));
    }
}
