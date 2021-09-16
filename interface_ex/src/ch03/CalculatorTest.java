package ch03;

public class CalculatorTest {

	public static void main(String[] args) {
		Calc calc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 0;
		System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + calc.substract(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + calc.times(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
		
		// showInfo
		// ¹®Á¦1.
		// (int) 0.11;
		// ((CompletCalc)calc).showInfo();
		
		calc.showInfo();
		
		
	}

}
