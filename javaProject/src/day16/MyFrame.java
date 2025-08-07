package day16;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		// 스윙 프레임은 생성자에 코드를작성해서 생성자 기반으로 실행됨
		setTitle("300x300 스윙프레임만들기");
		setSize(300,300); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame(); // 객체 만들 때 생성자 호출
	}

}
