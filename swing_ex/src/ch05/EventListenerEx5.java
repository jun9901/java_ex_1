package ch05;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventListenerEx5 {

	public static void main(String[] args) {
		new MyFrame5();
		
	}

}
// class MyFrame5 extends JFrame implements MouseListener
class MyFrame5 extends JFrame {

	JLabel label;

	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		label = new JLabel("Hello");
		label.setSize(50, 50);
		System.out.println(label.getBounds());
	}

	public void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		label.setLocation(50, 50);
	}

	public void addEventListener() {
		// this.addMouseListener(this);
		// 익명 구현 객체로 코드 변경하기
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 버튼을 눌렀다가 땠습니다.");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스가 나갔습니다.");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스가 들어왔습니다.");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	// 마우스가 눌러 졌을때 실행되는 메서드
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println(e.getX() + ": x좌표 값");
//		System.out.println(e.getY() + ": y좌표 값");
//		
//		System.out.println(getHeight() + ": getHeight()");
//		System.out.println(getWidth() + ": getWidth()");
//		label.setLocation(e.getX(), e.getY() - label.getBounds().height);
//	}

//	// 마우스가 눌러졌을때 실행되는 메서드
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	// 마우스가 떨어졌을때 실행되는 메서드
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	// 마우스가 들어왔을때 실행되는 메서드
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	// 마우스가 나갔을때 실행되는 메서드
//	@Override
//	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	
}
