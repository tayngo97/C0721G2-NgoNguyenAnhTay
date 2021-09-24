package bai16_io_textfile.baitap.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        BufferedReader br = null;
        try {
            String line;
            File file = new File("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\src\\countries.csv");
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

        for (Country o: countryList) {
            System.out.println(o);
        }
    }




}
