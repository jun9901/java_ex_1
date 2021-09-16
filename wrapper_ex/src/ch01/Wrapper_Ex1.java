package ch01;

public class Wrapper_Ex1 {

	public static void main(String[] args) {

		Integer num = new Integer(20); // Boxing
		Number n1 = 10;
		System.out.println(num);
		
		int n = num.intValue(); // UnBoxing
		System.out.println(n);
	}

}
