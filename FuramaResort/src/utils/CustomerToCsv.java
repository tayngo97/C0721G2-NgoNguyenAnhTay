package utils;

import models.person.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CustomerToCsv {
    private static File file = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\customer.csv");

    public static List<Customer> readDataFromFile() {
        List<Customer> customerList = new LinkedList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] customer = line.split(",");

                customerList.add(new Customer(customer[0],customer[1], customer[2], Integer.parseInt(customer[3]), Integer.parseInt(customer[4]),
                        customer[5], customer[6], customer[7], customer[8]));
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return customerList;
    }

    public static void writeToFile(List<Customer> customers) {

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Customer customer : customers) {
                bw.write(customer.stringToWrite());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
