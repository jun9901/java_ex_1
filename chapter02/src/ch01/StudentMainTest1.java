package ch01;

public class StudentMainTest1 {
	// main 함수(코드의 시작점)
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		Student s1; // Student 참조 타입 s1란 변수를 선언
		Student s2; // Student 참조 타입 s2란 변수를 선언
		
		s1 = new Student(); // s1 초기화(객체화) instance
		s2 = new Student(); // s2 초기화(객체화) instance
		
		System.out.println(num1);
		System.out.println(s1);
		System.out.println(s2);
	} // end of main

}
