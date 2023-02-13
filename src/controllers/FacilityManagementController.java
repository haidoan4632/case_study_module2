package controllers;

import models.facility.Room;
import models.facility.Villa;
import services.facilityservice.FacilityService;

import java.util.Scanner;

public class FacilityManagementController {
    public void FacilityDisplayMenu() {
        Scanner scanner = new Scanner(System.in);
        FacilityService facilityService = new FacilityService();
        int select;
        do {
            System.out.println("1. Display list facility: ");
            System.out.println("2. Add new facility: ");
            System.out.println("3. Display list facility maintenance: ");
            System.out.println("4. Return main menu: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    facilityService.list();
                    break;
                case 2:
                    do {
                        System.out.println("1. add room: ");
                        System.out.println("2. add villa: ");
                        int select1 = Integer.parseInt(scanner.nextLine());
                        switch (select1) {
                            case 1:
                                System.out.println("add room: ");
                                System.out.println("Input service name: ");
                                String addServiceName = scanner.nextLine();
                                System.out.println("Input usable area: ");
                                String addUsableArea = scanner.nextLine();
                                System.out.println("Input rentalCost: ");
                                String addRentalCode = scanner.nextLine();
                                System.out.println("Input maxNumberOfPeople: ");
                                String addMaxNumberOfPeople = scanner.nextLine();
                                System.out.println("Input rentalType: ");
                                String addRentalType = scanner.nextLine();
                                System.out.println("Input freeServiceIncluded: ");
                                String addFreeServiceIncluded = scanner.nextLine();
                                Room room = new Room(addServiceName, addUsableArea, addRentalCode, addMaxNumberOfPeople, addRentalType, addFreeServiceIncluded);
                                facilityService.add(room);
                                break;
                            case 2:
                                System.out.println("add villa: ");
                                String addServiceName1 = scanner.nextLine();
                                String addUsableArea1 = scanner.nextLine();
                                String addRentalCost1 = scanner.nextLine();
                                String addMaxNumberOfPeople1 = scanner.nextLine();
                                String addRentalType1 = scanner.nextLine();
                                String AddRoomStandard1 = scanner.nextLine();
                                String AddSwimmingArea1 = scanner.nextLine();
                                String AddNumberOfFloors1 = scanner.nextLine();
                                Villa villa = new Villa(addServiceName1, addUsableArea1, addRentalCost1, addMaxNumberOfPeople1, addRentalType1, AddRoomStandard1, AddSwimmingArea1, AddNumberOfFloors1);
                                facilityService.add(villa);
                                break;
                        }
                        while (true) ;
                    }
                    while (true);
                case 3:
                    facilityService.displayMaintenance();
                    break;
                case 4:
                    return;
            }
            while (true);
        }
        while (true);
    }
}
