package com.zky.dependencyInjection2;

public class Test2 {
	  public static void main(String[] args) {
		  // burda dependency injection constructor ile yapiliyor.
	        MyApplication2 app = new MyApplication2();
	        app.setMessageService(new EmailService());
	        app.processMessages("zky", "zkyckrl@gmail.com");
	        

	    }

}
