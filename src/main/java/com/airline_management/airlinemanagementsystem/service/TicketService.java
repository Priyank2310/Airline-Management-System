package com.airline_management.airlinemanagementsystem.service;

import com.airline_management.airlinemanagementsystem.dto.Ticket;
import com.airline_management.airlinemanagementsystem.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket bookTicket(Ticket ticket) {
        if (ticketRepository.existsById(ticket.getId())) {
            throw new IllegalArgumentException("Ticket with this ID already exists.");
        }
        return ticketRepository.save(ticket);
    }

    public Optional<Ticket> getTicketById(String id) {
        return ticketRepository.findById(id);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public String cancelTicket(String id) {
        if (!ticketRepository.existsById(id)) {
            throw new IllegalArgumentException("Ticket not found.");
        }
        ticketRepository.deleteById(id);
        return "Ticket cancelled successfully.";
    }
}