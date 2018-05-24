package com.zky.DIOrnek2;

public class Test {
	
	 public static void main(String[] args) {
		  // burda dependency injection constructor ile yapiliyor.
	        MyApplication app = new MyApplication();
	        app.setMessageService(new EmailService()) ;
	     
	        app.processMessages("Selam", "serkansakinmaz@gmail.com");

	    }


}
