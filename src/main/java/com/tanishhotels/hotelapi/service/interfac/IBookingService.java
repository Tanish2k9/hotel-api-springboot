package com.tanishhotels.hotelapi.service.interfac;

import com.tanishhotels.hotelapi.dto.Response;
import com.tanishhotels.hotelapi.entity.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
