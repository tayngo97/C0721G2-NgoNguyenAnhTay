package services;

import models.service.Voucher;
import models.service.Booking;
import utils.BookingStackToCsv;
import utils.BookingToCsv;
import utils.VoucherToCsv;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PromotionServiceImpl implements PromotionService {
    protected static Scanner scanner = new Scanner(System.in);
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    protected DateFormat getMonth = new SimpleDateFormat("MM");
    protected SimpleDateFormat getYear = new SimpleDateFormat("yyyy");
    protected static Stack<Booking> bookingStack = new Stack<>();
    protected static Queue<Voucher> voucherQueue = new ArrayDeque<>();
    protected static Queue<Voucher> vouchers = new ArrayDeque<>();


    public  void displayCustomerUseService() {
        Set<Booking> bookingTreeSet1 = BookingToCsv.readDataFromFile();
        System.out.println("Enter year that customer used services !");
        String year = scanner.nextLine();
        for (Booking booking : bookingTreeSet1) {
            String year2 = "";
            try {
                Date year1 = dateFormat.parse(booking.getCheckinTime());
                year2 = getYear.format(year1);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (year2.equals(year)) {
                System.out.println(booking);
            }
        }
    }

    public void displayCustomerGetVoucher() {
        Calendar cal = Calendar.getInstance();
        String currenTime = dateFormat.format(cal.getTime());
        Date date = null;
        try {
            date = dateFormat.parse(currenTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String currenMonth = getMonth.format(date);
        String currenYear = getYear.format(date);
        Set<Booking> bookingTreeSet = BookingToCsv.readDataFromFile();

        for (Booking e : bookingTreeSet) {
            try {
                Date dateBooking = dateFormat.parse(e.getCheckinTime());
                String yearBooking = getYear.format(dateBooking);
                String monthBooking = getMonth.format(dateBooking);
                if (yearBooking.equals(currenYear) && monthBooking.equals(currenMonth)) {
                    bookingStack.push(e);
                }
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
        }

        createVouchers();
        for (Booking e : bookingStack) {
            System.out.println(e + " => have received: " + vouchers.poll() + " \n  ---------------------------------------------------------------------------");
        }

    }



    public static void createVouchers() {
        System.out.println("The number of customer have booked in this month : " + bookingStack.size() + " person");
        int discount50 = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            System.out.println("Enter the number of voucher discount 50%");
            discount50 = scanner.nextInt();
            if (discount50 > bookingStack.size()) {
                System.out.println("The number of voucher discount 50% cannot exceed " + bookingStack.size() + " please try again!");
                flag = true;
            } else for (int i = 0; i < discount50; i++) {
                voucherQueue.offer(new Voucher(Voucher.DISCOUNT50));
            }
        }

        int discount20 = 0;
        boolean flag1 = true;
        if (bookingStack.size() - discount50 == 0) flag1 = false;
        while (flag1) {
            flag1 = false;
            System.out.println("Enter the number of voucher discount 20%");
            discount20 = scanner.nextInt();
            if (discount20 > bookingStack.size() - discount50) {
                System.out.println("The number of voucher discount 20% cannot exceed " + (bookingStack.size() - discount50) + " please try again!");
                flag1 = true;

            } else for (int i = 0; i < discount20; i++) {
                voucherQueue.offer(new Voucher(Voucher.DISCOUNT20));
            }
        }

        boolean flag2 = true;
        int discount10 = bookingStack.size() - discount50 - discount20;
        if (discount10 == 0) {
            flag2 = false;
        }
        while (flag2) {
            flag2 = false;
            System.out.println("Enter the number of voucher discount 10%");
            discount10 = scanner.nextInt();
            for (int i = 0; i < discount10; i++) {
                voucherQueue.offer(new Voucher(Voucher.DISCOUNT10));
            }
        }
        sortVoucher(voucherQueue, "discount 50%");
        sortVoucher(voucherQueue, "discount 20%");
        sortVoucher(voucherQueue, "discount 10%");
        VoucherToCsv.writeToFile(voucherQueue);
    }

    public static void sortVoucher(Queue<Voucher> arrayDeque, String typeVoucher) {
        for (Voucher voucher : arrayDeque) {
            if (voucher.getDiscount().equals(typeVoucher)) {
                vouchers.offer(voucher);
            }
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }
}
