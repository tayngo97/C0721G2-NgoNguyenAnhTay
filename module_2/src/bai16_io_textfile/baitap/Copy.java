package bai16_io_textfile.baitap;

import java.io.*;

public class Copy {
    public void copyFile(String path){
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            File a = new File(path);
            FileReader fileReader = new FileReader(a);

            while (true){
                String line = br.readLine();
                if (line != null){
                    System.out.println(line);
                }
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
