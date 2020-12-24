package Frame;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest2 {
	public static void main(String args[]) {
		JFrame jf=new JFrame("Test Frame(버튼포함)");
		
		Container ct=jf.getContentPane();
		JButton jb=new JButton("Test Button");
		ct.add(jb);
		jf.setSize(400,300);
		jf.setVisible(true);
	}
}
