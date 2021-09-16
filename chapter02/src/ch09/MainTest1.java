package ch09;

public class MainTest1 {

	public static void main(String[] args) {
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		
		// 왼쪽 기계
		// 1. 번호표를 뽑음
		numberPrinter1.printWaitNumber();
		// 2.
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		
		
		// 오른쪽 기계
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
	}

}
