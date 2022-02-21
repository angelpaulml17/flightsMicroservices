package com.example.bookingservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;
@RequestMapping("/bookings")
@RestController
public class BookControllet {
    private final List<Booking> bookings = Arrays.asList(
            new Booking(1, 1, 1200, 10 ),
            new Booking(2, 1, 9000, 8),
            new Booking(3, 2, 8000, 9));

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookings ;
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable int id) {
        return bookings.stream()
                     .filter(order -> order.getId() == id)
                     .findFirst()
                     .orElseThrow(IllegalArgumentException::new);
    }
}