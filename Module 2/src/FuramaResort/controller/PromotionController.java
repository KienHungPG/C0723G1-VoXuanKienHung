package FuramaResort.controller;

import FuramaResort.view.PromotionManagementView;

public class PromotionController {
    private final PromotionManagementView promotionManagementView = new PromotionManagementView();

    public void runPromotion() {
        promotionManagementView.displayPromotionMenu();
    }
}
