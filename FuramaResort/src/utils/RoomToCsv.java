package utils;

import models.service.House;
import models.service.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RoomToCsv {
    public static File roomFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\room.csv");

    public Map<Room, Integer> readDataFromFile() {
        Map<Room, Integer> facilityIntegerMap = new LinkedHashMap<>();
        try {
            FileReader fr = new FileReader(roomFile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] facilities = line.split(",");

                facilityIntegerMap.put(new Room(facilities[0], facilities[1], facilities[2], facilities[3], facilities[4], facilities[5],
                        facilities[6]),Integer.parseInt(facilities[7]));
            }

            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return facilityIntegerMap;
    }

    public  void writeToFile(Map<Room, Integer> facilities) {

        try {
            FileWriter fw = new FileWriter(roomFile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Map.Entry<Room,Integer> villa : facilities.entrySet()) {
                bw.write(villa.getKey().stringToFile() + "," + villa.getValue());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
