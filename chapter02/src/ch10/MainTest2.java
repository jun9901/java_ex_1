package ch10;

public class MainTest2 {

	public static void main(String[] args) {
		// 연관된 데이터를 통으로 모아서 관리하기 위한 것
		int[] num = new int[12];
		
		Zealot[] zealot = new Zealot[12];
		
		// 배열은 for 문과 함께 많이 사용
		for (int i = 0; i < zealot.length; i++) {
			zealot[i] = new Zealot("wlffjt" + i);
		}
		
		zealot[0].showInfo();
	}

}
