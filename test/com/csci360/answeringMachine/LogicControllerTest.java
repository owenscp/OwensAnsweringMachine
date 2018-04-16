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
public class LogicControllerTest {
    
    public LogicControllerTest() {
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
     * Test of getAmCallerMessage method, of class LogicController.
     */
    @Test
    public void testGetAmCallerMessage() {
        System.out.println("getAmCallerMessage");
        AnsweringMachine am = new AnsweringMachine();
        Phone cp = new Phone();
        Phone up = new Phone(); 
        LogicController instance = new LogicController(am, cp, up);
        String expResult = am.getCallerMessage();
        String result = instance.getAMCallerMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of call method, of class LogicController.
     */
    @Test
    public void testCall() {
        System.out.println("call");
        AnsweringMachine am = new AnsweringMachine();
        Phone cp = new Phone();
        Phone up = new Phone(); 
        LogicController instance = new LogicController(am, cp, up);
        instance.call();
        String expResult = "temp";
        String result = instance.getAMCallerMessage();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of userAnswer method, of class LogicController.
     */
    @Test
    public void testUserAnswer() {
        System.out.println("userAnswer");
        AnsweringMachine am = new AnsweringMachine();
        Phone cp = new Phone();
        Phone up = new Phone(); 
        LogicController instance = new LogicController(am, cp, up);
        instance.userAnswer();
        instance.call();
        String expResult = "temp\ntemp";
        String result = instance.getConversation();
        assertEquals(expResult, result);
    }
    
}
