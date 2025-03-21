package com.airline_management.airlinemanagementsystem.repository;

import com.airline_management.airlinemanagementsystem.dto.Ticket;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TicketRepository {

    private final Map<String, Ticket> ticketsTable = new HashMap<>();

    public Ticket save(Ticket ticket) {
        ticketsTable.put(ticket.getId(), ticket);
        return ticket;
    }

    public Optional<Ticket> findById(String id) {
        return Optional.ofNullable(ticketsTable.get(id));
    }

    public boolean existsById(String id) {
        return ticketsTable.containsKey(id);
    }

    public void deleteById(String id) {
        ticketsTable.remove(id);
    }

    public List<Ticket> findAll() {
        return new ArrayList<>(ticketsTable.values());
    }
}