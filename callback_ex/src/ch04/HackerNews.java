package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HackerNews implements WriteArticle {
	
	private String printDate() {
		// 날짜 형식을 String으로 변환하기 위한 포멧형식
		DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		return formater.format(Calendar.getInstance().getTime());
	}
	
	@Override
	public void printArticle(String article) {
		System.out.println("*** HackerNews ***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 :" + printDate());
	}

	
}
