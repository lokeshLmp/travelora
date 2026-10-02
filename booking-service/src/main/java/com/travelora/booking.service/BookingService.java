package com.travelora.booking.service;

import com.travelora.booking.model.Booking;
import com.travelora.booking.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {

        if (booking.getDestination() == null ||
                booking.getDestination().isBlank()) {
            throw new IllegalArgumentException("Destination is required");
        }

        if (booking.getTravelDate() == null ||
                booking.getTravelDate().isBlank()) {
            throw new IllegalArgumentException("Travel date is required");
        }

        if (booking.getTravellersCount() <= 0) {
            throw new IllegalArgumentException(
                    "Travellers count must be greater than zero"
            );
        }

        if (booking.getContact() == null) {
            throw new IllegalArgumentException(
                    "Contact details are required"
            );
        }

        String bookingId = generateBookingId();

        booking.setBookingId(bookingId);
        booking.setStatus("CONFIRMED");
        booking.setCreatedAt(LocalDateTime.now());

        return bookingRepository.save(booking);
    }

    public Optional<Booking> getBookingById(String bookingId) {
        return bookingRepository.findByBookingId(bookingId);
    }

    public List<Booking> getBookingsByUser(String userId) {
        return bookingRepository.findByUserIdOrderByCreatedAtDesc(userId);
    }

    private String generateBookingId() {

        Random random = new Random();

        int number = 10000 + random.nextInt(90000);

        return "TRV-2026-" + number;
    }
}