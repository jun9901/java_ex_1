package ch02;

public class SharedResource {

	public static void main(String[] args) {
		// ���� 10������ ���ݵǾ� �̾��� ���·� ��ü ����
		BankAccount account = new BankAccount();
		
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		// �ƹ����� �Ա��ϴ� ����
		father.start();
		// ��Ӵϰ� ����ϴ� ����
		mother.start();
		// ���� ó�� �ݾ� : 10���� + 1���� - 5õ�� = 10�� 5õ��
		// ����� : 11000? (�ǵ�ġ ���� ���)
		// �Ӱ� ������ ���� (�۾��ڰ��� �ڿ��� �����ϴ� ����)
		// �ٸ� �ھ��ڰ� ������� ���ϵ��� lock�� �ɾ��ش�.
		// �ϴ� ��� : ����ȭ ó���� �Ѵ�.(synchronization)
		// 1. synchronized �޼��带 ����ϴ� ���
		// 2. synchronized ���� ����ϴ� ���
	}

}

// �۾��ڵ��� �ڿ�(������)�� �����ϴ� ��Ȳ�� �� ó���ϴ� ���
class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// �Ա� ���
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
			System.out.println("�Ա� �� ���� �ܾ� :" + getMoney());
		}
	}

	// ��� ���
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
			System.out.println("��� �� ���� �ܾ� :" + getMoney());
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
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
		// �Ա��ϱ�
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
		// ��� �ϱ�
		account.widthdrawMoney(5_000);
	}
}
