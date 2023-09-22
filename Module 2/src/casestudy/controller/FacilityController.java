package casestudy.controller;

import casestudy.view.FacilityManagementView;

public class FacilityController {
    private final FacilityManagementView facilityManagementView = new FacilityManagementView();

    public void runFacility() {
        facilityManagementView.displayFacilityMenu();
    }
}
