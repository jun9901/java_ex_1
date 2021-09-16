package ch04;

public class MyArticle {

	String article;
	WriteArticle writeArtcle; // 인터페이스 WriteArticle 의 주소값을 writeArtcle라는 변수에 담기.
	
	public MyArticle(String article, WriteArticle writeArticle) {
		this.article = article;
		this.writeArtcle = writeArticle;
	}
	
	public void complete() {
		writeArtcle.printArticle(article); // writeArtcle라는 주소값 안의 printArticle 메서드에 article이라는 변수를 대입
	}
}
