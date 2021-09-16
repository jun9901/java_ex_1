package ch04;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money = money;
		this.passengerCount++;
	}
	
	public void getOff() {
		this.passengerCount--;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + " ȣ���� �°��� ");
		System.out.println(passengerCount + " ���̰� ");
		System.out.println("���Ա��� " + money + "�Դϴ�.");
	}
}
