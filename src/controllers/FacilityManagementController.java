package controllers;

import models.facility.Room;
import models.facility.Villa;
import services.facilityservice.FacilityService;
import utils.CheckAddNewFacility;

import java.util.Scanner;

public class FacilityManagementController {
    public Object FacilityDisplayMenu() {
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

                                String addServiceCode;
                                do {
                                    System.out.println("Input service code: ");
                                    addServiceCode = scanner.nextLine();
                                    System.out.println(addServiceCode.matches(CheckAddNewFacility.checkRoomCode()));
                                    if (!addServiceCode.matches(CheckAddNewFacility.checkRoomCode())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addServiceCode.matches(CheckAddNewFacility.checkRoomCode()));

                                String addServiceName;
                                do {
                                    System.out.println("Input service name: ");
                                    addServiceName = scanner.nextLine();
                                    if (!addServiceName.matches(CheckAddNewFacility.checkNameService())) {
                                        System.out.println("Please input again");
                                    }
                                } while (!addServiceName.matches(CheckAddNewFacility.checkNameService()));

                                String addUsableArea;
                                do {
                                    System.out.println("Input usableArea: ");
                                    addUsableArea = scanner.nextLine();
                                    if (!addUsableArea.matches(CheckAddNewFacility.checkArea())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addUsableArea.matches(CheckAddNewFacility.checkArea()));

                                String addRentalCode;
                                do {
                                    System.out.println("Input rentalCost: ");
                                    addRentalCode = scanner.nextLine();
                                    if (!addRentalCode.matches(CheckAddNewFacility.checkPrice())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addRentalCode.matches(CheckAddNewFacility.checkPrice()));

                                String addMaxNumberOfPeople;
                                do {
                                    System.out.println("Input maxNumberOfPeople: ");
                                    addMaxNumberOfPeople = scanner.nextLine();
                                    if (!addMaxNumberOfPeople.matches(CheckAddNewFacility.checkMaxPerson())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addMaxNumberOfPeople.matches(CheckAddNewFacility.checkMaxPerson()));

                                String addRentalType;
                                do {
                                    System.out.println("Input rentalType: ");
                                    addRentalType = scanner.nextLine();
                                    if (!addRentalType.matches(CheckAddNewFacility.checkRentalType())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addRentalType.matches(CheckAddNewFacility.checkRentalType()));

                                String addFreeServiceIncluded;
                                do {
                                    System.out.println("Input freeServiceIncluded: ");
                                    addFreeServiceIncluded = scanner.nextLine();
                                    if (!addFreeServiceIncluded.matches(CheckAddNewFacility.checkNameService())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addFreeServiceIncluded.matches(CheckAddNewFacility.checkNameService()));

                                Room room = new Room(addServiceCode, addServiceName, addUsableArea, addRentalCode, addMaxNumberOfPeople, addRentalType, addFreeServiceIncluded);
                                facilityService.add(room);
                                break;
                            case 2:
                                System.out.println("add villa: ");

                                String addServiceCode1;
                                do {
                                    System.out.println("Input service code: ");
                                    addServiceCode1 = scanner.nextLine();
                                    if (!addServiceCode1.matches(CheckAddNewFacility.checkVillaCode())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addServiceCode1.matches(CheckAddNewFacility.checkVillaCode()));

                                String addServiceName1;
                                do {
                                    System.out.println("Input service name1: ");
                                    addServiceName1 = scanner.nextLine();
                                    if (!addServiceName1.matches(CheckAddNewFacility.checkNameService())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addServiceName1.matches(CheckAddNewFacility.checkNameService()));

                                String addUsableArea1;
                                do {
                                    System.out.println("Input service usable area: ");
                                    addUsableArea1 = scanner.nextLine();
                                    if (!addUsableArea1.matches(CheckAddNewFacility.checkArea())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addUsableArea1.matches(CheckAddNewFacility.checkArea()));

                                String addRentalCost1;
                                do {
                                    System.out.println("Input rental cost1: ");
                                    addRentalCost1 = scanner.nextLine();
                                    if (!addRentalCost1.matches(CheckAddNewFacility.checkPrice())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addRentalCost1.matches(CheckAddNewFacility.checkPrice()));

                                String addMaxNumberOfPeople1;
                                do {
                                    System.out.println("Input max number of people: ");
                                    addMaxNumberOfPeople1 = scanner.nextLine();
                                    if (!addMaxNumberOfPeople1.matches(CheckAddNewFacility.checkMaxPerson())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addMaxNumberOfPeople1.matches(CheckAddNewFacility.checkMaxPerson()));

                                String addRentalType1;
                                do {
                                    System.out.println("Input rental type: ");
                                    addRentalType1 = scanner.nextLine();
                                    if (!addRentalType1.matches(CheckAddNewFacility.checkRentalType())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addRentalType1.matches(CheckAddNewFacility.checkRentalType()));

                                String addRoomStandard1;
                                do {
                                    System.out.println("Input room standard1: ");
                                    addRoomStandard1 = scanner.nextLine();
                                    if (!addRoomStandard1.matches(CheckAddNewFacility.checkStandardRoom())) ;
                                    System.out.println("Please input again");
                                }
                                while (!addRoomStandard1.matches(CheckAddNewFacility.checkStandardRoom()));

                                System.out.println("Input swimming area: ");
                                String addSwimmingArea1 = scanner.nextLine();

                                System.out.println("Input number of floors1: ");
                                String addNumberOfFloors1 = scanner.nextLine();
                                Villa villa = new Villa(addServiceCode1, addServiceName1, addUsableArea1, addRentalCost1, addMaxNumberOfPeople1, addRentalType1, addRoomStandard1, addSwimmingArea1, addNumberOfFloors1);
                                facilityService.add(villa);
                                break;
                        }
                    }
                    while (true);

                case 3:
                    facilityService.displayMaintenance();
                    break;
                case 4:
                    return null;
            }
        }
        while (true);
    }
}
