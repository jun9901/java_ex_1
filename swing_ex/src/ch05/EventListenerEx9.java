package ch05;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventListenerEx9 {

	public static void main(String[] args) {
		new MyFrame9();
	}

}

class MyFrame9 extends JFrame {
	
	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	MyImagePanel imagePanel;
	int xPoint = 200;
	int yPoint = 200;
	
	public MyFrame9() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		try {
			backgroundImage = ImageIO.read(new File("background2.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
			System.out.println("파일을 정상적으로 가지고 왔습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		imagePanel = new MyImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(new MyKeyListener());
	}
	
	private class MyImagePanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, xPoint, yPoint, 100, 100, null);
			System.out.println("Log : paintComponent 메서드 실행");
		}
	}

	private class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			System.out.println("keyCode :" + keyCode);
			
			if(keyCode == KeyEvent.VK_UP) {
				System.out.println("방향키가 위로 눌러졌습니다.");
				yPoint = (yPoint < 0) ? 0 : yPoint - 10;
			} else if(keyCode == KeyEvent.VK_DOWN) {
				System.out.println("방향키가 아래로 눌러졌습니다.");
				yPoint = (yPoint > getHeight() - 100) ? yPoint : yPoint + 10;
			} else if(keyCode == KeyEvent.VK_LEFT) {
				System.out.println("방향키가 왼쪽으로 눌러졌습니다.");
				xPoint = (xPoint < 0) ? 0 : xPoint - 10;
			} else if(keyCode == KeyEvent.VK_RIGHT) {
				System.out.println("방향키가 오른쪽으로 눌러졌습니다.");
				xPoint = (xPoint > getWidth() - 100) ? xPoint : xPoint + 10;
			}
			repaint();
		}
	}
}