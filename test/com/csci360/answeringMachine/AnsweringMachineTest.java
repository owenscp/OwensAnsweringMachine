/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.answeringMachine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class AnsweringMachineTest {
    
    public AnsweringMachineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class AnsweringMachine.
     */
    @Test
    public void testMain() {
        AnsweringMachine am = new AnsweringMachine();
        assertEquals("Sucesss1\n","You have called USER at PHONE NUMBER.\n"
            + "USER is not avalible, please leave a message after the Beep.\n"
            + "*BEEP*", am.getResponseMessage());
        am.setResponseMessage("hello");
        assertEquals("Sucesss2\n","hello", am.getResponseMessage());
        assertEquals("Sucess3\n", "No new messages.", am.getCallerMessage());
        am.setCallerMessage("hello");
        assertEquals("Sucesss4\n", "hello", am.getCallerMessage());
        am.deleteCallerMessage();
        assertEquals("Sucess5\n", "No new messages.", am.getCallerMessage());
    }
    
}
