package FuramaResort.controller;

import FuramaResort.view.FacilityManagementView;

import java.util.Scanner;

public class FacilityController {
    private final FacilityManagementView facilityManagementView = new FacilityManagementView();
    private int choiceFacility;


    public void runFacility() {
        Scanner scanner = new Scanner(System.in);
        do {
            facilityManagementView.displayFacilityMenu();
            choiceFacility = Integer.parseInt(scanner.nextLine());
            switch (choiceFacility){
                case 1:

            }
        }while (choiceFacility != 5);

    }
}
