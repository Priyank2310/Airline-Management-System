package com.airline_management.airlinemanagementsystem.dto;

import lombok.*;

import jakarta.validation.constraints.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {

    private String id = UUID.randomUUID().toString(); // Auto-generate ticket ID

    @NotBlank(message = "Flight ID cannot be empty.")
    private String flightId;

    @NotBlank(message = "Passenger name cannot be empty.")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Passenger name should contain only alphabets.")
    private String passengerName;

    @NotBlank(message = "Email cannot be empty.")
    @Email(message = "Invalid email format.")
    private String email;

    @NotBlank(message = "Seat number cannot be empty.")
    @Pattern(regexp = "^[A-Z]{1}\\d{1,2}$", message = "Invalid seat format. Example: A1, B12.")
    private String seatNumber;

    @NotNull(message = "Price cannot be null.")
    @Positive(message = "Price must be a positive number.")
    private Double price;
}