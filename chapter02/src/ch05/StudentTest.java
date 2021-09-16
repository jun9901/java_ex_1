package ch05;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(10, "Lee");
		studentLee.setKoreanSubject("국어", 100);
		studentLee.setMathSubject("수학", 80);
		
		// error
		studentLee.showStudentScore();
		
		// 문제 1.
		// 학생 studentKim 생성
		// 국어 세싱
		// 수학 세ㅅ팅
		// 총점 출력
		
		Student studentKim = new Student(20, "Kim");
		studentKim.setKoreanSubject("국어", 100);
		studentKim.setMathSubject("수학", 100);
		studentKim.showStudentScore();
	}

}
