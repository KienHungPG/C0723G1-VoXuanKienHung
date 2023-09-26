package ss17_io_binaryfile_serialization.bai_tap.bt1.service.impl;

import ss17_io_binaryfile_serialization.bai_tap.bt1.model.Product;
import ss17_io_binaryfile_serialization.bai_tap.bt1.repository.IProductRepository;
import ss17_io_binaryfile_serialization.bai_tap.bt1.repository.impl.ProductRepositoryImpl;
import ss17_io_binaryfile_serialization.bai_tap.bt1.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService{

    private final IProductRepository productRepository = new ProductRepositoryImpl();
    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public List<Product> displayProduct() {
        return productRepository.displayProduct();
    }

    @Override
    public List<Product> searchProduct(String name) {
        return productRepository.searchProduct(name);
    }
}
