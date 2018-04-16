/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.answeringMachine;

/**
 *
 * @author chris
 */
public class AnsweringMachine {

    private String responseMessage = "You have called USER at PHONE NUMBER.\n"
            + "USER is not avalible, please leave a message after the Beep.\n"
            + "*BEEP*";
    private String callerMessage = "No new messages.";
   
    public AnsweringMachine ()
    {
        
    }
    
    public void setResponseMessage(String message)
    {
        responseMessage = message;
    }
    
    public String getResponseMessage()
    {
        return responseMessage;
    }
    public void setCallerMessage(String message)
    {
        callerMessage  = message;
    }
    public String getCallerMessage()
    {
        return callerMessage;
    }
    public void deleteCallerMessage()
    {
        callerMessage = "No new messages.";
    }
    
}
