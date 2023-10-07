package luyentap.service.impl;

import luyentap.model.Ticket;
import luyentap.repository.ITicketRepository;
import luyentap.repository.impl.TicketRepository;
import luyentap.service.ITicketService;

import java.util.List;

public class TicketServiceImpl implements ITicketService {
    private final ITicketRepository ticketRepository = new TicketRepository();
    @Override
    public List<Ticket> getList() {
        return ticketRepository.getList();
    }

    @Override
    public void add(Ticket ticket) {
        ticketRepository.add(ticket);
    }

    @Override
    public void edit(Ticket ticket) {
        ticketRepository.edit(ticket);
    }

    @Override
    public void delete(String id) {
        ticketRepository.delete(id);
    }

    @Override
    public void sort() {
        ticketRepository.sort();
    }

    @Override
    public List<Ticket> search(String name) {
        return ticketRepository.search(name);
    }
}
