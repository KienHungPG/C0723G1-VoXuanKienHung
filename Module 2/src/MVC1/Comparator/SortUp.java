package MVC1.Comparator;

import MVC1.model.ProductModel;

import java.util.Comparator;

public class SortUp implements Comparator<ProductModel> {

    @Override
    public int compare(ProductModel o1, ProductModel o2) {
        return (int) (o1.getPriceProduct() - o2.getPriceProduct());
    }
}
