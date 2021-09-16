package ch02;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	// �ݺ� : �迭, ArrayList
	// �迭, ArrayList �ڵ� ����
	private JButton[] button = new JButton[6];
	private Label label;
	
	public FlowLayoutEx() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("Flow Layout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
		
		// for ������ �ڵ� ����
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(Integer.toString(i+1));
		}
		label = new Label("�ȳ��ϼ���");
	}
	
	private void setInitLayout() {
		setVisible(true);
		// for ������ �ڵ� ����
		for (int i = 0; i < button.length; i++) {
			this.add(button[i]);
		}
	
		
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
		// f1.button1.setText("��ư�� �̸��� �����մϴ�.");
	}

}
