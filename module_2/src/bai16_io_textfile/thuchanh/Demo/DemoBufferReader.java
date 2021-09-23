package bai16_io_textfile.thuchanh.Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DemoBufferReader {
    public static void main(String[] args) {

        // cach 1 :
//        File f = new File("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\src\\bai16_io_textfile\\thuchanh\\data2.txt");
//        try {
//            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//            String line = null ;
//            while (true){
//                line = br.readLine();
//                if (line == null){
//                    break;
//                }else System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // cach 2 :
        File f2 = new File("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\data.txt");
        try {
            List<String> allText =  Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
            allText.forEach(System.out::println);
        }catch (Exception e){
           e.printStackTrace();
        }
    }
}
