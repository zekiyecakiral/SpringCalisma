package com.zky.DIOrnek1;


//Bu uygulama dependencyInjection'a uymayan bir ornek.Once uymayan ornegi gorelim..dependencyInjectionin �nemini g�recegiz.

public class EmailService {
    
    public void sendEmail(String message , String receiver){
       
        System.out.println("Email sent to "+receiver+ " with Message="+message);
       
    }
    
}
   