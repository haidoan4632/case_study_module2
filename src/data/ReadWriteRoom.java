package data;

import models.facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriteRoom {
    public static final String ROOM_CSV = "E:\\FuramaResort\\src\\data\\room.csv";

    public static Map<Room, Integer> readRoomFacility() {
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(ROOM_CSV);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String serviceName = temp[0];
                String usableArea = temp[1];
                String rentalCost = temp[2];
                String maxNumberOfPeople = temp[3];
                String rentalType = temp[4];
                String freeServiceIncluded = temp[5];
                room = new Room(serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType, freeServiceIncluded);
                roomIntegerMap.put(room, Integer.parseInt(temp[6]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomIntegerMap;
    }

    public static void writeRoomFacility(Map<Room, Integer> roomIntegerMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(ROOM_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room i : roomIntegerMap.keySet()) {
                bufferedWriter.write(i + "," + roomIntegerMap.get(i));
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}