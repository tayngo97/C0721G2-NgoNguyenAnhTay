package bai16_io_textfile.baitap.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            String line;
            File file = new File("C:\\C0721G2_NgoNguyenAnhTay\\module_2\\src\\countries.csv");
            if (!file.canRead()){
                throw new FileNotFoundException();
            }
            br = new BufferedReader(new FileReader(file));

            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}
