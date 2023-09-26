package ss17_io_binaryfile_serialization.bai_tap.bt1.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;

    private String name;
    private double price;
    private String manufacturer;
    private String detail;

    public Product() {
    }

    public Product(String productCode, String name, double price, String manufacturer, String detail) {
        this.id = productCode;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String productCode) {
        this.id = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + id + '\'' +
                ", productName='" + name + '\'' +
                ", productPrice=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}