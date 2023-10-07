package luyentap2.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String COMPUTER_CODE = "^MT-\\d{4}$";
    public static boolean computerCodeValidate(String computerCode){
        pattern = Pattern.compile(COMPUTER_CODE);
        matcher = pattern.matcher(computerCode);
        return matcher.matches();
    }
}
