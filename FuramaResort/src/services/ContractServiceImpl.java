package services;

import models.service.Booking;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    protected static TreeSet<Booking> bookinglist = BookingServiceImpl.bookingTreeSet;
    protected static ArrayDeque<Booking> bookingQueue = new ArrayDeque<>();

    static {
        for (Booking e : bookinglist) {
            bookingQueue.offer(e);
        }
    }

//    public static void convertSettoQueue(){
//        for (Booking e: bookinglist ) {
//            bookingQueue.offer(e);
////            System.out.println(e.toString());
//        }
////        System.out.println(bookinglist.size());
////        System.out.println(bookingQueue.size());
//    }

    public static void showListBK(){
        while (!bookingQueue.isEmpty()){
            System.out.println(bookingQueue.poll());
        }
    }


    public static void main(String[] args) {
        showListBK();
    }
}



