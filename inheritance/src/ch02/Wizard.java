package ch02;

public class Wizard extends Hero{

	public Wizard(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println("freezing!");
	}
}
