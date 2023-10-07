package luyentap.controller;

import luyentap.model.Ticket;
import luyentap.service.ITicketService;
import luyentap.service.impl.TicketServiceImpl;

import java.util.List;

public class TicketController {
    private final ITicketService ticketService = new TicketServiceImpl();
    public List<Ticket> showTicket(){
        return ticketService.getList();
    }
    public void addTicket(Ticket ticket){
        ticketService.add(ticket);
    }
    public void editTicket(Ticket ticket){
        ticketService.edit(ticket);
    }
    public void deleteTicket(String id){
        ticketService.delete(id);
    }
    public List<Ticket> searchTicket(String name){
        return ticketService.search(name);
    }
    public void sortTicketByPrice(){
        ticketService.sort();
    }
}
