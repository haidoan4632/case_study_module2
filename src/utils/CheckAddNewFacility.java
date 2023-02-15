package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckAddNewFacility {
    static final private String REGEX_VILLA_CODE = "^(SVVL)-\\d{4}$";
    static final private String REGEX_ROOM_CODE = "^(SVRO)-\\d{4}$";
    static final private String REGEX_NAME_SERVICE = "^[A-Z][a-z0-9]*$";
    static final private String REGEX_AREA = "^0*([1-9]\\d{2,}|[3-9]\\d|[1-9]\\d{2,}[.]\\d+|[3-9]\\d[.]\\d+)$";
    static final private String REGEX_PRICE = "^0*\\d+.*\\d+$";
    static final private String REGEX_MAX_PERSON = "^0*([1-9]|1[0-9])$";
    static final private String REGEX_RENTAL_TYPE = "";
    static final private String REGEX_NUMBER_OF_FLOORS = "^0*[1-9]\\d*$";
    static final private String REGEX_STANDARD_ROOM = "\"^[A-Z][a-z]*+(\\s[a-z]+)*$";
    static final private String REGEX_DATE_OF_BIRTH = "(0[1-9]|[1-2]\\d|3[0-1])/(0\\d|1[0-2])/(\\d{4})";

    private Pattern pattern;
    private Matcher matcher;

    public static String checkVillaCode() {
        return REGEX_VILLA_CODE;

    }

    public static String checkRoomCode() {
        return REGEX_ROOM_CODE;
    }

    public static String checkNameService() {
        return REGEX_NAME_SERVICE;

    }

    public static String checkArea() {
        return REGEX_AREA;
    }

    public static String checkPrice() {
        return REGEX_PRICE;
    }

    public static String checkRentalType() {
        return REGEX_RENTAL_TYPE;
    }

    public static String checkStandardRoom() {
        return REGEX_STANDARD_ROOM;
    }

    public static String checkNumberOfFloors() {
        return REGEX_NUMBER_OF_FLOORS;
    }

    public static String checkDateOfBirth() {
        return REGEX_DATE_OF_BIRTH;
    }

    public static String checkMaxPerson() {
        return REGEX_MAX_PERSON;
    }

    public static void main(String[] args) {

    }
}
