package services.bookingservice;

import models.booking.Booking;
import repository.bookingrepository.BookingRepository;

public class BookingService implements IBookingService {
    BookingRepository bookingRepository = new BookingRepository();

    @Override
    public void addBooking(Booking booking) {
        bookingRepository.addBooking(booking);
    }

    @Override
    public void displayBooking() {
        bookingRepository.displayBooking();
    }
}
