package ch03;

public abstract class Calculator implements Calc {
	
	//add
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;

	}
	//substract
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
}
