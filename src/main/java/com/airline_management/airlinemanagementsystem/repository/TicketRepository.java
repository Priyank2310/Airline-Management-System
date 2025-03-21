package com.airline_management.airlinemanagementsystem.repository;

import com.airline_management.airlinemanagementsystem.dto.Ticket;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TicketRepository {
    private final Map<String, Ticket> tickets = new HashMap<>();

    public Ticket createTicket(Ticket ticket) {
        tickets.put(ticket.getId(), ticket);
        return ticket;
    }

    public Ticket getTicketById(String id) {
        return tickets.get(id);
    }

    public List<Ticket> getAllTickets() {
        return List.copyOf(tickets.values());
    }

    public String deleteTicket(String id) {
        return tickets.remove(id) != null ? "Ticket deleted successfully" : "Ticket not found";
    }
}