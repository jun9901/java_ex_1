package ch01;

import java.util.HashSet;
import java.util.Iterator;

public class DataStructureTest1 {

	public static void main(String[] args) {

		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(1); // �ߺ� ��
		set1.add(2);
		set1.add(3);
		set1.add(3);
		set1.add(3);
		
		// ������ Ȯ��
		System.out.println(set1.size());
		
		set1.remove(1);
		System.out.println(set1);
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		
		// for�� ����
		for(int i = 0; i < set1.size(); i++) {
			System.out.println("set1 �� Ȯ�� :" + i);
		}
		
		// while ��� ���
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("�� Ȯ�� :" + iter.next());
		}
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		System.out.println("---------------------");
		set2.add(getRandomNumbe)
	}

}
