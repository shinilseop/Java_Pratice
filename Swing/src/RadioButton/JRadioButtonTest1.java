package RadioButton;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadioButtonTest1 {
	public static void main(String args[]) {
		new JRadioButtonDemo();
	}
}

class JRadioButtonDemo extends JFrame implements ActionListener {
	JTextField jtf;
	JRadioButtonDemo() {
		jtf=new JTextField(10);
		JRadioButton jr1=new JRadioButton("½Â¸¶");
		JRadioButton jr2=new JRadioButton("°ñÇÁ");
		JRadioButton jr3=new JRadioButton("½ºÅ²½ºÄí¹Ù");
		JRadioButton jr4=new JRadioButton("Æä·¯±Û¶óÀÌµù");
		
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		ButtonGroup bg=new ButtonGroup();
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		bg.add(jr4);

		ct.add(jr1);
		ct.add(jr2);
		ct.add(jr3);
		ct.add(jr4);
		ct.add(jtf);

		jr1.addActionListener(this);
		jr2.addActionListener(this);
		jr3.addActionListener(this);
		jr4.addActionListener(this);
		
		setTitle("JRadioButtonTest1");
		setSize(350,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jtf.setText(e.getActionCommand());
	}
}