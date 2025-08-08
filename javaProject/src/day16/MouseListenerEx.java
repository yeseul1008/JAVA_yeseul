package day16;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {
	 private JLabel la = new JLabel("Hello"); 
	 public MouseListenerEx() { // 생성자
	  setTitle("Mouse 이벤트 예제");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  Container c = getContentPane();
	  c.addMouseListener(new MouseListener() { // 익명클래스
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			 int x = e.getX();
			 int y = e.getY();
			 la.setLocation(x, y);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	  c.setLayout(null);
	  la.setSize(50, 20);
	  la.setLocation(30, 30);
	  c.add(la);
	  
	  setSize(250, 250);
	  setVisible(true);
	 }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();
	}

}
