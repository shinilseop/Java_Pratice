package Panel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JPanelTest {
	public static void main(String args[]) {
		new JPanel1();
	}
}

class JPanel1 extends JFrame {
	JPanel1(){
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(5,1));
		jp1.add(new JRadioButton("자바"));
		jp1.add(new JRadioButton("C"));
		jp1.add(new JRadioButton("VisualBasic"));
		jp1.add(new JRadioButton("JSP"));
		jp1.add(new JRadioButton("PHP"));
		
		JPanel jp2=new JPanel();
		jp2.setLayout(new GridLayout(5,1));
		jp2.add(new JButton("자바"));
		jp2.add(new JButton("C"));
		jp2.add(new JButton("VisualBasic"));
		jp2.add(new JButton("JSP"));
		jp2.add(new JButton("PHP"));
		
		ct.add(jp1, BorderLayout.EAST);
		ct.add(jp2, BorderLayout.WEST);
		setTitle("JPanel Test");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}