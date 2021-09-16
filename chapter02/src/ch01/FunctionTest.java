package ch01;

public class FunctionTest {

	public static void main(String[] args) {
		// 함수 사용하기
		int result1 = add(100, 50);
		System.out.println(result1);
		
	}

	public static int add(int num1, int num2) {
		// 함수안에 사용하는 변수는 지역변수라고 부른다.
		int result;
		result = num1 + num2;
		return result;
	}
}
