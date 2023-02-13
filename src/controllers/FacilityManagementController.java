package controllers;

import services.facilityservice.FacilityService;

import java.util.Scanner;

public class FacilityManagementController {
    public void FacilityDisplayMenu() {
        Scanner scanner = new Scanner(System.in);
        FacilityService facilityService = new FacilityService();
        int menu = 0;
        do {
            System.out.println("1. Display list facility: ");
            System.out.println("2. Add new facility: ");
            System.out.println("3. Display list facility maintenance: ");
            System.out.println("4. Return main menu: ");

            switch (menu){
                case 1:
                    facilityService.list();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
            while (true);
        }
        while (true);
    }
}
