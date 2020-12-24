package Use_Color;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTest {
	public static void main(String args[]) {
		new ColorFrame();
	}
}

class ColorPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawString("객체지향 프로그래밍 JAVA", 50, 50);
		g.setColor(Color.blue);
		g.drawString("배우기 쉬운 자바 프로그래밍", 50, 80);
		Color c1=new Color(100,255,100);
		Color c2=new Color(255,100,255);
		g.setColor(c1);
		g.fillRect(50, 100, 60, 50);
		g.setColor(c2);
		g.fillOval(130, 100, 90, 30);
		g.setColor(Color.cyan);
		g.drawRoundRect(50, 190, 200, 50, 15, 15);
	}
}

class ColorFrame extends JFrame	{
	ColorFrame(){
		setTitle("Color Test");
		Container ct = getContentPane();
		add(new ColorPanel());
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}