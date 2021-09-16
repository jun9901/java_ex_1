package ch12;

public class Book {
	int id;
	String title;
	String author;
	
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("id :" + id);
		System.out.println("title :" + title);
		System.out.println("author :" + author);
	}
}
