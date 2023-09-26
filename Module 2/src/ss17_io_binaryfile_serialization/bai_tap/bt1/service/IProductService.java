package ss17_io_binaryfile_serialization.bai_tap.bt1.service;

import ss17_io_binaryfile_serialization.bai_tap.bt1.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    List<Product> displayProduct();

    List<Product> searchProduct(String name);
}
