package luyentap.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String TICKET_CODE = "^MV-\\d{3}$";
    public static boolean ticketCodeValidate(String ticketCode){
        pattern = Pattern.compile(TICKET_CODE);
        matcher = pattern.matcher(ticketCode);
        return matcher.matches();
    }
}
