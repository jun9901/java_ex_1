package ch01;

public class ThreadTest1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			
			System.out.print("-");
			
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
