package day16;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
/// 어뎁터 클래스
public class MouseListenerEx2_adaptor extends JFrame {
	 private JLabel la = new JLabel("Hello"); 
	 public MouseListenerEx2_adaptor() { // 생성자
	  setTitle("Mouse 이벤트 예제"); // 타이틀 영역
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 완전히 종료
	  Container c = getContentPane(); // 컨텐츠 팬 c 변수에 가져오기
	  c.addMouseListener(new MouseAdapter() { // 어댑터 클래스는 필요한 메소드만 따로 때서 오버라이딩 하면 됨
		  @Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			 int x = e.getX();
			 int y = e.getY();
			 la.setLocation(x, y);
		}
	  });
	  
	  c.setLayout(null); // 배치관리자 (null을 쓰면 제공하는 지정된 위치 말고 내가 좌표를 정해서 배치할수있음) 
	  la.setSize(50, 20); // 사이즈
	  la.setLocation(30, 30); // x축 y축으로 위치 정의
	  c.add(la);// 컨텐츠팬에 la 추가
	  
	  setSize(250, 250); // 프로그램화면 사이즈
	  setVisible(true);
	 }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx2_adaptor();
	}

}
