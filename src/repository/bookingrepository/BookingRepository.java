package repository.bookingrepository;

import data.ReadWriteBooking;
import models.booking.Booking;

import java.util.Queue;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    static TreeSet<Booking> bookingSet = new TreeSet<>();

    static {
        bookingSet.add(new Booking("1", "11/01/2000", "11/03/2000", "1", "vui chơi"));
        bookingSet.add(new Booking("2", "11/01/2000", "11/04/2000", "2", "giải trí"));
        bookingSet.add(new Booking("3", "11/02/2000", "11/05/2000", "3", "karaoke"));

    }

    @Override
    public void addBooking(Booking booking) {
        bookingSet.add(booking);
        ReadWriteBooking.writeBooking((Queue<Booking>) bookingSet);
    }

    @Override
    public void displayBooking() {
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println(bookingSet);
    }
}
