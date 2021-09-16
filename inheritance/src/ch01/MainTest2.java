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
	// 메서드를 재정의 할 수 있다.
	// 오버라이드 (부모에 있는 메서드를 필요에 의해서 재정의한다.)
//	public int multiplay(int n1, int n2) {
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0을 입력하지 마시오.");
//		}
//		return n1 * n2;
//	}
	@Override
	public int multiplay(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0을 입력하지 마시오.");
		}
		return n1 * n2;
	}
}


