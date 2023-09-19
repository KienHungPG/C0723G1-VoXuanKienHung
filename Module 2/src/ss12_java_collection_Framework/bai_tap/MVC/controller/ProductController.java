package ss12_java_collection_Framework.bai_tap.MVC.controller;

import ss12_java_collection_Framework.bai_tap.MVC.model.Product;
import ss12_java_collection_Framework.bai_tap.MVC.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final ProductServiceImpl productService = new ProductServiceImpl();
    public void createProduct(Product product){
        this.productService.createProduct(product);
    }
    public void updateInformation(Product product){
        this.productService.updateInformation(product);
    }
    public void deleteProduct(int id){
        this.productService.deleteProduct(id);
    }
    public List<Product> getProduct(){
        return this.productService.getProduct();
    }

    public List<Product> searchProductByName(String name) {
        return this.productService.searchProductByName(name);
    }

    public List<Product> sortProductByPrice(String direction){
        return this.productService.sortProductByPrice(direction);
    }
}
