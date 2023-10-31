package com.example.product_management.repository.impl;

import com.example.product_management.model.Product;
import com.example.product_management.repository.IProductRepository;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1,new Product(1, "Iphone 15", 23000000, "Black", "LL/A"));
        productMap.put(2,new Product(2, "Iphone 14", 18000000, "White", "VN/A"));
        productMap.put(3,new Product(3, "Iphone 13", 15000000, "Pink", "KH/A"));
    }

    @Override
    public List<Product> showProduct() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void getByName(String name) {

        for (Product p :new ArrayList<>(productMap.values())) {
            if (p.getName().contains(name)) {
                System.out.println(p);
            }
        }
    }


    @Override
    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void removeProduct(int id) {
        productMap.remove(id);
    }
}
