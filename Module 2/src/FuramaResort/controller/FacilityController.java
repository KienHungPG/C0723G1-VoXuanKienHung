package FuramaResort.controller;

import FuramaResort.view.FacilityManagementView;

public class FacilityController {
    private final FacilityManagementView facilityManagementView = new FacilityManagementView();

    public void runFacility() {
        facilityManagementView.displayFacilityMenu();
    }
}
