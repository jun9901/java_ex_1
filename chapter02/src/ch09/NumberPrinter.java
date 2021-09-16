package ch09;

public class NumberPrinter {
	private int id;
	private static int waitNumber;
	
	public NumberPrinter(int id) {
		this.id = id;
		waitNumber = 1;
	}
	
	public void printWaitNumber() {
		System.out.println(id + "기기의 대기 순번 :" + waitNumber);
		waitNumber++;
	}
}
