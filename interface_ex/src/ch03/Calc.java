package ch03;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -99999;
	
	// 문제 1
	// add, 매개변수2 (num1, num2)
	// substract, 매개변수 2 (num1, num2)
	// times, 매개변수 2 (num1, num2)
	// divide, 매개변수 2 (num1, num2)
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	void showInfo();
	
}
