package ch01;

public class Student {
	private int studentId;
	private String studentName;
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	// 문제 1. toString 메서드 재정의 해봅시다.
	// 학번 : 1233 , 이름 : 홍길동
	@Override
	public String toString() {
		return "학번 : " + studentId + ", " + " 이름 : " + studentName;
	}
	// 문제 2. equals 메서드를 재정의 해봅시다.
	// 논리적으로 학번과 이름이 같다면 같은 객체라고 정의해 봅시다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.studentId == std.studentId && this.studentName == std.studentName) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
