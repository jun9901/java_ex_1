package ch01;

import javax.swing.JFrame;

public class RunnableTest2 {

	public static void main(String[] args) {
		MyRunnable2 runnable2 = new MyRunnable2();
		// 외부에서 동작 시켜보기
		runnable2.runnable.run();
	}

}

class MyRunnable2 extends JFrame{
	
	int grade = 10;
	
	// 내부 익명 객체를 변수에 담아서 사용
	Runnable runnable = new Runnable(){
		
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print("----");
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	};
	
	public MyRunnable2() {
		runnable.run();
	}
}
