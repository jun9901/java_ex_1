package ch08;

public class PersonMainTest {
	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1.name);
		System.out.println(person1.age);
		
		Person pv = person1.gerPerson();
		System.out.println(pv);
	}
}
