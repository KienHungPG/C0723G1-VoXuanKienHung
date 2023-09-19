package MVC1.repository;

import MVC1.model.ProductModel;

import java.util.List;

public interface IProductRepository {
    void add(ProductModel product);

    void editProduct(int index, ProductModel product);

    void deleteProductById(int index);

    int searchIndex(int id);

    List<ProductModel> displayProduct();

    List<ProductModel> searchName(String name);

    List<ProductModel> sortByPriceProductUp();

    List<ProductModel> sortByPriceProductDown();
}
