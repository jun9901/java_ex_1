package ch01;

// ������� �۾����̴�.

public class ThreadTest2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread()); //
		System.out.println("���� ������ ����");
		MyThreadEx2 th1 = new MyThreadEx2("�۾���1");
		th1.start();
	
		MyThreadEx2 th2 = new MyThreadEx2("�۾���2");
		th2.start();
		
		MyThreadEx2 th3 = new MyThreadEx2("�۾���3");
		th3.start();
		
		System.out.println("���� ������ ����");
		
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