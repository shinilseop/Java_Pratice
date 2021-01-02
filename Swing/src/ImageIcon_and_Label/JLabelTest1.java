package ImageIcon_and_Label;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest1 {
	public static void main(String args[]) {
		new JLabelDemo();
	}
}

class JLabelDemo extends JFrame implements ActionListener {
	private JLabel result = new JLabel("");

	JLabelDemo() {
		ImageIcon ii = new ImageIcon("image/korea.gif");
		JButton korea = new JButton("Please Click.", ii);
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(korea);
		ct.add(result);
		
		korea.addActionListener(this);
		
		setTitle("JLabel Test");
		setSize(600, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		result.setText("It is the best Korea in the world.");
	}
}
