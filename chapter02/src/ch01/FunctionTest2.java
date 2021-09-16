package ch01;

public class FunctionTest2 {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 20;
		
		double result1 = addNum(20.5, 10.7);
		System.out.println(result1);
		
		sayHello("반갑습니다. 처음보네요~");
		
		int result2 = calcSum();
		System.out.println(result2
				);
	}
	
	public static double addNum(double n1, double n2) {
		// 지역 변수
		double result;
		result = n1 + n2;
		return result;
	}
	
	// 리턴값이 없는 함수 설계
	public static void sayHello(String greeting) {
		System.out.println("[" + greeting + "]");
	}
	
	// 매개변수가 없는 함수 설계
	public static int calcSum() {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
