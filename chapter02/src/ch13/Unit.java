package ch13;

public abstract class Unit {
	protected String name;
	protected int power;
	protected int hp;
	
	
	
	public String getName() {
		return name;
	}

	public void showInfo() {
		System.out.println("===����â(" + this.name +")===");
		System.out.println("�̸� :" + this.name);
		System.out.println("���ݷ� :" + this.power);
		System.out.println("ü�� :" + this.hp);
		System.out.println("=========");
	}
	
	public void attack(Unit unit) {
		System.out.println(this.name + "�� " + unit.getName() + "�� �����մϴ�.");
		unit.beAtacked(this.power);
	}
	
	public void beAtacked(int power) {
		if(this.hp == 0) {
			System.out.println("�̹� ����Ͽ����ϴ�.");
		} else {
			this.hp -= power;
		}
	}
}
