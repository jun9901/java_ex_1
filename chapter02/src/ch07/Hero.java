package ch07;

public class Hero {
	private String name;
	private int hp;
	private int power;
	
	public Hero(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
	}

	// getter, setter
	// read only
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	// ���� 1. setName
	public void setName(String name) {
		this.name = name;
	}
	
	// ���� 2. setHp
	public void setHp(int hp) {
		if(hp < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else {
			this.hp = hp;
		}

	}
	
}
