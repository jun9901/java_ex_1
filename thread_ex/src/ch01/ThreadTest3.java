package ch01;

public class ThreadTest3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		// 문제
		// 쓰레드 3개 생성
		
		// 쓰레드 start() 호출
		
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
