package com.airline_management.airlinemanagementsystem.service;

import com.airline_management.airlinemanagementsystem.dto.Flight;
import com.airline_management.airlinemanagementsystem.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights(String sortOrder) {
        return flightRepository.getAllFlightsSorted(sortOrder);
    }

    public Optional<Flight> getFlightById(Integer id) {
        return flightRepository.getFlightById(id);
    }

    public List<Flight> getFlightSchedules(Integer id, String date) {
        return flightRepository.findByIdAndDepartureDate(id, date);
    }

    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
