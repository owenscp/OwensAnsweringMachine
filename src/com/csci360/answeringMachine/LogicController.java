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
public class LogicController{
    private AnsweringMachine userAM;
    private Phone callerPhone;
    private Phone userPhone;
    private boolean userHere = false;
    
    public LogicController(AnsweringMachine am, Phone cp, Phone up)
    {
        userAM = am;
        callerPhone = cp;
        userPhone = up;
       
    }
    
    public void userAnswer()
    {
        userHere = true;
    }
    
    public String getAMCallerMessage()
    {
        return (userAM.getCallerMessage());
    }
    
    public void deleteAMCallerMessage()
    {
        userAM.deleteCallerMessage();
    }
    
    public void call()
    {
        for(int i = 0; i < 4; i++)
        {
            if(userHere)
            {
                userPhone.setCall("temp"); //TODO: get string from UI
                callerPhone.setCall("temp");//TODO: get string from UI
                //TODO: print calls to UI
                userHere = false;
                return;
            }
        }
        //TODO; print responseMessage to UI
        userAM.setCallerMessage("temp");
    }
    
    public String getConversation()
    {
        return (userPhone.getCall() +"\n"+ callerPhone.getCall());
    }
}
