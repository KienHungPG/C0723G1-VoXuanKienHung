package ss12_java_collection_Framework.bai_tap.MVC.repository;

import ss12_java_collection_Framework.bai_tap.MVC.model.Product;

import java.util.List;

public interface IProductRepository  {

    void createProduct(Product product);
    void updateInformation(Product product);
    void deleteProduct(int id);
    List<Product> getProduct();
    List<Product> searchProductByName(String name);
    List<Product> sortProductByPrice(String direction);

}
