package ch03;

public class MainTest {

	public static void main(String[] args) {
		Activity1 activity1 = new Activity1("ù��° ȭ��");
		Activity2 activity2 = new Activity2("�ι�° ȭ��");
		activity2.callbackCheckPosition = activity1.callbackCheckPosition;
		
	}

}
