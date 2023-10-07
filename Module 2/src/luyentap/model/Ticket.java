package luyentap.model;

public class Ticket {
    private String ticketCode;
    private String movieName;
    private String price;
    private String showTime;
    private String showDate;

    public Ticket() {
    }

    public Ticket(String ticketCode, String movieName, String price, String showTime, String showDate) {
        this.ticketCode = ticketCode;
        this.movieName = movieName;
        this.price = price;
        this.showTime = showTime;
        this.showDate = showDate;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketCode='" + ticketCode + '\'' +
                ", movieName='" + movieName + '\'' +
                ", price=" + price +
                ", showTime='" + showTime + '\'' +
                ", showDate='" + showDate + '\'' +
                '}';
    }
}
