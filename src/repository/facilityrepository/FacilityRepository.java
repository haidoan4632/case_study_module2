package repository.facilityrepository;

import data.ReadWriteRoom;
import data.ReadWriteVilla;
import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityRepository implements IFacilityRepository {

    static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
    static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();



    Scanner scanner = new Scanner(System.in);

    static {
        roomIntegerMap.put(new Room("A", "50m vuông", "10$", "5", "1 ngày", "tắm nắng"), 1);
        roomIntegerMap.put(new Room("B", "100m vuông", "50$", "10", "1 tháng", "tắm nắng"), 2);
        roomIntegerMap.put(new Room("C", "200m vuông", "100$", "15", "1 năm", "tắm nắng"), 3);

        villaIntegerMap.put(new Villa("D", "50m vuông", "100$", "5", "1 ngày", "Bình thường", "200m vuông", "3"), 4);
        villaIntegerMap.put(new Villa("E", "100m vuông", "200$", "10", "1 tháng", "Vip", "300m vuông", "3"), 5);
        villaIntegerMap.put(new Villa("F", "200m vuông", "300$", "15", "1 năm", "Girl vip", "400m vuông", "3"), 6);

    }


    @Override
    public void list() {
        do {
            System.out.println("Input service: ");
            System.out.println("1. Room: ");
            System.out.println("2. Villa: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(roomIntegerMap.entrySet());
                    roomIntegerMap = ReadWriteRoom.readRoomFacility();
                    break;
                case 2:
                    System.out.println(villaIntegerMap.entrySet());
                    villaIntegerMap = ReadWriteVilla.readVillaFacility();
                    break;
            }
            while (true) ;

        }
        while (true);
    }
    @Override
    public void add(Facility facility) {
        System.out.println("You want choice service:  ");
        System.out.println("1.Room");
        System.out.println("2.Villa");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                roomIntegerMap.put((Room) facility, 1);
                ReadWriteRoom.writeRoomFacility(roomIntegerMap);
                break;

            case 2:
                villaIntegerMap.put((Villa) facility, 1);
                ReadWriteVilla.writeVillaFacility(villaIntegerMap);
                break;
        }
    }

    @Override
    public void displayMaintenance() {
        System.out.println("Input service need maintenance: ");
        System.out.println("1.Room");
        System.out.println("2.Villa");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                for (Map.Entry<Room, Integer> roomFacilityIntegerEntry : roomIntegerMap.entrySet()) {
                    if (roomFacilityIntegerEntry.getValue() >= 5) {
                        System.out.println(roomFacilityIntegerEntry.getKey() + ":" + roomFacilityIntegerEntry.getValue());
                    }
                }
            case 2:
                for (Map.Entry<Villa, Integer> villaFacilityIntegerEntry : villaIntegerMap.entrySet()) {
                    if (villaFacilityIntegerEntry.getValue() >= 5) {
                        System.out.println(villaFacilityIntegerEntry.getKey() + ":" + villaFacilityIntegerEntry.getValue());
                    }
                }
                break;
        }
    }
}
