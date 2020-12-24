package Layout_Manager;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GirdLayout {
	public static void main(String args[]) {
		new GridLayout1();
	}
}

class GridLayout1 extends JFrame {
	public GridLayout1() {
		Container ct = getContentPane();
		GridLayout gl = new GridLayout(3,5,5,5);
		
		ct.setLayout(gl);
		for(int i=1;i<=15;i++) {
			ct.add(new JButton("Button "+i));
		}
		setTitle("GridLayout Test");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}