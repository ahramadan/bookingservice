package com.example.bookingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingControler {

    @GetMapping("/book")
    public String book() {
        return "Book Service !";
    }
}
