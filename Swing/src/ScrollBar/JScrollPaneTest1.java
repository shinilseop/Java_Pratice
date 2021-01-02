package ScrollBar;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class JScrollPaneTest1 {
	public static void main(String args[]) {
		new JScrollPaneDemo();
	}
}

class JScrollPaneDemo extends JFrame {
	JScrollPaneDemo() {
		JPanel jp =new JPanel();
		jp.setLayout(new GridLayout(20,5));
		Container ct=getContentPane();
		int b=1;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				jp.add(new JButton(b+"¹ø"));
				b++;
			}
		}
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		System.out.println(v+" "+h);
		JScrollPane jsp=new JScrollPane(jp, v, h);
		
		ct.add(jsp, BorderLayout.CENTER);
		
		setTitle("JScrollPaneTest1");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}