package com.airline_management.airlinemanagementsystem.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private String id;
    private String flightId;
    private String passengerName;
    private String email;
    private String seatNumber;
    private double price;
}