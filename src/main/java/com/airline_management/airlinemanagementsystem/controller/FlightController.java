package com.airline_management.airlinemanagementsystem.controller;

import com.airline_management.airlinemanagementsystem.dto.Flight;
import com.airline_management.airlinemanagementsystem.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }
}