package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {
    private JLabel la = new JLabel();

    public KeyCodeEx() {
        setTitle("Key Code 예제 : F1키:초록색, % 키:노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        // ✅ KeyListener 등록 (익명 클래스 사용)
        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("유니코드 값 ==> " + e.getKeyChar());
                System.out.println("가상키 값 ==> " + e.getKeyCode());
                System.out.println("특수키 포함 값 ==> " + e.getKeyText(e.getKeyCode()));

                if (e.getKeyChar() == '%') {
                    c.setBackground(Color.YELLOW);
                } else if (e.getKeyCode() == KeyEvent.VK_F1) {
                    c.setBackground(Color.GREEN);
                }
            }
        });

        // ✅ 라벨 추가
        c.add(la);

        // ✅ 창 설정
        setSize(300, 150);
        setVisible(true);

        // ✅ 포커스 설정 (키 이벤트를 받기 위해 필요)
        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args) {
        new KeyCodeEx();
    }
}
