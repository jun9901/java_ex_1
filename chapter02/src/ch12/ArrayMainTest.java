package ch12;

public class ArrayMainTest {

	public static void main(String[] args) {
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다.", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");
		
		/*
		 * 문제
		 * 배열을 이용하여 shoppingCart 변수에 담아라.
		 * 1. 배열을 선언하고 크기를 10으로 만들어라.
		 * 2. 사고 싶은 책을 장바구니에 담아라.
		 * 3. 장바구니에 담은 정보를 화면에 출력하라. 단 null은 출력하지 마라.
		 * 4. 0번째 인덱스에 선택하지 않은 책을 추가하고 기존에 있던 [0],[1],[2]을 정렬하라.
		 */
		// 1.
		Book[] shoppingCart = new Book[10];
		
		// 2.
		shoppingCart[0] = book2;
		shoppingCart[1] = book3;
		shoppingCart[2] = book5;
		
		// 3.
		for (int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		
		System.out.println("-----------------");
		// 4.
		for (Book book : shoppingCart) {
			if(book != null) {
				book.showInfo(
						);
			}
		}		
	}
}
