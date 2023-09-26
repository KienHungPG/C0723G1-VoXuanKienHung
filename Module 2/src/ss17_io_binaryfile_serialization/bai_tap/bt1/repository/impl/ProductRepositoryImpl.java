package ss17_io_binaryfile_serialization.bai_tap.bt1.repository.impl;

import ss17_io_binaryfile_serialization.bai_tap.bt1.UtilsFile;
import ss17_io_binaryfile_serialization.bai_tap.bt1.model.Product;
import ss17_io_binaryfile_serialization.bai_tap.bt1.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    private final String PATH = "E:\\CG\\Module 2\\src\\ss17_io_binaryfile_serialization\\bai_tap\\bt1\\product.txt";

    @Override
    public void addProduct(Product product) {
        List<Product> productList = this.displayProduct();
        productList.add(product);
        UtilsFile.writeFile(PATH, productList);
    }

    @Override
    public List<Product> displayProduct() {
            List<Product> productList = UtilsFile.readFile(PATH);
            return productList;
        }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> products = this.displayProduct();
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                result.add(product);
            }
        }
        return result;
    }
}
