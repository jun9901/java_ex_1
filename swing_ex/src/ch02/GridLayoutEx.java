package ch02;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{

	// 배열로 변경 --> ArrayList 변경 코드 수정
	// private JButton[] button = new JButton[6];
	ArrayList<JButton> buttons = new ArrayList<>();
	private final int MAX_COUNT = 5;
	
	public GridLayoutEx() {
	
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("GirdLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		for (int i = 0; i < MAX_COUNT; i++) {
			buttons.add(new JButton(Integer.toString(i+1)));
		}
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 3));
		for (int i = 0; i < MAX_COUNT; i++) {
			this.add(buttons.get(i));
		}
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
		
	}
}
