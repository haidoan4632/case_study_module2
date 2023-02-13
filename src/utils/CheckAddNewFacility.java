package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckAddNewFacility {
    static final private String REGEX_VILLA_CODE = "";
    static final private String REGEX_ROOM_CODE = "";
    static final private String REGEX_NAME_SERVICE = "";
    static final private String REGEX_AREA = "";
    static final private String REGEX_PRICE = "";
    static final private String REGEX_MAX_PERSON = "";
    static final private String REGEX_RENTAL_TYPE = "";
    static final private String REGEX_NUMBER_OF_FLOORS = "";
    static final private String REGEX_STANDARD_ROOM = "";
    static final private String REGEX_DATE_OF_BIRTH = "";
    static final private String REGEX_NUMBER_OF_USES = "";
    private Pattern pattern;
    private Matcher matcher;

    public boolean checkVillaCode(String regex) {
        pattern = Pattern.compile(REGEX_VILLA_CODE);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkRoomId(String regex) {
        pattern = Pattern.compile(REGEX_ROOM_CODE);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkNameService(String regex) {
        pattern = Pattern.compile(REGEX_NAME_SERVICE);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkArea(String regex) {
        pattern = Pattern.compile(REGEX_AREA);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkPrice(String regex) {
        pattern = Pattern.compile(REGEX_PRICE);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkRentalType(String regex) {
        pattern = Pattern.compile(REGEX_RENTAL_TYPE);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkStandardRoom(String regex) {
        pattern = Pattern.compile(REGEX_STANDARD_ROOM);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkNumberOfFloors(String regex) {
        pattern = Pattern.compile(REGEX_NUMBER_OF_FLOORS);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkDateOfBirth(String regex) {
        pattern = Pattern.compile(REGEX_DATE_OF_BIRTH);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkMaximumPerson(String regex) {
        pattern = Pattern.compile(REGEX_MAX_PERSON);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkNumberOfUses(String regex) {
        pattern = Pattern.compile(REGEX_NUMBER_OF_USES);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {

    }

}
