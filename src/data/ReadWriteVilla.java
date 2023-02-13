package data;

import models.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriteVilla {
    public static final String VILLA_CSV = "E:\\FuramaResort\\src\\data\\villa.csv";

    public static Map<Villa, Integer> readVillaFacility() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(VILLA_CSV);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String serviceName = temp[0];
                String usableArea = temp[1];
                String rentalCost = temp[2];
                String maxNumberOfPeople = temp[3];
                String rentalType = temp[4];
                String roomStandard = temp[5];
                String swimmingArea = temp[6];
                String numberOfFloors = temp[7];
                villa = new Villa(serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType, roomStandard, swimmingArea, numberOfFloors);
                villaIntegerMap.put(villa, Integer.parseInt(temp[8]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaIntegerMap;
    }

    public static void writeVillaFacility(Map<Villa, Integer> villaIntegerMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(VILLA_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa i : villaIntegerMap.keySet()) {
                bufferedWriter.write(i + "," + villaIntegerMap.get(i));
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
