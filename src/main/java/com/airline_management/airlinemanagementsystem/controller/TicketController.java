package com.airline_management.airlinemanagementsystem.controller;

import com.airline_management.airlinemanagementsystem.dto.Ticket;
import com.airline_management.airlinemanagementsystem.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/create")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable String id) {
        Ticket ticket = ticketService.getTicketById(id);
        return ticket != null ? ResponseEntity.ok(ticket) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @DeleteMapping("/{id}")
    public String deleteTicket(@PathVariable String id) {
        return ticketService.deleteTicket(id);
    }
}