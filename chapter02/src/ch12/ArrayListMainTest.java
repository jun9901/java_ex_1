package ch12;

import java.util.ArrayList;

public class ArrayListMainTest {
	
	public static void main(String[] args) {
		Book book1 = new Book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�.", "������");
		Book book4 = new Book(4, "�������θ����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");
		
		/*
		 * ArrayList ��� ���
		 * �����͸� ���� ���� �����
		 * ! ArrayList�� �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����.
		 * 
		 */
		ArrayList<Book> shoppingCart = new ArrayList<Book>();
		
		// �߰� ���
		// ������ �߰��ϱ�(�� �ֱ�)
		shoppingCart.add(book1);
		shoppingCart.add(book2);
		shoppingCart.add(book5);
		
		//�߰� ���2
		shoppingCart.add(0, book3);
		
		// ȭ�鿡 ���
		for(int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		// ����
		System.out.println("-------------");
		// ������ ���ϱ�
		int mySize = shoppingCart.size();
		System.out.println("Mysize :" + mySize);
		// ArrayList�� ũ�� : 3
		// ArrayList�� �ε����� ũ�� : 0 ~ 2;
		shoppingCart.remove(mySize-1);
		
		
		// �����ϴ� ���
		//shoppingCart.remove(3);
		//shoppingCart.removeAll();
		System.out.println("---------------");
		//ȭ�鿡 ���
		for(int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		
		// �����ϱ� set
		shoppingCart.set(1, book4);
		System.out.println("-------------");
		
		for (Book book : shoppingCart) {
			book.showInfo();
			
		}
	}
}
