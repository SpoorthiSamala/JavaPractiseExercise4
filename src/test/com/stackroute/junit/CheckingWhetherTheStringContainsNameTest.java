package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckingWhetherTheStringContainsNameTest {
    CheckingWhetherTheStringContainsName theStringContainsName;

    @Before
    public void setUp() {
        theStringContainsName = new CheckingWhetherTheStringContainsName(); //creating an object
    }

    @Test
    public void givenInputStringContainsSpecifiedNameTHenReturnTrue() //checking whether the string contains the name
    {
        String result = theStringContainsName.returnTrueIfStringContainsName("is harry there?", "harry");
        assertEquals("true", result);
    }

    @Test
    public void givenInputStringDoesNotContainSpecifiedNameThenReturnFalse() {
        String result = theStringContainsName.returnTrueIfStringContainsName("is henry there?", "harry");
        assertEquals("false", result);
    }

    @Test
    public void checkIfWeAreGettingTrueForNameWhichIsInGivenString() {
        String result = theStringContainsName.returnTrueIfStringContainsName("is henry there?", "harry");
        assertNotEquals("true", result);
    }

    @After
    public void tearDown() {
        theStringContainsName = null;
    }
}



