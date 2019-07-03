package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabeticalOrderTest {
    AlphabeticalOrder alphabeticalOrder;
    @Before
    public void setUp(){
        alphabeticalOrder=new AlphabeticalOrder(); //creating an object
    }
    @Test
    public void givenAStringParagraghReturnsWordsInAlphabeticalOrder(){
        String result=alphabeticalOrder.wordsInAlphabeticalOrder("my name is ramu");
        assertEquals("is my name ramu",result);
    }
    @Test
    public void givenAStringParagraghReturnsTrueForAssertNotEquals(){
        String result=alphabeticalOrder.wordsInAlphabeticalOrder("my name is ramu");
        assertNotEquals("is my",result);
    }

    @After
    public void tearDown(){
        alphabeticalOrder=null;
    }

}