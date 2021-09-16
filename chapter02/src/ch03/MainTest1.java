package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		/* 
		Student student1 = new Student();
		student1.name = "홍길동";
		student1.number = 1;
		student1.grade = 3;
		*/
		
		Student student2 = new Student(2, "이순신", 3);
		System.out.println(student2.name);
	}

}
