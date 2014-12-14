package ua.itacadem.Phone;
public class MainClass {

	public static void main(String[] args) {
		// Phone p = new Phone(); ������ �.�. ����� �����������
		
		Nokia3310 nokia = new Nokia3310();
		System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
		nokia.call("123-45-67");
		nokia.sendSMS("567-78-89", "text message");
		
		System.out.println("----------------------------------");
		
		IPhone iphone = new IPhone();
		System.out.println("IPhone screent size: " + iphone.getScreenSize());
		iphone.call("123-45-67");
		iphone.sendSMS("567-78-89", "text message");
		
		System.out.println("----------------------------------");
		
		IPhone5 iphone5 = new IPhone5();
		System.out.println("IPhone screent size: " + iphone5.getScreenSize());
		iphone5.call("123-45-67");
		iphone5.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        SamsungS4 samsungS4 = new SamsungS4();
        System.out.println("SamsungS4 screent size: " + samsungS4.getScreenSize());
        iphone5.call("125-45-67");
        iphone5.call("1233-45-67");
        iphone5.sendSMS("567-78-89", "Hello");

        System.out.println("----------------------------------");

        Phone phone=new Phone();
        System.out.println("Всего отправлено смс "+SamsungS4.smsNumber);
        System.out.println("Сделано звонков "+SamsungS4.callNumber);
	}
}
