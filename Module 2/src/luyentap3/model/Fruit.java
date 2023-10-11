package luyentap3.model;

public class Fruit {
    private String code;
    private String name;
    private String origin;
    private int amount;
    private double price;

    public Fruit() {
    }

    public Fruit(String code, String name, String origin, int amount, double price) {
        this.code = code;
        this.name = name;
        this.origin = origin;
        this.amount = amount;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "code='" + code + '\'' +
                ", nane='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
