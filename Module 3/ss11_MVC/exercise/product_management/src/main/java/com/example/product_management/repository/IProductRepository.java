package com.example.product_management.repository;

import com.example.product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showProduct();

    Product findById(int id);

    void getByName(String name);

    void addProduct(Product product);

    void updateProduct(int id, Product product);

    void removeProduct(int id);
}
