package ch02;

public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect {

	@Override
	public void turnOn() {
		System.out.println("≥√¿Â∞Ì∏¶ ƒ’¥œ¥Ÿ.");
	}

	@Override
	public void turnOff() {
		System.out.println("≥√¿Â∞Ì∏¶ ≤¸¥œ¥Ÿ.");
	}
	
	@Override
	public void notifiation() {
		System.out.println("∂Ï∏Æ∏µ~~~!@#");
	}
}
