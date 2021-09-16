package ch12;

public class ArrayMainTest {

	public static void main(String[] args) {
		Book book1 = new Book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�.", "������");
		Book book4 = new Book(4, "�������θ����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");
		
		/*
		 * ����
		 * �迭�� �̿��Ͽ� shoppingCart ������ ��ƶ�.
		 * 1. �迭�� �����ϰ� ũ�⸦ 10���� ������.
		 * 2. ��� ���� å�� ��ٱ��Ͽ� ��ƶ�.
		 * 3. ��ٱ��Ͽ� ���� ������ ȭ�鿡 ����϶�. �� null�� ������� ����.
		 * 4. 0��° �ε����� �������� ���� å�� �߰��ϰ� ������ �ִ� [0],[1],[2]�� �����϶�.
		 */
		// 1.
		Book[] shoppingCart = new Book[10];
		
		// 2.
		shoppingCart[0] = book2;
		shoppingCart[1] = book3;
		shoppingCart[2] = book5;
		
		// 3.
		for (int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		
		System.out.println("-----------------");
		// 4.
		for (Book book : shoppingCart) {
			if(book != null) {
				book.showInfo(
						);
			}
		}		
	}
}
