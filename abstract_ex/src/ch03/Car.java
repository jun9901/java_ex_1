package ch03;

public abstract class Car {
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public abstract void wiper();
	
	public abstract void drive();
	
	public abstract void stop();
	
	// ��ũ(hook)�޼���
	// �ʿ��ϸ� ����ϴ� Ŭ�������� ���� �����ؼ� ����϶�.
	 public void washCar() {
		 
	 }
	
	// �ٽ� !!
	// �޼��忡�� final�� ��� �� ��� ���� Ŭ�������� ������ �� �� ���� ��.
	final public void run() { // �޼��忡 ����(���ø��� ������ �� �ִ�.)
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
