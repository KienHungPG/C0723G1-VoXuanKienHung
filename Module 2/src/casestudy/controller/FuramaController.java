package casestudy.controller;

import casestudy.view.FuramaManagementView;


import java.util.Scanner;

public class FuramaController {
    private final FuramaManagementView furamaManagementView = new FuramaManagementView();
    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController = new CustomerController();
    private final FacilityController facilityController = new FacilityController();
    private final BookingController bookingController = new BookingController();
    private final PromotionController promotionController = new PromotionController();
    public void runFurama(){
        int option;
        Scanner scanner = new Scanner(System.in);
        do {
            furamaManagementView.displayMainMenu();
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    employeeController.runEmployee();
                    break;
                case 2:
                    customerController.runCustomer();
                    break;
                case 3:
                    facilityController.runFacility();
                    break;
                case 4:
                    bookingController.runBooking();
                    break;
                case 5:
                    promotionController.runPromotion();
                    break;
                case 6:
                    break;
            }
        } while (option != 6);

    }
}
