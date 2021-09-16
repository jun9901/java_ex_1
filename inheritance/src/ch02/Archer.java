package ch02;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println("firArrow!");
	}
}
