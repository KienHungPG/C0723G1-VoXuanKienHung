package luyentap.repository;

import luyentap.model.Ticket;

import java.util.List;

public interface ITicketRepository {
    List<Ticket> getList();
    void add(Ticket ticket);
    void edit(Ticket ticket);
    void delete(String id);
    void sort();
    List<Ticket> search(String name);
}
