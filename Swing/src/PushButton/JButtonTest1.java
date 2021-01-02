package PushButton;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest1 {
	public static void main(String args[]) {
		new JButtonDemo1();
	}
}

class JButtonDemo1 extends JFrame {
	JButtonDemo1() {
		ImageIcon korea = new ImageIcon("image/korea.gif");
		ImageIcon usa = new ImageIcon("image/usa.gif");
		ImageIcon germany = new ImageIcon("image/germany.gif");

		JButton nat = new JButton(korea);
		nat.setPressedIcon(usa);
		nat.setRolloverIcon(germany);
		
		Container ct = getContentPane();
		ct.add(nat);
		
		setTitle("JButton Test1");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}