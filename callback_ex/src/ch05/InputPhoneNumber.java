package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class InputPhoneNumber {

	ArrayList<String> userName = new ArrayList<>();
	ArrayList<String> telNumber = new ArrayList<>();
	public ArrayList<String> getUserName() {
		return userName;
	}
	
	public ArrayList<String> getTelNumber() {
		return telNumber;
	}
	
	public void savePhoneNumber() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		String number = "";
		
		do {
			System.out.println("중지하려면 -1을 입력하세요");
			System.out.print("이름을 입력하세요 \t:");
			name = sc.nextLine();
			if(!(name.equals("-1"))) {
				System.out.print("전화번호를 입력하세요 \t:");
				number = sc.nextLine();
				userName.add(name);
				telNumber.add(number);
			}
		} while (!(name.equals("-1")));
	}
	
	public void showInfo() {
		System.out.println("---------------------");
		for (int i = 0; i < userName.size(); i++) {
			System.out.print("[" + userName.get(i) + "] : ");
			System.out.println(telNumber.get(i));
		}
		System.out.println("---------------------");
	}
	public static void main(String[] args) {
		
		InputPhoneNumber inputPhoneNumber =  new InputPhoneNumber();
		inputPhoneNumber.savePhoneNumber();
		inputPhoneNumber.showInfo();
	}
}
