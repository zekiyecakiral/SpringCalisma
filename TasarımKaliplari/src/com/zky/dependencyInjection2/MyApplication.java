package com.zky.dependencyInjection2;

public class MyApplication {
    private IMessageService messageService ;
    
    public MyApplication(IMessageService messageService ){                             
        this.messageService = messageService;
    }

    public void processMessages(String msg, String rec) {
        messageService.sendMessage(msg, rec);
    }

}
