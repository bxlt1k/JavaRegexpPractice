package Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
    public static boolean time(String str) {
        String timePattern = "(([0,1][0-9])|(2[0-3])):[0-5][0-9]";
        Pattern pattern = Pattern.compile(timePattern);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}
