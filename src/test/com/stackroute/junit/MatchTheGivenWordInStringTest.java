package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchTheGivenWordInStringTest {
    MatchTheGivenWordInString matchTheGivenWordInString;
    @Before
    public void setUp(){
        matchTheGivenWordInString=new MatchTheGivenWordInString();
    }
    @Test
    public void checkTheOccuranceOfWordInTheGivenString(){
        String result=matchTheGivenWordInString.matchTheGivenWord("She sells seashells by the seashore","se");
        assertEquals("found: 1 : 4 - 6\n"+"found: 2 : 10 - 12\n"+"found: 3 : 27 - 29\n",result);
    }
    @Test
    public void checkTheOccuranceOfWordInTheGivenInputString() {
        String result = matchTheGivenWordInString.matchTheGivenWord("She sells seashells by the seashore", "se");
        assertNotEquals("found: 1 : 4 - 6\n" + "found: 2 : 10 - 12\n" + "found: 1 : 4 - 6\n", result);
    }
    @Test
    public void checkTheOutputIfTheGivenWordIsNotInTheGivenInputString() {
        String result = matchTheGivenWordInString.matchTheGivenWord("She sells seashells by the seashore", "se");
        assertNotEquals("found: 1 : 4 - 6\n" + "found: 2 : 10 - 12\n" + "found: 1 : 27 - 29\n", result);
    }
    @After
    public void tearDown(){
        matchTheGivenWordInString=null;
    }

}