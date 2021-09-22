package services;

import models.service.Booking;

import java.util.Comparator;

public class BookingComparatorByCheckinTime implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getCheckinTime().compareTo(o2.getCheckinTime()) == 0){
            return o1.getCheckoutTime().compareTo(o2.getCheckoutTime());
        } else  return o1.getCheckinTime().compareTo(o2.getCheckinTime());
    }
}
