package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelMainTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
//class MyPanel extends JPanel {
//
//@Override
//public void paint(Graphics g) {
//	super.paint(g);
//	g.drawString("House", 310, 180);
//	g.drawString("●●●●●●●●●●●●●●●●●●●●●",200, 205);
//	g.drawString("☆",100, 105);
//	g.drawString("☆",50, 85);
//	g.drawString("☆",370, 45);
//	g.drawString("☆",470, 25);
//	g.drawString("☆",670, 65);
//	g.drawString("★",590, 35);
//	g.drawString("★",720, 11);
//	g.drawString("★",20, 11);
//	g.drawString("★",120, 31);
//	
//	g.drawString("●",383, 405);
//	g.drawLine(325, 100, 450, 200); // 선을 긋다 x축 y축
//	g.drawLine(325, 100, 200, 200); // 선을 긋다 x축 y축
//	g.drawLine(385, 400, 388, 402); // 선을 긋다 x축 y축
//	g.drawLine(388, 400, 385, 402); // 선을 긋다 x축 y축
//	g.drawRect(200, 200, 250, 250);
//	g.drawRect(350, 350, 50, 100);
//	g.drawRect(250, 250, 50, 50);
//	g.drawLine(275, 250, 275, 300); // 선을 긋다 x축 y축
//	g.drawLine(250, 275, 300, 275); // 선을 긋다 x축 y축
//}
//
//
//} // end of MyPanel

class MyFrame extends JFrame {

	MyPanel panel;

	public MyFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("java 2D Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 800);
		panel = new MyPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(panel);
	}

// 내부 클래스 - static 정적 내부클래스, 익명 내부 클래스  
	class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);

			// 800, 800 : x -> 0 ~ 800 y -> 0 ~ 800
			g.drawRect(200, 200, 200, 200);
			g.drawLine(300, 100, 200, 200);
			g.drawLine(300, 100, 400, 200);
		}
	} // end of MyPanel
} // end of MyFrame
