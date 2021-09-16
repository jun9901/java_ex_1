package ch02;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	// 반복 : 배열, ArrayList
	// 배열, ArrayList 코드 수정
	private JButton[] button = new JButton[6];
	private Label label;
	
	public FlowLayoutEx() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("Flow Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
		
		// for 문으로 코드 수정
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(Integer.toString(i+1));
		}
		label = new Label("안녕하세요");
	}
	
	private void setInitLayout() {
		setVisible(true);
		// for 문으로 코드 수정
		for (int i = 0; i < button.length; i++) {
			this.add(button[i]);
		}
	
		
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
		// f1.button1.setText("버튼에 이름을 변경합니다.");
	}

}
