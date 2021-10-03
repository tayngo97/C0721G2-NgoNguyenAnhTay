package utils;

import models.person.Employee;
import models.service.Voucher;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class VoucherToCsv {
    public static File voucherFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\voucher.csv");

    public static Queue<Voucher> readDataFromFile() {
        Queue<Voucher> vouchers = new ArrayDeque<>();
        try {
            FileReader fr = new FileReader(voucherFile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {

                vouchers.offer(new Voucher(line));
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return vouchers;
    }

    public static void writeToFile(Queue<Voucher> vouchers) {

        try {
            FileWriter fw = new FileWriter(voucherFile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Voucher voucher : vouchers) {
                bw.write(voucher.voucherToWrite());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
