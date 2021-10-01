package utils;

import models.service.House;
import models.service.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class HouseToCSV {
    public static File houseFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\house.csv");

    public Map<House, Integer> readDataFromFile() {
        Map<House, Integer> facilityIntegerMap = new LinkedHashMap<>();
        try {
            FileReader fr = new FileReader(houseFile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] facilities = line.split(",");

                facilityIntegerMap.put(new House(facilities[0], facilities[1], facilities[2], facilities[3], facilities[4], facilities[5],
                        facilities[6], facilities[7]),Integer.parseInt(facilities[8]));
            }

            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return facilityIntegerMap;
    }

    public  void writeToFile(Map<House, Integer> facilities) {

        try {
            FileWriter fw = new FileWriter(houseFile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Map.Entry<House,Integer> villa : facilities.entrySet()) {
                bw.write(villa.getKey().stringToFile() + "," + villa.getValue());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
