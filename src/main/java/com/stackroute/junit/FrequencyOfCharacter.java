package com.stackroute.junit;

public class FrequencyOfCharacter {
    int count=0;
    int index=0;
    public int findFrequencyOfTheCharacter(String string,Character character)
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
