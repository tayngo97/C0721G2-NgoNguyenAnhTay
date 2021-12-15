package bai16_io_textfile.thuchanh.demo.students_system;

import java.io.*;

public class Text {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\src\\student_data.csv");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            Student st = (Student) ois.readObject();
            System.out.println(st.address);
            System.out.println(st );
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
