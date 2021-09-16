package ch07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainTest2 {

	public static void main(String[] args) {
		new MyFrameEx1();
	}

}

class MyFrameEx1 extends JFrame {
	
	MyPanel1 myPanel;
	BorderLayout borderLayout;
	JButton button;
	
	public MyFrameEx1() {
		iniData();
		setInitLayout();
		addEventListener();
		
	}

	// 보더 레이아웃 클릭 
	private void iniData() {
		setTitle("로또 번호 생성기");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		myPanel = new MyPanel1();
		borderLayout = new BorderLayout();
		button = new JButton("클릭");
		
		
	}

	private void setInitLayout() {
		setVisible(true);
		setBackground(Color.gray);
		add(myPanel);
		add(button , borderLayout.NORTH);
		
	}
	
	private void addEventListener() {
		// TODO Auto-generated method stub
		
	}
	
	private class MyPanel1 extends JPanel {
		@Override
		public void paint(Graphics g) {
			
			Font font = new Font("궁서체", Font.BOLD, 20);
			g.setFont(font);
			g.drawString("로또 버튼을 클릭하세요", 180, 180);
		}
	}
	private class MyPanel2 extends JPanel {
		@Override
		public void paint(Graphics g) {
			MyMouseListender mouseListender = new MyMouseListender();
			mouseListender.lottoNumber().
		}
	}
	
	private class MyMouseListender extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			lottoNumber();
		}
		
		public String lottoNumber() {
			int[] numbers = new int[6];
			Random random = new Random();
			
			// 랜덤번호
			
			for (int i = 0; i < numbers.length; i++) {
				int selectedNumber = random.nextInt(45) + 1;
				numbers[i] = selectedNumber;
				for (int j = 0; j < i; j++) {
					if(numbers[i] == numbers[j]) {
						i = i - 1;
						break;
					}
				}
			}
			Arrays.sort(numbers);
			for (int i : numbers) {
				System.out.println("생성된 값 :" + i);
			}
			return numbers + "";
		}
	}
	
}
