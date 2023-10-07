package luyentap.repository.impl;

import luyentap.model.Ticket;
import luyentap.repository.ITicketRepository;
import luyentap.utils.FileUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TicketRepository implements ITicketRepository {
    public static final String PATH = "E:\\CG\\Module 2\\src\\luyentap\\data\\movie.csv";
    public static final String COMMA = ",";

    @Override
    public List<Ticket> getList() {
        return readFile();
    }

    @Override
    public void add(Ticket ticket) {
        List<Ticket> tickets = readFile();
        tickets.add(ticket);
        writeFile(tickets);
    }

    @Override
    public void edit(Ticket ticket) {
        List<Ticket> tickets = readFile();
        for (Ticket ticket1 : tickets) {
            if (ticket1.getTicketCode().equals(ticket.getTicketCode())) {
                ticket1.setMovieName(ticket.getMovieName());
                ticket1.setPrice(ticket.getPrice());
                ticket1.setShowTime(ticket.getShowTime());
                ticket1.setShowDate(ticket.getShowDate());
            }
        }
        writeFile(tickets);
    }

    @Override
    public void delete(String id) {
        List<Ticket> tickets = readFile();
        tickets.removeIf(ticket -> ticket.getTicketCode().equals(id));
        writeFile(tickets);
    }

    @Override
    public void sort() {
        List<Ticket> tickets = readFile();
        tickets.sort(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return Integer.parseInt(o1.getPrice()) - Integer.parseInt(o2.getPrice());
            }
        });
    }

    @Override
    public List<Ticket> search(String name) {
        List<Ticket> tickets = readFile();
        List<Ticket> newTicket = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.getMovieName().contains(name)) {
                newTicket.add(ticket);
            }
        }
        return newTicket;
    }

    private static List<Ticket> convertToTicket(List<String> data) {
        List<Ticket> tickets = new ArrayList<>();
        for (String str : data) {
            String[] strings = str.split(COMMA);
            tickets.add(new Ticket(strings[0], strings[1], strings[2], strings[3], strings[4]));
        }
        return tickets;
    }

    private static List<String> convertToString(List<Ticket> tickets) {
        List<String> data = new ArrayList<>();
        for (Ticket ticket : tickets) {
            data.add(ticket.getTicketCode()
                    + COMMA + ticket.getMovieName()
                    + COMMA + ticket.getPrice()
                    + COMMA + ticket.getShowTime()
                    + COMMA + ticket.getShowDate());
        }
        return data;
    }

    private List<Ticket> readFile() {
        List<String> data = FileUtils.readFile(PATH);
        return convertToTicket(data);
    }

    private void writeFile(List<Ticket> tickets) {
        List<String> data = convertToString(tickets);
        FileUtils.writeFile(PATH, data);
    }

}
