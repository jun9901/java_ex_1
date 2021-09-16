package ch05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventListenerEx1 {

	public static void main(String[] args) {

		new MyFrame1();
		
	}

}
class MyFrame1 extends JFrame implements ActionListener {
	
	JButton button;
	
	public MyFrame1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("이벤트 리스너 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		button = new JButton("button1");
	
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
	}
	
	private void addEventListener() {
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("콜백메서드 실행");
		System.out.println("버튼이 클릭되었습니다.");
		System.out.println(e.toString());
	}
}