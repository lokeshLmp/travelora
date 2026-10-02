package com.travelora.booking.controller;

import com.travelora.booking.model.Booking;
import com.travelora.booking.service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/java/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    // Create a new booking
    @PostMapping
    public ResponseEntity<Booking> createBooking(
            @RequestBody Booking booking) {

        Booking savedBooking = bookingService.createBooking(booking);

        return ResponseEntity.ok(savedBooking);
    }

    // Get booking using booking ID
    @GetMapping("/{bookingId}")
    public ResponseEntity<Booking> getBooking(
            @PathVariable String bookingId) {

        return bookingService.getBookingById(bookingId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get all bookings of a user
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Booking>> getUserBookings(
            @PathVariable String userId) {

        return ResponseEntity.ok(
                bookingService.getBookingsByUser(userId)
        );
    }
}