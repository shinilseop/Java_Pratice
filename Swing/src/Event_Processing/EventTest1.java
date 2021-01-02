package Event_Processing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventTest1 {
	public static void main(String args[]) {
		ButtonEventTest bet = new ButtonEventTest();
	}
}

class ButtonEventTest extends JFrame implements ActionListener {
	private JLabel result = new JLabel("");

	public ButtonEventTest() {
		JButton male = new JButton("Male");
		JButton female = new JButton("Female");
		JLabel label = new JLabel("What is your gender?");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(male);
		ct.add(female);
		ct.add(label);
		ct.add(result);
		male.addActionListener(this);
		female.addActionListener(this);
		setTitle("ButtonEvent Test");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		result.setText(ae.getActionCommand());
	}
}
