package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyOfCharacterTest {
    FrequencyOfCharacter frequencyOfChar;
    @Before
    public void setup(){
        frequencyOfChar=new FrequencyOfCharacter();

    }
    @Test
    public void givenStringFindTheFrequencyOfCharacterInTheGivenString()
    {
        int result=frequencyOfChar.findFrequencyOfTheCharacter("javaismylanguage",'a');
        assertEquals(4,result);
    }
    @Test
    public void givenStringfindTheFrequencyOfCharacterInTheGivenInputString()
    {
        int result=frequencyOfChar.findFrequencyOfTheCharacter("Java is java again java again",'a');
        assertEquals(10,result);
    }
    @Test
    public void checkIfOutputIsZeroWhenCharacterIsNotInString()
    {
        int result=frequencyOfChar.findFrequencyOfTheCharacter("Java is java again java again",'k');
        assertEquals(0,result);
    }
    @Test
    public void checkForTheFrequencyOfCharacterInString()
    {
        int result=frequencyOfChar.findFrequencyOfTheCharacter("Java is java again java again",'i');
        assertNotEquals("2",result);
    }
    @After
    public void tearDown()
    {
        frequencyOfChar=null;
    }

}