package ch01;

import java.util.logging.Logger;

class Student {
	String name;
	int grade;
	
}
public class ExceptionEx4 {
	public static void main(String[] args) {
		// 로그 남겨보기 
		Logger logger = Logger.getLogger("MyLogger");
		Student student = null;
//		student.name = "111";
		try {
			student.name = "111";
		} catch (NullPointerException e) {
			logger.warning("오류 발생 : " + e.toString());
		}
	}
}
