package ss17_io_binaryfile_serialization.bai_tap.bt1.model;

public class Product {
    private String productCode;
    private String productName;
    private double productPrice;
    private String manufacturer;
    private String detail;

    public Product() {
    }

    public Product(String productCode, String productName, double productPrice, String manufacturer, String detail) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.manufacturer = manufacturer;
        this.detail = detail;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
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
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", manufacturer='" + manufacturer + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}