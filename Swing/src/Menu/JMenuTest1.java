package Menu;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class JMenuTest1 {
	public static void main(String args[]) {
		new JMemuDemo();
	}
}

class JMemuDemo extends JFrame implements ActionListener {
	JTextField jtf;
	JMemuDemo(){
		Container ct=getContentPane();
		ct.setLayout(new BorderLayout());
		JMenuBar jmb=new JMenuBar();
		JMenu menu1=new JMenu("파일");
		JMenu menu2=new JMenu("편집");
		
		jmb.add(menu1);
		jmb.add(menu2);
		
		JMenuItem jmi=new JMenuItem("새파일");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		jmi=new JMenuItem("저장하기");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		jmi=new JMenuItem("열기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		jmi=new JMenuItem("잘라내기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		jmi=new JMenuItem("복사");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		JCheckBoxMenuItem jcbmi=new JCheckBoxMenuItem("눈금자");
		jcbmi.addActionListener(this);
		menu2.add(jcbmi);
		
		JRadioButtonMenuItem jrbmi=new JRadioButtonMenuItem("수정가능상태");
		jrbmi.addActionListener(this);
		menu2.add(jrbmi);
		
		setJMenuBar(jmb);
		jtf=new JTextField();
		ct.add(jtf, BorderLayout.SOUTH);
		
		setTitle("JMenuTest1");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jtf.setText(e.getActionCommand());
	}
	
	
}