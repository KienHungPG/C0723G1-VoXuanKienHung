package ss12_java_collection_Framework.bai_tap.MVC.service.impl;

import ss12_java_collection_Framework.bai_tap.MVC.repository.impl.ProductRepositoryImpl;
import ss12_java_collection_Framework.bai_tap.MVC.model.Product;
import ss12_java_collection_Framework.bai_tap.MVC.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final ProductRepositoryImpl productRepository = new ProductRepositoryImpl();


    @Override
    public void createProduct(Product product) {
        if(product.getId() > 0) {
            return;
        }
        this.productRepository.createProduct(product);
    }

    @Override
    public void updateInformation(Product product) {
        if(product.getId() <= 0) {
            return;
        }
        this.productRepository.updateInformation(product);
    }

    @Override
    public void deleteProduct(int id) {
        if(id <= 0) {
            return;
        }
        this.productRepository.deleteProduct(id);
    }

    @Override
    public List<Product> getProduct() {
        return this.productRepository.getProduct();
    }

    @Override
    public List<Product> searchProductByName(String name) {
        return this.productRepository.searchProductByName(name);
    }

    @Override
    public List<Product> sortProductByPrice(String direction) {
        return this.productRepository.sortProductByPrice(direction);
    }
}
