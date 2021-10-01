package utils;

import models.service.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class VillaToCSV {
    public static File villaFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\villa.csv");


    public  Map<Villa, Integer> readDataFromFile() {
        Map<Villa, Integer> facilityIntegerMap = new LinkedHashMap<>();
        try {
            FileReader fr = new FileReader(villaFile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] facilities = line.split(",");

                facilityIntegerMap.put(new Villa(facilities[0], facilities[1], facilities[2], facilities[3], facilities[4], facilities[5],
                        facilities[6], facilities[7], facilities[8]),Integer.parseInt(facilities[9]));
            }

            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return facilityIntegerMap;
    }

    public  void writeToFile(Map<Villa, Integer> facilities) {

        try {
            FileWriter fw = new FileWriter(villaFile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Map.Entry<Villa,Integer> villa : facilities.entrySet()) {
                bw.write(villa.getKey().stringToFile() + "," + villa.getValue());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
