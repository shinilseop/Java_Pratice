package Listener_Interface;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventTest {
	public static void main(String args[]) {
		new MouseEventFrame();
	}
}

class MouseEventPanel extends JPanel implements MouseListener {
	public MouseEventPanel() {
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("MouseClicked Method()");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("MousePressed Method()");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("MouseReleased Method()");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("MouseEntered Method()");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("MouseExited Method()");
	}
}

class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		Container ct = getContentPane();
		JButton jb=new JButton("Test");
		jb.addMouseListener(new MouseEventPanel());
		ct.add(jb);
		setTitle("MouseEvent Test");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}