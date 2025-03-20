package com.airline_management.airlinemanagementsystem.service;

import com.airline_management.airlinemanagementsystem.dto.Flight;
import com.airline_management.airlinemanagementsystem.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights(String sortOrder) {
        return flightRepository.getAllFlightsSorted(sortOrder);
    }

    public Optional<Flight> getFlightById(Integer id) {
        return flightRepository.getFlightById(id);
    }
}