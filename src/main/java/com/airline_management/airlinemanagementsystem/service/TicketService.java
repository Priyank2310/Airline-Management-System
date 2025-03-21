package com.airline_management.airlinemanagementsystem.service;

import com.airline_management.airlinemanagementsystem.dto.Ticket;
import com.airline_management.airlinemanagementsystem.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.createTicket(ticket);
    }

    public Ticket getTicketById(String id) {
        return ticketRepository.getTicketById(id);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.getAllTickets();
    }

    public String deleteTicket(String id) {
        return ticketRepository.deleteTicket(id);
    }
}