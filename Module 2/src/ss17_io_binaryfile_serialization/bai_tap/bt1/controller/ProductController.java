package ss17_io_binaryfile_serialization.bai_tap.bt1.controller;

import ss17_io_binaryfile_serialization.bai_tap.bt1.model.Product;
import ss17_io_binaryfile_serialization.bai_tap.bt1.service.IProductService;
import ss17_io_binaryfile_serialization.bai_tap.bt1.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();


    public void addProduct(Product product) {
        this.productService.addProduct(product);
    }

    public List<Product> displayProduct() {
        return this.productService.displayProduct();
    }

    public List<Product> searchProduct(String name) {
        return this.productService.searchProduct(name);
    }
}
