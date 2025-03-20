package com.airline_management.airlinemanagementsystem.repository;

import com.airline_management.airlinemanagementsystem.dto.Flight;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

@Component
public class FlightRepository {
    private final List<Flight> flights = new ArrayList<>();

    @PostConstruct
    public void init() {
        flights.add(new Flight(1, "Indigo", "Nagpur", "Pune",
                "2025-03-20T23:00:00", "2025-03-21T01:30:00", 5000.0));
    }

    public List<Flight> getAllFlights() {
        return flights;
    }
}