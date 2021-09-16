package ch04;

public class MainTest {

	public static void main(String[] args) {

		// 해커 뉴스 객체 생성
		HackerNews hackerNews = new HackerNews();
		
		// 기사 작성
		MyArticle article = new MyArticle("오늘 날씨가 매우 덥습니다.", hackerNews);
		article.complete();
		
		// sbs 클래스를 만들어라.
		// mbc 클래스를 만들어라.
		SbsNews sbsNews = new SbsNews();
		MbcNews mbcNews = new MbcNews();
		
		MyArticle article2 = new MyArticle("금일 코로나 확진자 수가 최대 확진자 수를 갱신하였습니다.", sbsNews);
		article2.complete();
		
		MyArticle article3 = new MyArticle("명일 코로나 백신 투약 예정일입니다.", mbcNews);
		article3.complete();
		
		
		
	}

}
