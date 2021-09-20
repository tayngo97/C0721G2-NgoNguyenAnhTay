package bai16_io_textfile.thuchanh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        List<Student> studentList = main.readFile();
        for (Student o : studentList) {
            System.out.println(o + " ");
        }
    }

    public void writeToFile(List<Student> studentList ){
        try {
            FileWriter fw = new FileWriter("data.txt",false);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student o : studentList) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e){
            System.err.println("Error");
        }
    }



    public List<Student> readFile(){
        List<Student> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true){
                line = br.readLine();
                if (line == null){
                    break;
                }
                String[] txt = line.split(",");
                System.out.println(line);
                String name = txt[0];
                int age = Integer.parseInt(txt[1]);
                double mark = Double.parseDouble(txt[2]);
                list.add(new Student(name,age,mark));
            }
        }catch (Exception e){
            System.err.println("Error");
        }
        return list;
    }

}
