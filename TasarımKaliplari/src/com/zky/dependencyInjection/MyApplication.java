package com.zky.dependencyInjection;

public class MyApplication {
	
	//İlerki asamalarda email yerine mesaj atmamiz istenirse bu sinifi yeniden dizayn etmemiz gerekir.
	//Burdan da anlasiliyorki bu siniflar birbirlerine bagimlidir.
	//Bu bagimliligi azaltmak icin alttaki gibi bir yapi kullanacagiz
	
    private EmailService email = new EmailService();

    public void processMessages(String msg,String rec) {                       
        this.email.sendEmail(msg, rec);
    }
}