package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame {
	private JLabel[] keyMessage; // JLabel로 만든 객체들이 들어가는 배열

	public KeyListenerEx() {
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		 c.addKeyListener(new KeyAdapter() {
		
		 @Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			 int keyCode = e.getKeyCode(); //입력된 키의 자바 가상키값알아내기
			 char keyChar = e.getKeyChar(); //키의 문자 코드(유니코드) 알아내기 //문자에만 작동
			 keyMessage[0].setText(Integer.toString(keyCode));
			 keyMessage[1].setText(Character.toString(keyChar));
			 keyMessage[2].setText(e.getKeyText(keyCode)); // 키 이름 문자열리턴
		}
		 
		 });

		keyMessage = new JLabel[3]; 
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		 for(int i=0; i<keyMessage.length; i++) {
			 c.add(keyMessage[i]); // 컨테이너에 라벨 순차적으로 부착
			 keyMessage[i].setOpaque(true); //라벨이 배경색 갖도록
			 keyMessage[i].setBackground(Color.YELLOW);
			 }
		 
		 setSize(300,150);
		 setVisible(true);
		 c.setFocusable(true);
		 c.requestFocus();
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyListenerEx();
	}

}
