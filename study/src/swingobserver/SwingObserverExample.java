package swingobserver;
import java.awt.*;
import javax.swing.*;


public class SwingObserverExample {
	JFrame frame;
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	public void go() {
		frame = new JFrame();
		
		JButton button = new JButton("할까 말까?");
		/*
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		*/
		
		//람다 표현식 ==> ActionListener(AngelListener, DevilListener) 객체를 만드는 단계 건너뜀
		button.addActionListener(event->System.out.println("하지마! 아마 후회할 걸?"));
		button.addActionListener(event->System.out.println("그냥 저질러 버렷!!"));
		//프레임 속성 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
