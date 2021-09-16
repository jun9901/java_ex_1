package ch05;

public class Student {
	// 학번
	// 학생 이름
	int studentId;
	String name;
	Subject korea = new Subject();
	Subject math = new Subject();
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	// 국어 성적 셋팅
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
		System.out.println("학생의 이름 :" + name);
		System.out.println("학생의 총점 :" + total);
		System.out.println("학생의 평균 :" + (total / 2));
		
	}
}
