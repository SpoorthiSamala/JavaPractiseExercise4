package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacementOfCharacterTest {
    ReplacementOfCharacter replacementOfCharacter;
    @Before
    public void setUp(){
        replacementOfCharacter=new ReplacementOfCharacter(); //creating an object
    }
    @Test
    public void givenAStringReturnsStringWithReplacedCharacters(){
        String res=replacementOfCharacter.replacementOfACharacter("daily dry");
        assertEquals("faity fry",res);
    }
    @Test
    public void givenAnEmptyStringReturnsNull(){
        String res=replacementOfCharacter.replacementOfACharacter(" ");
        assertEquals("null",res);
    }
    @Test
    public void givenAStringReturnsOriginalString(){
        String res=replacementOfCharacter.replacementOfACharacter("Phone");
        assertEquals("Phone",res);
    }
    @After
    public void tearDown(){
        replacementOfCharacter=null;
    }


}