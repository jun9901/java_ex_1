package ch01;

public class BookMainTest {

	public static void main(String[] args) {

		Book book1 = new Book("플러터UI실전", "김근호");
		Book book2 = new Book("플러터UI실전", "김근호");

		System.out.println(book1);
		System.out.println(book1.hashCode());
		
		
		String str = new String("test"); 
		
		System.out.println(str);
		
		System.out.println(str.toString());
		
		// equals 메서드 재정의 하기
		
		// == 주소 값만을 비교한다. 
		// 물리적 객체 비교 
		if(book1 == book2) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("book1과 book2는 다른 객체 입니다");
		}
		
		System.out.println("-----------------------");
		// eqauls book1 book2 비교 해주세요 
		if(book1.equals(book2)) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("boo1과 boo2는 다른 객체 입니다");
		}
	}
}
