package ch08;

public class Person {
	/*
	 * this 란
	 * 1. 인스턴스(객체) 자기 자신의 메모리를 가리킨다.
	 * 2. 생성자에서 또 다른 생성자를 호출할 때 사용 할 수 있다.
	 * 3. 자신의 주소(참조값, 주소값)을 반환 시킬 수 있다.
	 */
	String name;
	int age;
	String phoneNumber;
	
	public Person(String name, int age) {
		System.out.println("생성자 1번 호출");
		this.name = name;
		this.age = age;
	}
	
	// 2.
	public Person() {
		this("이름없음", 1);
		System.out.println("생성자 2번 호출");
	}
	
	public Person(String name, int age, String phoneNumber) {
		this(name, age);
		// this.name = name;
		// this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	// 3.
	public Person gerPerson() {
		return this;
	}
}
