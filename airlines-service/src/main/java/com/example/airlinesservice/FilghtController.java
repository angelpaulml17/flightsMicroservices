package com.example.airlinesservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/flights")
@RestController
public class FilghtController {
    private List<Flights> flights = Arrays.asList(
            new Flights(1, "Boeing", "Dubai"),
            new Flights(2, "Air India", "South korea"));
    
    @GetMapping
    public List<Flights> getAllflights() {
        return flights;
    }
    
    @GetMapping("/{id}")
    public Flights getflightsById(@PathVariable int id) {
        return flights.stream()
                        .filter(customer -> customer.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
}