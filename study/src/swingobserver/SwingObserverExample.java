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
		
		JButton button = new JButton("�ұ� ����?");
		/*
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		*/
		
		//���� ǥ���� ==> ActionListener(AngelListener, DevilListener) ��ü�� ����� �ܰ� �ǳʶ�
		button.addActionListener(event->System.out.println("������! �Ƹ� ��ȸ�� ��?"));
		button.addActionListener(event->System.out.println("�׳� ������ ����!!"));
		//������ �Ӽ� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
