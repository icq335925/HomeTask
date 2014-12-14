package ua.itacadem.Phone;

public class SamsungS4 extends Phone {

    public SamsungS4() {
        System.out.println("SamsungS4 constructor");

        touch = true;
        hasWifi = true;
        screenSize = 5;
    }

    @Override
    public void sendSMS(String number, String message) {
        smsNumber++;

        System.out.println("SamsungS4 class is sending sms " + message + " to " + number);
    }
}
