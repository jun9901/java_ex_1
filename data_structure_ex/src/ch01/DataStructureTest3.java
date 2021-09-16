package ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DataStructureTest3 {

	public static void main(String[] args) {

		List lit0;
		
		// 순서가 있고(인덱스) 중복이 가능
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Student> members = new ArrayList<>();
		
		// 값 추가 방법
		list.add(3); // index 0
		list.add(null); // index 1
		list.add(1, 10); // index 1에 10을 삽입(null을 index 2번으로 밀려남)
		System.out.println("값 추가 확인 :" + list); // 값 추가 확인 :[3, 10, null]
		
		// 값 삭제 방법
		list.remove(2);
		// list.clear();
		System.out.println("값 삭제 확인 remove :" + list); // 값 삭제 확인 remove :[3, 10]
		System.out.println("사이즈 확인 :" + list.size());
		
		// 값 출력 방법
		System.out.println(list.get(1));
		
		for (Integer i : list) {
			System.out.println("for 사용법 :" + i);
		}
		
		// while 사용방법
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
		// 문제1 
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("while 사용법 :" + iter.next());
		}
		
		// ArrayList 값 검색
		// 리스트 안 값이 있는지 확인 - 리턴값 true or fasle
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));
		
		// 10 값이 어디에 있는가? 인덱스 번호를 알아야 되는 상황
		// 값이 ㅣ있으면 인데스 번호를 반환, 없으면 -1을 반환합니다.
		System.out.println(list.indexOf(3));
		System.out.println(list.indexOf(10));
		System.out.println(list.indexOf(100));
		
		
		
	}

}

class Student{
	String name;
	int grade;
}
