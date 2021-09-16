package ch01;

public class FunctionTest3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int sum;
		
		add(100, 50);
	}
	public static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}
	
	// 문제 1. 리턴값 int, 매개변수 n1, n2, n3 이름은intAdd
	public static int add(int n1, int n2, int n3) {
		int result;
		result = n1 + n2 + n3;
		return result;
		
	}
	
	// 문제 2. 리턴값 double, 매개변수 d1, d2 이름은 doubleAdd
	public static double doubledAdd(double d1, double d2) {
		double result;
		result = d1 + d2;
		return result;
	}
	// 문제 3. 리턴값 void, 매개변수 (String article) 이름은 printArticle
	public static void printArticle(String article) {
		System.out.println("[" + article + "]");
	}
}
