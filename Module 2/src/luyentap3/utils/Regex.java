package luyentap3.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static Pattern pattern;
    public static Matcher matcher;
    public static final String FRUIT_CODE = "FR-\\d{3}" ;
    public static boolean fruitCodeValidate(String code){
        pattern = Pattern.compile(FRUIT_CODE);
        matcher = pattern.matcher(code);
        return matcher.matches();
    }
}
