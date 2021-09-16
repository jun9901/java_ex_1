package ch04;

public class Student {
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// ����â �����ֱ�
	
	public void showInfo() {
		System.out.println(name + "���� ���� ���� : " + money);
	}
	
	// �л��� ������ ź��.
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	// �л��� ����ö�� ź��.
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void getOffBus(Bus bus) {
		bus.getOff();
	}
	
	public void getOffSubway(Subway subway) {
		subway.getOff();
	}
}
