package MVC1.service;

import MVC1.model.ProductModel;
import MVC1.repository.IProductRepository;
import MVC1.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final IProductRepository productRepository = new ProductRepository();
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("Nhập vào id");
        int idProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sản phẩm");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm");
        double priceProduct = Integer.parseInt(scanner.nextLine());
        ProductModel products = new ProductModel(idProduct, nameProduct, priceProduct);
        productRepository.add(products);
        System.out.println("Thêm thành công sản phẩm");
    }

    @Override
    public void editProduct() {
        List<ProductModel> productModelList = new ProductRepository().displayProduct();
        System.out.println("Nhập vào id sản phẩm muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        int searchIndex = productRepository.searchIndex(id);
        if (searchIndex == -1) {
            System.out.println("Không có id này");
        } else {
            System.out.println(productModelList.get(searchIndex));
            System.out.println(productModelList.get(searchIndex).getNameProduct() + " sửa thành tên:");
            String editName = scanner.nextLine();
            System.out.println(productModelList.get(searchIndex).getPriceProduct() + " sửa thành giá:");
            double editPrice = Integer.parseInt(scanner.nextLine());
            ProductModel editProduct = new ProductModel(editName, editPrice);
            productRepository.editProduct(searchIndex, editProduct);
            System.out.println("Sửa thành công");
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhập vào id sản phẩm bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        int searchIndex = productRepository.searchIndex(id);
        if (searchIndex == -1) {
            System.out.println("Không có id này !");
        } else {
            productRepository.deleteProductById(searchIndex);
            System.out.println("Xóa thành công");
        }
    }

    @Override
    public void showAll() {
        List<ProductModel> productModelList = productRepository.displayProduct();
        for (ProductModel product : productModelList) {
            System.out.println(product);
        }
    }


    @Override
    public void searchByName() {
        System.out.println("Nhập vào tên sản phẩm muốn tìm");
        String name = scanner.nextLine();
        List<ProductModel> productModelList = productRepository.searchName(name);
        for (ProductModel product : productModelList) {
            System.out.println(product);
        }
    }


    @Override
    public void sortByPriceProduct() {
        System.out.println("Nhập '+' để xếp tăng dần, '-' để xếp giảm dần (Theo giá)");
        String sign = scanner.nextLine();
        if (sign.equals("+")) {
            List<ProductModel> productModelList = productRepository.sortByPriceProductUp();
            for (ProductModel product : productModelList) {
                System.out.println(product);
            }
        } else if (sign.equals("-")) {
            List<ProductModel> productModelList = productRepository.sortByPriceProductDown();
            for (ProductModel product : productModelList) {
                System.out.println(product);
            }
        }
    }
}
