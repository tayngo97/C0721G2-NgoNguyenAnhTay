package utils;

import facility_buider.HouseBuider;
import facility_buider.RoomBuider;
import facility_buider.VillaBuider;
import models.person.Customer;
import models.service.Booking;
import models.service.Facility;

import java.io.*;
import java.util.*;

public class BookingStackToCsv {
    public static File bookingFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\booking_stack.csv");

    public static Stack<Booking> readDataFromFile() {
        Stack<Booking> bookingQueue = new Stack<>();
        try {
            FileReader fr = new FileReader(bookingFile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] booking = line.split(",");

                Customer customer1 = new Customer(booking[3], booking[4], booking[5], Integer.parseInt(booking[6]), Integer.parseInt(booking[7]), booking[8], booking[9], booking[10], booking[11]);
                String bookingId = booking[13];
                Facility facility;
                if (bookingId.contains("SVVL")) {
                    facility = new VillaBuider()
                            .addServiceName(booking[12])
                            .addServiceId(booking[13])
                            .addUsableArea(booking[14])
                            .addRentalCost(booking[15])
                            .addNumberOfTenants(booking[16])
                            .addTypeOfRent(booking[17])
                            .addRoomStandard(booking[18])
                            .addPoolArea(booking[19])
                            .addNumOfFloor(booking[20])
                            .build();
                } else if (bookingId.contains("SVHO")) {
                    facility = new HouseBuider()
                            .addServiceName(booking[12])
                            .addServiceId(booking[13])
                            .addUsableArea(booking[14])
                            .addRentalCost(booking[15])
                            .addNumberOfTenants(booking[16])
                            .addTypeOfRent(booking[17])
                            .addRoomStandard(booking[18])
                            .addNumOfFloor(booking[19])
                            .build();
                } else
                    facility = new RoomBuider()
                            .addServiceName(booking[12])
                            .addServiceId(booking[13])
                            .addUsableArea(booking[14])
                            .addRentalCost(booking[15])
                            .addNumberOfTenants(booking[16])
                            .addTypeOfRent(booking[17])
                            .addPromotionService(booking[18])
                            .build();
                bookingQueue.add(new Booking(booking[0], booking[1], booking[2], customer1, facility));
            }

            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bookingQueue;
    }

    public static void writeToFile(Stack<Booking> bookings) {
        try {
            FileWriter fw = new FileWriter(bookingFile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Booking booking : bookings) {
                bw.write(booking.stringToWrite());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
