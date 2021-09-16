package ch09;

import java.util.Calendar;

public class MainTest3 {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		Company company2= Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		// 싱글톤으로 만들어진 클래스
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());
	}

}
