package ch01;

public abstract class Animal {
	// 추상 클래스(abstract class)
	// 하나 이상의 추상 메서드를 포함하는 클래스입니다.
	public String name; // 멤버 변수
	
	// 일반 메서드
	public void move() {
		System.out.println("이동 합니다.");
	}
	
	// 추상 메서드
	public abstract void hunt();
	
	// 메인함수
	public static void main(String[] args) {
		
		// 추상 클래스는 일반적으로 사용했던 new 키워드를 사용해서 객체로 만들 수 없다.
		// new Animal();
		
	}
}
