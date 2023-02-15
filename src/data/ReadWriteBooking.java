package data;

import models.booking.Booking;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class ReadWriteBooking {
    public static final String BOOKING_CSV = "E:\\FuramaResort\\src\\data\\booking.csv";

    public Queue<Booking> readBookingCSV() {

        Queue<Booking> bookingQueue = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader buff = null;

        try {
            fileReader = new FileReader(BOOKING_CSV);
            buff = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Booking booking;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                String bookingCode = temp[0];
                String startDate = temp[1];
                String endDate = temp[2];
                String customerCode = temp[3];
                String serviceName = temp[4];
                booking = new Booking(bookingCode, startDate, endDate, customerCode, serviceName);
                bookingQueue.add(booking);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bookingQueue;
    }

    public static void writeBooking(Queue<Booking> bookings) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(BOOKING_CSV);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedWriter = new BufferedWriter(fileWriter);
        for (Booking booking : bookings) {
            try {
                bufferedWriter.write(booking.getBookingCode() + "," + booking.getStartDate() + ","
                        + booking.getEndDate() + "," + booking.getCustomerCode() + "," + booking.getServiceName() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
