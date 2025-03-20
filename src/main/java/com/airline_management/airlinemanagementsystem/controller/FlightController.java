package com.airline_management.airlinemanagementsystem.controller;

import com.airline_management.airlinemanagementsystem.dto.Flight;
import com.airline_management.airlinemanagementsystem.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<Flight> getAllFlights(@RequestParam(required = false, defaultValue = "asc") String sort) {
        return flightService.getAllFlights(sort);
    }

    @GetMapping("/{id}")
    public Optional<Flight> getFlightById(@PathVariable Integer id) {
        return flightService.getFlightById(id);
    }
}