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
		setTitle("���콺 �̺�Ʈ");
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
		// �͸� ���� ��ü�� �ڵ� �����ϱ�
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("���콺 ��ư�� �����ٰ� �����ϴ�.");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("���콺�� �������ϴ�.");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("���콺�� ���Խ��ϴ�.");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	// ���콺�� ���� ������ ����Ǵ� �޼���
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println(e.getX() + ": x��ǥ ��");
//		System.out.println(e.getY() + ": y��ǥ ��");
//		
//		System.out.println(getHeight() + ": getHeight()");
//		System.out.println(getWidth() + ": getWidth()");
//		label.setLocation(e.getX(), e.getY() - label.getBounds().height);
//	}

//	// ���콺�� ���������� ����Ǵ� �޼���
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	// ���콺�� ���������� ����Ǵ� �޼���
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	// ���콺�� �������� ����Ǵ� �޼���
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	// ���콺�� �������� ����Ǵ� �޼���
//	@Override
//	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	
}
