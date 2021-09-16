package ch09;

public class ForMainTest3 {

	public static void main(String[] args) {
		// 1. 5번 반복하는 for문 만들기
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < (3 - i); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
