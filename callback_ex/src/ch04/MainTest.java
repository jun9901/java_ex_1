package ch04;

public class MainTest {

	public static void main(String[] args) {

		// ��Ŀ ���� ��ü ����
		HackerNews hackerNews = new HackerNews();
		
		// ��� �ۼ�
		MyArticle article = new MyArticle("���� ������ �ſ� �����ϴ�.", hackerNews);
		article.complete();
		
		// sbs Ŭ������ ������.
		// mbc Ŭ������ ������.
		SbsNews sbsNews = new SbsNews();
		MbcNews mbcNews = new MbcNews();
		
		MyArticle article2 = new MyArticle("���� �ڷγ� Ȯ���� ���� �ִ� Ȯ���� ���� �����Ͽ����ϴ�.", sbsNews);
		article2.complete();
		
		MyArticle article3 = new MyArticle("���� �ڷγ� ��� ���� �������Դϴ�.", mbcNews);
		article3.complete();
		
		
		
	}

}
