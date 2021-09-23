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


    @Override
    public void CreateNewContracts() {

    }

    @Override
    public void DisplayListContracts() {
        for (Booking element: bookingQueue) {
            if (element == null){
                break;
            }

        }
    }

    @Override
    public void EditContracts() {

    }
}



