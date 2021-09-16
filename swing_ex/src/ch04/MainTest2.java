package ch04;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainTest2 {
	
	public static void main(String[] args) {
		new MyFrame2();
	}
}

class MyFrame2 extends JFrame {
	BufferedImage backgroundImage; 
	BufferedImage imageIcon; 
	MyImagePanel imagePanel; 
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이미지를 가지고 와서 사용하기 
		try {
			backgroundImage = ImageIO.read(new File("background2.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.out.println("파일이 없습니다!");
			e.printStackTrace();
		}
		imagePanel = new MyImagePanel();
	} // end of initData 
	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(imagePanel);
	}
	// 내부 클래스 생성 
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, 200, 200, 100, 100, null);
		}
	} // end of MyImagePanel(내부 클래스) 
}


