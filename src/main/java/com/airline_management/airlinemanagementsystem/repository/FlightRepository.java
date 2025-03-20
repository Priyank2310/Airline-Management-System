package com.airline_management.airlinemanagementsystem.repository;

import com.airline_management.airlinemanagementsystem.dto.Flight;
import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class FlightRepository {

    private final List<Flight> flights = new ArrayList<>();

    @PostConstruct
    public void init() {
        flights.add(new Flight(1, "Indigo", "Nagpur", "Pune", "2025-03-20T23:00:00", "2025-03-21T01:30:00", 5000.0));
        flights.add(new Flight(2, "Air India", "Mumbai", "Delhi", "2025-03-21T10:00:00", "2025-03-21T12:30:00", 7000.0));
        flights.add(new Flight(3, "SpiceJet", "Bangalore", "Hyderabad", "2025-03-21T14:00:00", "2025-03-21T16:00:00", 4000.0));
    }

    public List<Flight> getAllFlightsSorted(String sortOrder) {
        return flights.stream()
                .sorted(Comparator.comparing(Flight::getId,
                        "desc".equalsIgnoreCase(sortOrder) ? Comparator.reverseOrder() : Comparator.naturalOrder()))
                .collect(Collectors.toList());
    }

    public Optional<Flight> getFlightById(Integer id) {
        return flights.stream().filter(flight -> flight.getId().equals(id)).findFirst();
    }

    public List<Flight> findByIdAndDepartureDate(Integer id, String date) {
        return flights.stream()
                .filter(flight -> flight.getId().equals(id) && flight.getDepartureTime().startsWith(date))
                .collect(Collectors.toList());
    }

    public Flight save(Flight flight) {
        flights.add(flight);
        return flight;
    }
}
