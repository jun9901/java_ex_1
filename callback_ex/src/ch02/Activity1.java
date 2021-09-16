package ch02;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity1 extends JFrame{

	String name;
	JPanel panel;
	
	CallbackCheckPosition callbackCheckPosition = new CallbackCheckPosition() {
		
		@Override
		public void checkPosition(int x, int y) {
			System.out.println("x :" + x);
			System.out.println("y :" + y);
		}
	};
	
	public Activity1(String name) {
		this.name = name;
		initData();
		setInitLayout();
	
	}

	private void initData() {
		setTitle(name);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		
	}

	private void setInitLayout() {
		setVisible(true);
		add(panel);
		panel.setBackground(Color.blue);
	}
	
	
}
