package ch03;

import java.util.Scanner;

public class TerminateThread {

	public static void main(String[] args) {
		System.out.println("�۾��ڸ� �����ϰڽ��ϴ�.");
		// ���� �����尡 �۾��ڸ� ����
		MyThread thread1 = new MyThread();
		// �۾��� 1�� �۾��� ����(run �޼��� ȣ��)
		thread1.start();
		
		// ���� �����尡 �۾���
	
		Scanner sc = new Scanner(System.in);
		int userInput;
		do {
			System.out.print("�����Ϸ��� 0���� �Է��Ͻÿ�: ");
			userInput = sc.nextInt();
		} while (userInput != 0);
		System.out.println("����");
		thread1.flag = false;
		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			int userInput = sc.nextInt();
//			if(userInput == 0) {
//				// thread1.stop(); // deprecated(���̻� ������� �� ��.)
		
//				thread1.flag = false;
//				break;
//			}
//		}
		
		// ����
		
		
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
