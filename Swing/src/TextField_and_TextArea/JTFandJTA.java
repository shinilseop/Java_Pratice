package TextField_and_TextArea;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTFandJTA {
	public static void main(String args[]) {
		new JTFandJTADemo();
	}
}

class JTFandJTADemo extends JFrame implements ActionListener {
	private JTextField jtf;
	private JTextArea jta;

	JTFandJTADemo() {
		jtf = new JTextField(20);
		jta = new JTextArea(7, 20);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jtf);
		ct.add(jta);
		jtf.addActionListener(this);

		setTitle("JTextField, JTextArea Test");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jta.append(e.getActionCommand() + "\n");
		jtf.setText("");
	}
}