package ch03;

public class PriorityTest {

	public static void main(String[] args) {
		int i;
//		for(i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
//			
//			PriorityThread pt = new PriorityThread();
//			// 쓰레드에 우선순위를 지정하는 방법
//			pt.setPriority(i);
//			pt.start();
		PriorityThread pt1 = new PriorityThread();
		pt1.setPriority(1);
		PriorityThread pt2 = new PriorityThread();
		pt2.setPriority(5);
		PriorityThread pt3 = new PriorityThread();
		pt3.setPriority(10);
		}
}


class PriorityThread extends Thread {
	
	@Override
	public void run() {
		int sum = 0;
		Thread t = Thread.currentThread();
		
		System.out.println(t + "start");
		for (int i = 0; i < 10000000; i++) {
			sum += i;
		}
		System.out.println(t.getPriority() + " :end");
	}
}
