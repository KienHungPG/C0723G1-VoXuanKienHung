package MVC1.model;

public class ProductModel{
    private int id;
    private String nameProduct;
    private double priceProduct;

    public ProductModel() {
    }
    public ProductModel(String name, double priceProduct) {
        this.nameProduct = name;
        this.priceProduct = priceProduct;
    }

    public ProductModel(int id, String name, double priceProduct) {
        this.id = id;
        this.nameProduct = name;
        this.priceProduct = priceProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "ProductController{" +
                "id=" + id +
                ", name='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
