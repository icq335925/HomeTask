package ua.itacadem.Phone;

public class Phone {
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
    protected static int callNumber=0;
    protected static int smsNumber=0;

    public Phone() {
		System.out.println("Phone constructor");
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void call(String number) {
		System.out.println("Phone class is calling " + number);

	}
	
	public  void sendSMS(String number, String message){

    };
}
