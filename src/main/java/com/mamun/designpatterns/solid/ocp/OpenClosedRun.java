package com.mamun.designpatterns.solid.ocp;

public class OpenClosedRun {

    public static void run (){

        NotificationService service =new NotificationService();

        service.notify(new EmailNotification(), "Account credited");
        service.notify(new SmsNotification(), "OTP: 123456");
        service.notify(new WhatsAppNotification(), "Your balance updated");
    }
}
