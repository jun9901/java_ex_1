package ch01;

public class ThreadTest3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		// ����
		// ������ 3�� ����
		
		// ������ start() ȣ��
		
		MyThreadEx3 thread1 = new MyThreadEx3();
		MyThreadEx3 thread2 = new MyThreadEx3();
		MyThreadEx3 thread3 = new MyThreadEx3();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}

class MyThreadEx3 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + ": " + Thread.currentThread());
		}
	}
}
