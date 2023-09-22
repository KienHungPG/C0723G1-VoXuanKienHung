package casestudy.controller;

import casestudy.view.PromotionManagementView;

public class PromotionController {
    private final PromotionManagementView promotionManagementView = new PromotionManagementView();

    public void runPromotion() {
        promotionManagementView.displayPromotionMenu();
    }
}
