package com.zky.DIOrnek2;

public class SmsService implements IMessageService {

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Sms sent to number : "+receiver+ " with Message="+message);
        
    }
}
