package utils;

import models.person.Customer;
import models.service.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ContractToCsv {
    public static File contractFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\contract.csv");
    protected static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public static Queue<Contract> readDataFromFile() {
        Queue<Contract> bookingSet = new ArrayDeque<>();
        try {
            FileReader fr = new FileReader(contractFile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] contract = line.split(",");

                Customer customer = new Customer(contract[4], contract[5], contract[6]
                        , Integer.parseInt(contract[7]), Integer.parseInt(contract[8]),
                        contract[9], contract[10], contract[11], contract[12]);


                Facility facility = null;
                if (contract[14].contains("SVVL")) {
                    facility = new Villa(contract[13], contract[14], contract[15], contract[16], contract[17], contract[18], contract[19], contract[20], contract[21]);
                } else if (contract[14].contains("SVHO")) {
                    facility = new House(contract[13], contract[14], contract[15], contract[16], contract[17], contract[18], contract[19], contract[20]);
                } else
                    facility = new Room(contract[13], contract[14], contract[15], contract[16], contract[17], contract[18], contract[19]);

                Booking booking = new Booking(contract[1], contract[2], contract[3], customer, facility);
                bookingSet.add(new Contract(contract[0], booking, Integer.parseInt(contract[2]), Integer.parseInt(contract[3])));
            }

            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bookingSet;
    }

    public static void writeToFile(Queue<Contract> contracts) {
        try {
            FileWriter fw = new FileWriter(contractFile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Contract contract : contracts) {
                bw.write(contract.stringToWrite());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
