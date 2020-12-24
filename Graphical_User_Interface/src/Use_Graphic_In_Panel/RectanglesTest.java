package Use_Graphic_In_Panel;

import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RectanglesTest {
	public static void main(String args[]) {
		new RectanglesFrame();
	}
}

class RectanglesTest1 extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(10, 10, 100, 100);
		g.fillRect(120, 10, 100, 100);
		g.fillRoundRect(10, 120, 100, 100, 15, 15);
		g.drawRoundRect(120, 120, 100, 100, 30, 40);
	}
}

class RectanglesFrame extends JFrame {
	public RectanglesFrame() {
		setTitle("DrawRectanle Test");
		Container ct = getContentPane();
		ct.add(new RectanglesTest1());
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}