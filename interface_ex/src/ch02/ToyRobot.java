package ch02;

public class ToyRobot implements RemoteController, SoundEffect {
	
	String name;	// �ʱⰪ -> null
					// int -> 0
					// double -> 0.9
	
	@Override
	public void turnOn() {
		System.out.println("�峭�� �κ��� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("�峭�� �κ��� ���ϴ�.");
	}
	
	@Override
	public void notifiation() {
		System.out.println("�η�� ��~!~");
	}
}
