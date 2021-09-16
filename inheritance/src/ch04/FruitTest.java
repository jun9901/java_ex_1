package ch04;

public class FruitTest {

	public static void main(String[] args) {
		
		Peach peach = new Peach();
		Banana banana = new Banana();
		
		peach.showInfo();
		banana.showInfo();
		// 다형성 - 클래스를 다양한 형태로 바라본다(배)
		// 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
		// 같은 코드에서 여러 다른 실행 결과가 나올수도 있다.
		// 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
		// 다형성을 잘 활용하면 유연하고 확장성 있고, 유지보수가 편리한 프로그램을 만들 수 있다.
		
		System.out.println("---------------");
		// 하나의 변수에 여러개의 연관된 데이터 ㅈ료형을 담는다.
		Fruit[] basket = new Fruit[4];
		basket[0] = new Banana();
		basket[1] = new Peach();
		basket[2] = new Banana();
		basket[3] = new Peach();
		
		// 코딩 시점 - 컴파일 타임(타입까지만 확인 가능)
		// 런 타임 - 프로그램 실행 시 동작 시점
		// .연산자를 사용하게 되면 객체의 타입까지만 확인 가능.
		// origin 멤버 변수에 접근하기 위해서는 다운 캐스팅을 해야 한다.
		
		String temp = ((Banana)basket[0]).origin;
		// instanceof 연산자
		if(basket[0] instanceof Banana) {
			System.out.println("바나나 타입입니다.");
		} else {
			System.out.println("복숭아 타입입니다.");
		}
		
		if(basket[1] instanceof Peach) {
			System.out.println("복숭아 타입입니다.");
		}
		
		// 문제1. for문을 ㅅ용해서 바나나 타입일 경우 화면에 origin 값을 출력하라.
		for (int i = 0; i < basket.length; i++) {
			basket[i].showInfo();
			if(basket[i] instanceof Banana) {
				String origin = ((Banana)basket[i]).origin;
				System.out.println("원산지 :  " + origin );

			}
		}
		
	}

}
