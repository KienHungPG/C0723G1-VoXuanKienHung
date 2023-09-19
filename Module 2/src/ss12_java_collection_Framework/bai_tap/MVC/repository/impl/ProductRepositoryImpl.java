package ss12_java_collection_Framework.bai_tap.MVC.repository.impl;

import ss12_java_collection_Framework.bai_tap.MVC.model.Product;
import ss12_java_collection_Framework.bai_tap.MVC.repository.IProductRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    private  final List<Product> listProduct = new ArrayList<>();

    {
        listProduct.add(new Product(1, "Iphone 15 pro max", 1599));
        listProduct.add(new Product(2, "Macbook Pro M2 Max", 3499));
        listProduct.add(new Product(3, "Apple Watch S9", 699));
        listProduct.add(new Product(4, "Airpod Max", 549));
    }

    @Override
    public void createProduct(Product product) {
        product.setId(listProduct.size() + 1);
        this.listProduct.add(product);
    }

    @Override
    public void updateInformation(Product product) {
        for(Product p: listProduct) {
            if(p.getId() == product.getId()) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                return;
            }
        }

    }

    @Override
    public void deleteProduct(int id) {
        for(Product p: listProduct) {
            if(id == p.getId()) {
                listProduct.remove(p);
                return;
            }
        }

    }

    @Override
    public List<Product> getProduct() {
        return this.listProduct;
    }

    @Override
    public List<Product> searchProductByName(String name) {
        List<Product> result = new ArrayList<>();
        for(Product p: listProduct) {
            if(p.getName().contains(name)) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public List<Product> sortProductByPrice(String direction) {
       switch (direction) {
           case "+" :
               List<Product> ascList = new ArrayList<>();
               ascList.addAll(listProduct);
               Collections.sort(ascList, new Comparator<Product>() {
                   @Override
                   public int compare(Product o1, Product o2) {
                       return o1.getPrice() - o2.getPrice();
                   }
               });
               return ascList;
           case "-" :
               List<Product> descList = new ArrayList<>();
               descList.addAll(listProduct);
               Collections.sort(descList, new Comparator<Product>() {
                   @Override
                   public int compare(Product o1, Product o2) {
                       return o2.getPrice() - o1.getPrice();
                   }
               });
               return descList;
           default:
               return listProduct;
       }
    }
}
