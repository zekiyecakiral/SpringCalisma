package com.zky.DIOrnek2;

public class EmailService implements IMessageService {

	   @Override
	    public void sendMessage(String message, String receiver) {
	        System.out.println("Email sent to "+receiver+ " with Message="+message);
	        
	    }
	
}
