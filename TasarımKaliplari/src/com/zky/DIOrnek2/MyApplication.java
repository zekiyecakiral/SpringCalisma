package com.zky.DIOrnek2;

public class MyApplication {
    private IMessageService messageService ;
    
    public MyApplication(){                             
        
    }

    public void processMessages(String msg, String rec) {
        messageService.sendMessage(msg, rec);
    }

	public IMessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(IMessageService messageService) {
		this.messageService = messageService;
	}
    
        

}
