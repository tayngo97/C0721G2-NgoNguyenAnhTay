package services;

import models.person.Voucher;
import models.service.Booking;

import java.awt.print.Book;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PromotionServiceImpl implements PromotionService {
    protected static Scanner scanner = new Scanner(System.in);
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    protected DateFormat getMonth = new SimpleDateFormat("MM");
    protected SimpleDateFormat getYear = new SimpleDateFormat("yyyy");
    protected static TreeSet<Booking> bookingTreeSet = BookingServiceImpl.bookingTreeSet;
    protected static Stack<Booking> bookingStack = new Stack<>();
    protected static ArrayDeque<Voucher> voucherQueue = new ArrayDeque<>();
    protected static ArrayDeque<Voucher> vouchers = new ArrayDeque<>();


    @Override
    public void displayCustomerUseService() {
        System.out.println("Enter year that customer used services !");
        String year = scanner.nextLine();
        for (Booking e : bookingTreeSet) {
            try {
                Date date = dateFormat.parse(e.getCheckinTime());
                String year1 = getYear.format(date);
                if (year1.equals(year)) {
                    System.out.println(e);
                }
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
        }
    }

    @Override
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
        System.out.println("The number of customer have booked in this month : " + bookingTreeSet.size() + " person");

        while (voucherQueue.size() < bookingStack.size()) {
            int choice = 0;
            boolean flag = true;
            while (flag){
                flag = false;
                try {
                    System.out.println("1.Discount 50%" + "\n" + "2.Discount 20%" + "\n" + "3.Discount 10%" + "\n" + "Enter your choice");
                   choice = Integer.parseInt(scanner.nextLine());
                }catch (Exception exception){
                    System.err.println("Invalid input !");
                    flag = true;
                }
            }
            switch (choice) {
                case 1:
                    voucherQueue.offer(new Voucher(Voucher.DISCOUNT50));
                    break;
                case 2:
                    voucherQueue.offer(new Voucher(Voucher.DISCOUNT20));
                    break;
                case 3:
                    voucherQueue.offer(new Voucher(Voucher.DISCOUNT10));
                    break;
                default:
                    System.err.println("Invalid input 1-3");
            }
        }
        sortVoucher(voucherQueue, "discount 50%");
        sortVoucher(voucherQueue, "discount 20%");
        sortVoucher(voucherQueue, "discount 10%");
    }

    public static void sortVoucher(ArrayDeque<Voucher> arrayDeque, String typeVoucher) {
        for (Voucher voucher : arrayDeque) {
            if (voucher.getDiscount().equals(typeVoucher)) {
                vouchers.offer(voucher);
            }
        }
    }
}
