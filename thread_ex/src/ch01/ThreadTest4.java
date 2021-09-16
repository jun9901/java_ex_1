package ch01;

public class ThreadTest4 {

	public static void main(String[] args) {
		
		// Thread란
		// process : 프로그램이 실행되면 os로 부터 메모리를 할당 받아서 프로세스 상태가 된다.
		// thread : 하나의 프로세스는 하나 이상의 thread를 가지게 되고, 실제 작업을 수행하는 단위이다.
		
		// multi-threading
		// 여러 thread가 동시에 수행되는 프로그래밍을 만들때, 여러 작업이 동시에 실행되는 효과를 만들어 낸다.
		
		// thread는 각각 자신만의 작업 공간을 가진다.(context)
		
		// thread 사이에서 공유하는 자원을 가질 수 있다.
		// 여러 thread가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는 race condition이 발생할 수 있다.
		// (의도하지 않는 결과를 생성 할 수 있다.)
		
		// 이렇게 여러 thread가 공유하는 자원 중 경쟁이 발생하는 부분을 critical section이라고 한다.(임계 영역)
		
		// 동기화 작업을 해주어야 한다.(일종의 순차적 수행) 구현하지 않을 경우 오류가 발생 할 수있다.
		
		
	}

}
