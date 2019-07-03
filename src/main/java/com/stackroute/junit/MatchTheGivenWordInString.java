package com.stackroute.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchTheGivenWordInString {
    public static String matchTheGivenWord(String string, String patternString)
    {   //matching the pattern in the given string
        String str = "";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while(matcher.find()) {
            count++;
            str = str + "found: " + count + " : " + matcher.start() + " - " + matcher.end() + "\n";
        }
        return str;
    }
}
