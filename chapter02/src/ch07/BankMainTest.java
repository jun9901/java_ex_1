package ch07;

public class BankMainTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(10_000);
		bank.showInfo();
		bank.withdraw(5_000);
		bank.showInfo();
		
		// ���� �����ڰ� �Ǽ��� ��� ������ �ٷ� �����ؼ� �ܾ��� ������
		// bank.balance = 1_000_000;
		bank.showInfo();
		
		/*
		 * ���� ���� ������
		 * 4����
		 * public - ������ ������ ���
		 * private - ����  Ŭ���� �������� ������ ���
		 * default - ���� ��Ű�� �������� ������ ���
		 * protected - ��Ӱ��迡�� ������ ���
		 */
	}

}
