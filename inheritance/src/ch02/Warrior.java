package ch02;

public class Warrior extends Hero {
	

	
	public Warrior(String name, int hp) {
		super(name, hp);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println("comboAttack!");

	}
}
