package ch01;

// 쓰레드는 작업자이다.

public class ThreadTest2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread()); //
		System.out.println("메인 쓰레드 시작");
		MyThreadEx2 th1 = new MyThreadEx2("작업자1");
		th1.start();
	
		MyThreadEx2 th2 = new MyThreadEx2("작업자2");
		th2.start();
		
		MyThreadEx2 th3 = new MyThreadEx2("작업자3");
		th3.start();
		
		System.out.println("메인 쓰레드 종료");
		
	}
}
class MyThreadEx2 extends Thread {
	
	String name;
	
	public MyThreadEx2(String name) {
		this.name = name;
		
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(name + ": " + i + "\t");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}