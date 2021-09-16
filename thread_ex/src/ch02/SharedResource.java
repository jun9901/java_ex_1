package ch02;

public class SharedResource {

	public static void main(String[] args) {
		// 현재 10만원이 저금되어 이쓴ㄴ 상태로 객체 생성
		BankAccount account = new BankAccount();
		
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		// 아버지가 입금하는 동작
		father.start();
		// 어머니가 출금하는 동작
		mother.start();
		// 정상 처리 금액 : 10만원 + 1만원 - 5천원 = 10만 5천원
		// 결과값 : 11000? (의도치 않은 결과)
		// 임계 영역될 때는 (작업자간에 자웡늘 공유하는 상태)
		// 다른 자업자가 사용하지 못하도록 lock을 걸어준다.
		// 하는 방법 : 동기화 처리를 한다.(synchronization)
		// 1. synchronized 메서드를 사용하는 방법
		// 2. synchronized 블럭을 사용하는 방법
	}

}

// 작업자들이 자원(데이터)를 공유하는 상황일 때 처리하는 방법
class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금 기능
	public void saveMoney(int money) {
		synchronized (this) {
			int currentMoney = getMoney();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setMoney(currentMoney + money);
			System.out.println("입금 후 계좌 잔액 :" + getMoney());
		}
	}

	// 출금 기능
	public synchronized void widthdrawMoney(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (currentMoney >= money) {
			setMoney(currentMoney - money);
			System.out.println("출금 후 계좌 잔액 :" + getMoney());
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}

class Father extends Thread {
	
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 입금하기
		account.saveMoney(10_000);
	}
}

class Mother extends Thread {
	
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 출금 하기
		account.widthdrawMoney(5_000);
	}
}
