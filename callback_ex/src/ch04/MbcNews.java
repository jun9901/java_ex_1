package ch04;

public class MbcNews extends NewFormat implements WriteArticle {

	@Override
	public void printArticle(String article) {
		System.out.println("*** MBCNews ***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 :" + printDate());
	}
}
