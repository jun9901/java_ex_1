package ch04;

public class Bus {
	// ���� ��ȣ
	// �°� ��
	// ���Ա�
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		// this.money = this.money + money
		this.money += money;
		// passengerCount = passengerCount + 1;
		passengerCount++;
	}
	
	public void getOff() {
		this.passengerCount--;
	}
	
	public void showInfo() {
		System.out.println(busNumber + " �� ������ �°��� ");
		System.out.println(passengerCount + " ���̰� ");
		System.out.println("���Ա��� " + money + "�Դϴ�.");
	}
}
