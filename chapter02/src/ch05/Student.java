package ch05;

public class Student {
	// �й�
	// �л� �̸�
	int studentId;
	String name;
	Subject korea = new Subject();
	Subject math = new Subject();
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	// ���� ���� ����
	public void setKoreanSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println("�л��� �̸� :" + name);
		System.out.println("�л��� ���� :" + total);
		System.out.println("�л��� ��� :" + (total / 2));
		
	}
}
