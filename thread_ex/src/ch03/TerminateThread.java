package ch03;

import java.util.Scanner;

public class TerminateThread {

	public static void main(String[] args) {
		System.out.println("작업자를 생성하겠습니다.");
		// 메인 쓰레드가 작업자를 생성
		MyThread thread1 = new MyThread();
		// 작업자 1이 작업을 시작(run 메서드 호출)
		thread1.start();
		
		// 메인 쓰레드가 작업함
	
		Scanner sc = new Scanner(System.in);
		int userInput;
		do {
			System.out.print("중지하려면 0번을 입력하시오: ");
			userInput = sc.nextInt();
		} while (userInput != 0);
		System.out.println("종료");
		thread1.flag = false;
		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			int userInput = sc.nextInt();
//			if(userInput == 0) {
//				// thread1.stop(); // deprecated(더이상 사용하지 말 것.)
		
//				thread1.flag = false;
//				break;
//			}
//		}
		
		// 문제
		
		
	}

}

class MyThread extends Thread {
	
	boolean flag = true;
	
	@Override
	public void run() {
		System.out.println();
		while(flag) {
			System.out.print("-");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
