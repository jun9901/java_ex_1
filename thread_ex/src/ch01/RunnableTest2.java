package ch01;

import javax.swing.JFrame;

public class RunnableTest2 {

	public static void main(String[] args) {
		MyRunnable2 runnable2 = new MyRunnable2();
		// �ܺο��� ���� ���Ѻ���
		runnable2.runnable.run();
	}

}

class MyRunnable2 extends JFrame{
	
	int grade = 10;
	
	// ���� �͸� ��ü�� ������ ��Ƽ� ���
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
