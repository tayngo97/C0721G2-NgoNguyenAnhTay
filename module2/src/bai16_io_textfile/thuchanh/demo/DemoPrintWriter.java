package bai16_io_textfile.thuchanh.demo;

import java.io.PrintWriter;

public class DemoPrintWriter {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("data2.txt", "UTF-8");
            pw.println("Hello");
            pw.print("Database");
            pw.println(123);
            Student student = new Student("Nam",24,7.5);
            pw.print(student);
            pw.flush(); // chu y : flush va close
            pw.close();
        }catch (Exception o){
            o.printStackTrace();
        }
    }
}
