package com.example.airlinesservice;
public class Flights {
    private final int id;
    private final String airlinename;
private final String location;

    public Flights(final int id,  final String airlinename, final String location) {
        this.id = id;
        this.airlinename = airlinename;
this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getAirlinename() {
        return airlinename;
    }
 public String getLocation() {
        return location;
    }
}