package ch05;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(10, "Lee");
		studentLee.setKoreanSubject("����", 100);
		studentLee.setMathSubject("����", 80);
		
		// error
		studentLee.showStudentScore();
		
		// ���� 1.
		// �л� studentKim ����
		// ���� ����
		// ���� ������
		// ���� ���
		
		Student studentKim = new Student(20, "Kim");
		studentKim.setKoreanSubject("����", 100);
		studentKim.setMathSubject("����", 100);
		studentKim.showStudentScore();
	}

}
