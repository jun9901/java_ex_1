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
		System.out.println(lineNumber + " 호선의 승객은 ");
		System.out.println(passengerCount + " 명이고 ");
		System.out.println("수입금은 " + money + "입니다.");
	}
}
