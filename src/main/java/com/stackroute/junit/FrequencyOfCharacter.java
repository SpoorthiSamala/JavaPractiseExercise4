package com.stackroute.junit;

public class FrequencyOfCharacter {
    int count=0;
    int index=0;
    public int findFrequencyOfTheCharacter(String string,Character character) //returns the frequency of a character in the string
    {
        if (index < string.length()) {
            if (character == string.charAt(index)) {
                count++;
            }
            index++;
            count = findFrequencyOfTheCharacter(string, character);
        }
        return count;
    }
}
