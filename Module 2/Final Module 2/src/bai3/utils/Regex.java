package bai3.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static Pattern pattern;
    public static Matcher matcher;
    public static final String MA_HOA_DON = "^MHD-\\d{4}$";

    public static boolean kiemTraMaHD(String maHoaDon){
        pattern = Pattern.compile(MA_HOA_DON);
        matcher = pattern.matcher(maHoaDon);
        return matcher.matches();
    }
}
