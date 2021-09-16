package ch11;

public class ArrayMainTest {

	public static void main(String[] args) {
		// 배열
		// 배열이란 연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입이다.
		// 변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를 하나의 변수에 저장하기 위한 것.
		
		int number = 10;
		
		// 선언 방법
		int[] arr1 = new int[3];
		int arr2[] = new int[10];
		
		// 초기화 하는 방법(값을 넣는 방법)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		
		// 배열 선언과 동시에 초기화 하기
		int[] number1 = new int[] {11, 20, 30};
		int[] number2 = {10, 50, 100};
		
		// 출력 방법
		System.out.println(number1[0]);
		System.out.println (number1[1]);
		System.out.println(number1[2]);
		
		//
		String[] strArr = new String[10];
		strArr[0] = "야스오";
		strArr[1] = "티모";
		strArr[2] = "애쉬";
		strArr[3] = "다리우스";
		
		// 문제 1. strArr 0, 1, 2, 3 화면에 출력! 단 for문 사용하지말고.
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		// 모든 프로그래밍 언어에서는 index는 무조건 0 부터 시작을 한다.
		System.out.println(strArr.length);
		System.out.println(strArr[10]); // index의 크기는 n - 1개
		// new int[22]; // 0 ~ 21
		// new int[74]; // 0 ~ 73
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			if(strArr[i] == null) {
				break;
			}
		}
		
	}

}
