package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		// 문제 1.
		// Animal 타입으로 호랑이 생성.
		// Animal 타입으로 독수리 생성.
		// Animal 타입으로 사람 생성.
		
		Animal tiger =  new Tiger();
		Animal eagle =  new Eagle();
		Animal person =  new Person();
		
		// 문제 2.
		// Animal 타입으로 배열을 선언해 하라. 배열의 크기는 3.
		Animal[] animals = new Animal[3];
		
		// 문제 3.
		// 배열 안에 값 넣기(호라이, 독수리, 사람)
		animals[0] = tiger;
		animals[1] = eagle;
		animals[2] = person;
		
		// (tiger, eagle, person) move, hunt 메서드 호출
		// for문을 이용하여 만들어라.
		for (int i = 0; i < animals.length; i++) {
			
			animals[i].move();
			animals[i].hunt();
		}
		
	}

}
