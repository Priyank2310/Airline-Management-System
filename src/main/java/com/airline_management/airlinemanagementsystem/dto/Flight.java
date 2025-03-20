package com.airline_management.airlinemanagementsystem.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Flight {
    private int id;
    private String airline;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private double price;
}
