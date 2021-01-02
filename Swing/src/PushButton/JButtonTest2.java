package PushButton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JButtonTest2 {
	public static void main(String args[]) {
		new JButtonDemo2();
	}
}

class JButtonDemo2 extends JFrame implements ActionListener {
	JTextField jtf;

	JButtonDemo2() {
		jtf = new JTextField(10);
		ImageIcon ��� = new ImageIcon("image/���.jpg");
		ImageIcon �ٳ��� = new ImageIcon("image/�ٳ���.jpg");
		ImageIcon �� = new ImageIcon("image/��.jpg");
		ImageIcon �� = new ImageIcon("image/��.jpg");
		ImageIcon ���� = new ImageIcon("image/����.jpg");

		JButton jb1 =new JButton("���", ���);
		JButton jb2 =new JButton("�ٳ���", �ٳ���);
		JButton jb3 =new JButton("��", ��);
		JButton jb4 =new JButton("��", ��);
		JButton jb5 =new JButton("����", ����);
		
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,2));
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		ct.add(jtf);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		setTitle("JButton Test2");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jtf.setText(e.getActionCommand());
	}
	
	
}
