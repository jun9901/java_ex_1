package ch01;

public class Refrigerator extends HomeAppliances {
	
	@Override
	public void turnOn() {
		System.out.println("³ÃÀå°í¸¦ ÄÕ´Ï´Ù.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("³ÃÀå°í¸¦ ²ü´Ï´Ù.");	
	}
}
