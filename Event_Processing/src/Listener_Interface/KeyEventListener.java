package Listener_Interface;

import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyEventListener {
	public static void main(String args[]) {
		new KeyEventFrame();
	}
}

class KeyEventPanel extends JPanel implements KeyListener {
	private int x = 100;
	private int y = 100;
	private char keyChar = 'A';
	public KeyEventPanel () {
		addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		keyChar=e.getKeyChar();
		repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
		g.drawString(String.valueOf(keyChar), x, y);
	}
}

class KeyEventFrame extends JFrame {
	public KeyEventFrame() {
		Container ct = getContentPane();
		KeyEventPanel kep = new KeyEventPanel();
		kep.setFocusable(true);
		ct.add(kep);
		setTitle("KeyEvent Test");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}