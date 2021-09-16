package ch03;

public class MenualCar extends Car {
	
	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
		System.out.println("사람이 핸들을 조작 합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 정지 합니다.");
	}
	
	@Override
	public void wiper() {
		System.out.println("사람이 wiper 기능을 켭니다.");
	}
}
