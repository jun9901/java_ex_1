package ch01;

public class MainTest2 {
	
	public static void main(String[] args) {
		Cal2 cal2 = new Cal2();
		System.out.println(cal2);
		System.out.println();
	}
}
class Cal{
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public int multiplay(int n1, int n2) {
		return n1 * n2;
	}
}
class Cal2 extends Cal{
	public int minus(int n1, int n2) {
			return n1 - n2;
	}
	// �޼��带 ������ �� �� �ִ�.
	// �������̵� (�θ� �ִ� �޼��带 �ʿ信 ���ؼ� �������Ѵ�.)
//	public int multiplay(int n1, int n2) {
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0�� �Է����� ���ÿ�.");
//		}
//		return n1 * n2;
//	}
	@Override
	public int multiplay(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0�� �Է����� ���ÿ�.");
		}
		return n1 * n2;
	}
}


