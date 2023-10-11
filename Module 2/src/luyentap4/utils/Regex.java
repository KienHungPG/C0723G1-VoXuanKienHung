package luyentap4.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static Pattern pattern;
    public static Matcher matcher;
    public static final String VEHICLE_CODE = "^CAR-\\d{4}$";
    public static final String VEHICLE_TYPE = "^(tourist|personal)$";
    public static final String MANUFACTURER = "^(USA|KR|JP|GER)$";
    public static boolean vehicleCodeValidate(String code){
        pattern = Pattern.compile(VEHICLE_CODE);
        matcher = pattern.matcher(code);
        return matcher.matches();
    }
    public static boolean vehicleTypeValidate(String type){
        pattern = Pattern.compile(VEHICLE_TYPE);
        matcher = pattern.matcher(type);
        return matcher.matches();
    }
    public static boolean manufacturerValidate(String manufacturer){
        pattern = Pattern.compile(MANUFACTURER);
        matcher = pattern.matcher(manufacturer);
        return matcher.matches();
    }
}
