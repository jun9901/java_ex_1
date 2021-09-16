package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainTest1 {

	public static void main(String[] args) {
		new MyFrame();
	}

}

class ImagePanel extends JPanel {
	private Image image;

	public ImagePanel() {
		image = new ImageIcon("image1.jpg").getImage();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
}

class MyFrame extends JFrame {

	// 멤버 변수 ImagePanel imagePanel
	ImagePanel imagePanel;

	public MyFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		// 기본 코드 작성
		setTitle("이미지 패널 연습");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		// 500, 500
		// ImagePanel 메모리 올리기
	}

	private void setInitLayout() {
		// 기본코드
		setVisible(true);
		add(imagePanel);
	}
}
