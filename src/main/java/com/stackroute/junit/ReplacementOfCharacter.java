package com.stackroute.junit;

public class ReplacementOfCharacter {
    public static String replacementOfACharacter(String string) {
        if (string.equals(" ")) {
            return "null";
        } else {
            String result = string.replaceAll("d", "f");//replacing d with f
            String display = result.replaceAll("l", "t"); //replacing l with t
            return display;
        }
    }
}