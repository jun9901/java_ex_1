package ch04;

public class Bus {
	// 버스 번호
	// 승객 수
	// 수입금
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
		System.out.println(busNumber + " 번 버스의 승객은 ");
		System.out.println(passengerCount + " 명이고 ");
		System.out.println("수입금은 " + money + "입니다.");
	}
}
