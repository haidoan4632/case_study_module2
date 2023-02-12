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
                    facilityService.
                case 2:
                case 3:
                case 4:
            }
        }
        while (true);
    }
}
