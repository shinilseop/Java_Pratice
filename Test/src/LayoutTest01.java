import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutTest01 {
	public static void main(String args[]) {
		new UI_Test01();
	}
}

class UI_Test01 extends JFrame {
	UI_Test01() {
		Container ct = getContentPane();
		JPanel jp = new JPanel();
		BorderLayout bl=new BorderLayout(10, 10);
		GridLayout gl =new GridLayout(5,5,5,5);
		
		ct.setLayout(bl);
		ct.add(new JButton("EAST"), BorderLayout.EAST);
		ct.add(new JButton("WEST"), BorderLayout.WEST);
		ct.add(new JButton("NORTH"), BorderLayout.NORTH);
		ct.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		ct.add(jp);
		
		jp.setLayout(gl);
		for(int i=0;i<25;i++) {
			jp.add(new JButton("Button "+i));
		}
		
		setTitle("JPanel Test");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}