package services.bookingservice;

import repository.bookingrepository.BookingRepository;

public class BookingService implements IBookingService {
    BookingRepository bookingRepository = new BookingRepository();

    @Override
    public void addBooking() {
        bookingRepository.addBooking();
    }

    @Override
    public void displayBooking() {
        bookingRepository.displayBooking();
    }
}
