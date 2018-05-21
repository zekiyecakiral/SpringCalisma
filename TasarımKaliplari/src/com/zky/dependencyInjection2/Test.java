package com.zky.dependencyInjection2;

public class Test {
	
	 public static void main(String[] args) {
		  // burda dependency injection constructor ile yapiliyor.
	        MyApplication app = new MyApplication(new EmailService());
	        app.processMessages("Selam", "serkansakinmaz@gmail.com");
	        
	        MyApplication app1 = new MyApplication(new SmsService());
	        app.processMessages("Selam", "5088768543");
 
	    }


}
