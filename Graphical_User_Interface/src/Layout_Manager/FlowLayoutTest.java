package Layout_Manager;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest {
	public static void main(String args[]) {
		new FlowLayout1();
	}
}

class FlowLayout1 extends JFrame {
	public FlowLayout1() {
		Container ct=getContentPane();
		FlowLayout f1=new FlowLayout(FlowLayout.RIGHT, 10, 15);
		ct.setLayout(f1);
		for(int i=0;i<=15;i++) {
			ct.add(new JButton("Button "+i));
		}
		setSize(400, 300);
		setTitle("FlowLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}