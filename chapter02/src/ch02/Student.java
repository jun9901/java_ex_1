package ch02;

import java.util.Random;

public class Student {
	int studentId;
	String studentName;
	String address;
	
	public void study() {
		System.out.println(studentName + "�л��� ���θ� �մϴ�.");
	}
	
	public void breakTime() {
		System.out.println(studentName + "�л��� �޽��� �մϴ�.");
	}
	
	public void showInfo() {
		System.out.println(studentId + ", " + studentName + ", " + address);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "��浿";
		studentKim.studentId = 1;
		studentKim.address = "�λ�� �ؿ�뱸";
		
		// �޼��� ȣ��
		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.studentId = 2;
		studentLee.address = "�λ�� ������";
		
		studentLee.study();
		studentLee.breakTime();
		studentLee.showInfo();
		
		System.out.println("--------------------------");
		
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
	}
	
	public static int randomNumber() {
		int value;
		Random random = new Random();
		value = random.nextInt(45) + 1; // 0 ~ 44 ���� ���� ���ڸ� ��ȯ -> 1 ~ 45 ���� �� �ϳ��� ��ȯ
		return value;
	}
}
