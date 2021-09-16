package ch12;

import java.util.ArrayList;

public class ArrayListMainTest {
	
	public static void main(String[] args) {
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다.", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");
		
		/*
		 * ArrayList 사용 방법
		 * 데이터를 담은 공간 만들기
		 * ! ArrayList는 배열과 달리 공간에 크기를 먼저 선언할 필요가 없다.
		 * 
		 */
		ArrayList<Book> shoppingCart = new ArrayList<Book>();
		
		// 추가 방법
		// 데이터 추가하기(값 넣기)
		shoppingCart.add(book1);
		shoppingCart.add(book2);
		shoppingCart.add(book5);
		
		//추가 방법2
		shoppingCart.add(0, book3);
		
		// 화면에 출력
		for(int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		// 응용
		System.out.println("-------------");
		// 사이즈 구하기
		int mySize = shoppingCart.size();
		System.out.println("Mysize :" + mySize);
		// ArrayList의 크기 : 3
		// ArrayList의 인덱스의 크기 : 0 ~ 2;
		shoppingCart.remove(mySize-1);
		
		
		// 삭제하는 방법
		//shoppingCart.remove(3);
		//shoppingCart.removeAll();
		System.out.println("---------------");
		//화면에 출력
		for(int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		
		// 수정하기 set
		shoppingCart.set(1, book4);
		System.out.println("-------------");
		
		for (Book book : shoppingCart) {
			book.showInfo();
			
		}
	}
}
