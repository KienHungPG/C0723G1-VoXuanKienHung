package ss12_java_collection_Framework.bai_tap.MVC;

import ss12_java_collection_Framework.bai_tap.MVC.view.ProductManagerView;

public class MainApp {
    public static void main(String[] args) {
        ProductManagerView productManagerView = new ProductManagerView();

        productManagerView.render();
    }

}
