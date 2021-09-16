package ch03;

public abstract class Car {
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public abstract void wiper();
	
	public abstract void drive();
	
	public abstract void stop();
	
	// 후크(hook)메서드
	// 필요하면 사용하는 클래스에서 직접 구현해서 사용하라.
	 public void washCar() {
		 
	 }
	
	// 핵심 !!
	// 메서드에서 final을 사용 할 경우 하위 클래스에서 재정의 할 수 없게 됨.
	final public void run() { // 메서드에 순서(템플릿을 지정할 수 있다.)
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
