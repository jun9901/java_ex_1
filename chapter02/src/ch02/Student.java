package ch02;

import java.util.Random;

public class Student {
	int studentId;
	String studentName;
	String address;
	
	public void study() {
		System.out.println(studentName + "학생이 공부를 합니다.");
	}
	
	public void breakTime() {
		System.out.println(studentName + "학생이 휴식을 합니다.");
	}
	
	public void showInfo() {
		System.out.println(studentId + ", " + studentName + ", " + address);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "김길동";
		studentKim.studentId = 1;
		studentKim.address = "부산시 해운대구";
		
		// 메서드 호출
		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentId = 2;
		studentLee.address = "부산시 남포동";
		
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
		value = random.nextInt(45) + 1; // 0 ~ 44 까지 랜덤 숫자를 반환 -> 1 ~ 45 숫자 중 하나를 반환
		return value;
	}
}
