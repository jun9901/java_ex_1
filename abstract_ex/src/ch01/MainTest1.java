package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		// ���� 1.
		// Animal Ÿ������ ȣ���� ����.
		// Animal Ÿ������ ������ ����.
		// Animal Ÿ������ ��� ����.
		
		Animal tiger =  new Tiger();
		Animal eagle =  new Eagle();
		Animal person =  new Person();
		
		// ���� 2.
		// Animal Ÿ������ �迭�� ������ �϶�. �迭�� ũ��� 3.
		Animal[] animals = new Animal[3];
		
		// ���� 3.
		// �迭 �ȿ� �� �ֱ�(ȣ����, ������, ���)
		animals[0] = tiger;
		animals[1] = eagle;
		animals[2] = person;
		
		// (tiger, eagle, person) move, hunt �޼��� ȣ��
		// for���� �̿��Ͽ� ������.
		for (int i = 0; i < animals.length; i++) {
			
			animals[i].move();
			animals[i].hunt();
		}
		
	}

}
