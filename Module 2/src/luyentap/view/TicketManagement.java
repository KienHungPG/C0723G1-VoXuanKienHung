package luyentap.view;

import luyentap.controller.TicketController;
import luyentap.model.Ticket;
import luyentap.repository.ITicketRepository;
import luyentap.repository.impl.TicketRepository;
import luyentap.utils.Regex;

import java.util.Scanner;

public class TicketManagement {
    private final ITicketRepository ticketRepository = new TicketRepository();
    private final TicketController ticketController = new TicketController();
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("-----MENU-----");
        System.out.println("1. Display list ticket");
        System.out.println("2. Add new ticket");
        System.out.println("3. Delete ticket");
        System.out.println("4. Edit ticket");
        System.out.println("5. Sort ticket by price");
        System.out.println("6. Exit");
    }

    private int chooseMenu() {
        int chooseMenu;
        do {
            try {
                this.displayMenu();
                System.out.println("Choose your feature");
                chooseMenu = Integer.parseInt(scanner.nextLine());
                if (chooseMenu <= 0 || chooseMenu > 6) {
                    System.out.println("Feature invalid. Please re-enter");
                } else {
                    return chooseMenu;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number.");
            }
        } while (true);
    }

    private String inputTicketCode() {
        String ticketCode;
        do {
            System.out.println("Enter the ticket code MV-xxx(x is integer): ");
            ticketCode = scanner.nextLine();
            if (Regex.ticketCodeValidate(ticketCode)) {
                return ticketCode;
            } else {
                System.out.println("Ticket code invalid. Please re-enter!!!");
            }
        } while (true);
    }

    private String inputMovieName() {
        int chooseMovie;
        do {
            try {
                System.out.println("Select the movie you want to watch");
                System.out.println("1. Wolfoo");
                System.out.println("2. The Num");
                System.out.println("3. Dune");
                chooseMovie = Integer.parseInt(scanner.nextLine());
                if (chooseMovie <= 0 || chooseMovie > 3) {
                    System.out.println("Invalid.Please choose number in menu ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!!!");
            }
        } while (true);
        if (chooseMovie == 1) {
            return "Wolfoo";
        } else if (chooseMovie == 2) {
            return "The Num";
        } else {
            return "Dune";
        }
    }

    private String inputPrice() {
        int choosePrice;
        do {
            try {
                System.out.println("Select ticket price");
                System.out.println("1. Zone Normal - 60000 VNĐ");
                System.out.println("2. Zone VIP - 90000 VNĐ");
                System.out.println("3. Zone couple - 120000 VNĐ");
                choosePrice = Integer.parseInt(scanner.nextLine());
                if (choosePrice <= 0 || choosePrice > 3) {
                    System.out.println("Invalid.Please choose number in menu ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!!!");
            }
        } while (true);
        if (choosePrice == 1) {
            return "60000";
        } else if (choosePrice == 2) {
            return "90000";
        } else {
            return "120000";
        }
    }

    private String inputShowTime() {
        int chooseTime;
        do {
            try {
                System.out.println("Select time");
                System.out.println("1. 10:30");
                System.out.println("2. 14:00");
                System.out.println("3. 17:00");
                System.out.println("4. 19:30");
                System.out.println("5. 22:30");
                chooseTime = Integer.parseInt(scanner.nextLine());
                if (chooseTime <= 0 || chooseTime > 5) {
                    System.out.println("Invalid.Please choose number in menu ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!!!");
            }
        } while (true);
        if (chooseTime == 1) {
            return "10:30";
        } else if (chooseTime == 2) {
            return "14:00";
        } else if (chooseTime == 3) {
            return "17:00";
        } else if (chooseTime == 4) {
            return "19:30";
        } else {
            return "22:30";
        }
    }

    private String inputShowDate() {
        int chooseTime;
        do {
            try {
                System.out.println("Select date");
                System.out.println("1. Monday");
                System.out.println("2. Tuesday");
                System.out.println("3. Wednesday");
                System.out.println("4. Thursday");
                System.out.println("5. Friday");
                System.out.println("6. Saturday");
                System.out.println("5. Sunday");
                chooseTime = Integer.parseInt(scanner.nextLine());
                if (chooseTime <= 0 || chooseTime > 5) {
                    System.out.println("Invalid.Please choose number in menu ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number!!!");
            }
        } while (true);
        if (chooseTime == 1) {
            return "Monday";
        } else if (chooseTime == 2) {
            return "Tuesday";
        } else if (chooseTime == 3) {
            return "Wednesday";
        } else if (chooseTime == 4) {
            return "Thursday";
        } else if (chooseTime == 5) {
            return "Friday";
        } else if (chooseTime == 6) {
            return "Saturday";
        } else {
            return "Sunday";
        }
    }

    private boolean checkTicketCode(String ticketCode) {
        for (Ticket ticket : ticketRepository.getList()) {
            if (ticket.getTicketCode().equals(ticketCode)) {
                return true;
            }
        }
        return false;
    }

    private void inputInformation(Ticket ticket) {
        ticket.setMovieName(inputMovieName());
        ticket.setPrice(inputPrice());
        ticket.setShowTime(inputShowTime());
        ticket.setShowDate(inputShowDate());
    }

    private Ticket addNewTicket() {
        Ticket ticket = new Ticket();
        String ticketCode;
        do {
            ticketCode = inputTicketCode();
            if (checkTicketCode(ticketCode)) {
                System.out.println("Ticket code already exist!!!");
            }
        } while (checkTicketCode(ticketCode));
        ticket.setTicketCode(ticketCode);
        inputInformation(ticket);
        return ticket;
    }

    private Ticket editTicket() {
        String ticketCode = inputTicketCode();
        for (Ticket ticket : ticketController.showTicket()) {
            if (ticket.getTicketCode().equals(ticketCode)) {
                inputInformation(ticket);
                return ticket;
            }
        }
        return null;
    }


    public void managementTicket() {
        int chooseMenu = chooseMenu();
        switch (chooseMenu) {
            case 1:
                for (Ticket ticket : ticketController.showTicket()) {
                    System.out.println(ticket);
                }
                break;
            case 2:
                ticketController.addTicket(addNewTicket());
                break;
            case 3:
                String ticketCode = inputTicketCode();
                if (checkTicketCode(ticketCode)) {
                    ticketController.deleteTicket(ticketCode);
                    System.out.println("Delete successful");
                } else {
                    System.out.println("Not found to delete");
                }
                break;
            case 4:
                Ticket ticket = editTicket();
                if (ticket == null) {
                    System.out.println("Not found");
                } else {
                    ticketController.editTicket(ticket);
                    System.out.println("Edit successful!!!");
                }
                break;
            case 5:
                ticketController.sortTicketByPrice();
                break;
            case 6:
                System.exit(1);
        }
        this.managementTicket();
    }
}
