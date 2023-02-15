package repository.bookingrepository;

import models.booking.Booking;

public interface IBookingRepository {
    void addBooking(Booking booking);

    //thêm
    void displayBooking();
    //hiển thị danh sách
}
