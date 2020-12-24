package Layout_Manager;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest {
	public static void main(String args[]) {
		new BorderLayout1();
	}
}

class BorderLayout1 extends JFrame {
	public BorderLayout1() {
		Container ct = getContentPane();
		BorderLayout b1 = new BorderLayout(10, 10);
		
		ct.setLayout(b1);
		ct.add(new JButton("EAST Button"), BorderLayout.EAST);
		ct.add(new JButton("WEST Button"), BorderLayout.WEST);
		ct.add(new JButton("NORTH Button"), BorderLayout.NORTH);
		ct.add(new JButton("SOUTH Button"), BorderLayout.SOUTH);
		ct.add(new JButton("CENTER Button"), BorderLayout.CENTER);
		
		setTitle("BorderLayout Test");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}