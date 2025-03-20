package com.airline_management.airlinemanagementsystem.service;

import com.airline_management.airlinemanagementsystem.dto.Flight;
import com.airline_management.airlinemanagementsystem.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.getAllFlights();
    }
}