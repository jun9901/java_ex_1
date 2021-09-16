package ch02;

public class ForMainTest1 {

	public static void main(String[] args) {
		
		char c = '*';
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				if(j <= i) {
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}

}
