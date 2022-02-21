package com.example.bookingservice;
public class Booking {
    private final int id;
    private final int flightId;
    private final int price;
    private final int seats;

    public Booking (final int id, final int flightId, final int price, final int seats) {
        this.id = id;
        this.flightId= flightId;
        this.price= price;
        this.seats=seats;
    }

    public int getId() {
        return id;
    }

    public int getFlightId() {
        return flightId;
    }

    public int getPrice() {
        return price;
    }
    public int getSeats() {
    	return seats;
    }
}