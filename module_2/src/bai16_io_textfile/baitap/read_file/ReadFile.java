package bai16_io_textfile.baitap.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static ArrayList<Country> readFile(String path){
        ArrayList<Country> countryList = new ArrayList<>();
        BufferedReader br = null;
        try {
            String line;
            File file = new File(path);
            if (!file.canRead()){
                throw new FileNotFoundException();
            }
            br = new BufferedReader(new FileReader(file));

            while ((line = br.readLine()) != null) {
                String[] csv =  line.split(",");
                int id = Integer.parseInt(csv[0]);
                String code = csv[1];
                String name = csv [2];
                countryList.add(new Country(id,code,name));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countryList;
    }
}
