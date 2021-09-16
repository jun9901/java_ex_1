package ch07;

public class BankMainTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(10_000);
		bank.showInfo();
		bank.withdraw(5_000);
		bank.showInfo();
		
		// 신입 개발자가 실수로 멤버 변수에 바로 접근해서 잔액을 수정함
		// bank.balance = 1_000_000;
		bank.showInfo();
		
		/*
		 * 접근 제어 지시자
		 * 4가지
		 * public - 누구나 접근을 허용
		 * private - 같은  클래스 내에서만 접근을 허용
		 * default - 같은 패키지 내에서는 접근을 허용
		 * protected - 상속관계에서 접근을 허용
		 */
	}

}
