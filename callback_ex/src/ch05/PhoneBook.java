package ch05;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class PhoneBook extends JFrame{

	InputPhoneNumber inputPhoneNumber;
	
	public PhoneBook() {
		inputPhoneNumber = new InputPhoneNumber();
		inputPhoneNumber.savePhoneNumber();
		
		initData();
		setInitLayout();
		addEventListnere();
	}

	private void initData() {
		setTitle("Phone Book");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
	}

	private void setInitLayout() {
		ArrayList<String> name = inputPhoneNumber.getUserName();
		ArrayList<String> tel = inputPhoneNumber.getTelNumber();
		setLayout(new GridLayout(name.size(), 2));
		for (int i = 0; i < name.size(); i++) {
			JTextField field1 = new JTextField(name.get(i), 10);
			JTextField field2 = new JTextField(tel.get(i), 20);
			add(field1);
			add(field2);
		}
		setVisible(true);
	}

	private void addEventListnere() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new PhoneBook();
	}
}
