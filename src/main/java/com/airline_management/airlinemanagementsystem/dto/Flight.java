package com.airline_management.airlinemanagementsystem.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Flight {
    private Integer id;
    private String airline;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private Double price;
}