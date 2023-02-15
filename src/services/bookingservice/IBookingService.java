package services.bookingservice;

import models.booking.Booking;

public interface IBookingService {
    void addBooking(Booking booking);

    //thêm
    void displayBooking();
    //hiển thị danh sách
}
