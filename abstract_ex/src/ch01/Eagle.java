package ch01;

public class Eagle extends Animal {
	@Override
	public void hunt() {
		System.out.println("독수리가 날다가 토끼를 사냥 합니다.");
	}
	@Override
	public void move() {
		System.out.println("독수리가 날개를 쭉 펴고 날아 갑니다.");
	}
}
