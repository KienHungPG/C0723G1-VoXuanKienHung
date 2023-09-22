package casestudy.controller;

import casestudy.view.BookingManagementView;

public class BookingController {
    private final BookingManagementView bookingManagementView = new BookingManagementView();

    public void runBooking() {
        bookingManagementView.displayBookingMenu();
    }
}
