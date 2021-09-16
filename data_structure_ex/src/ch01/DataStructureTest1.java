package ch01;

import java.util.HashSet;
import java.util.Iterator;

public class DataStructureTest1 {

	public static void main(String[] args) {

		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(1); // 중복 값
		set1.add(2);
		set1.add(3);
		set1.add(3);
		set1.add(3);
		
		// 사이즈 확인
		System.out.println(set1.size());
		
		set1.remove(1);
		System.out.println(set1);
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		
		// for문 사용법
		for(int i = 0; i < set1.size(); i++) {
			System.out.println("set1 값 확인 :" + i);
		}
		
		// while 사용 방법
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("값 확인 :" + iter.next());
		}
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		System.out.println("---------------------");
		set2.add(getRandomNumbe)
	}

}
