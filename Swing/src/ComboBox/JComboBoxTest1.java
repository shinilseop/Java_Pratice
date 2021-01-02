package ComboBox;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxTest1 {
	public static void main(String args[]) {
		new JComboBoxDemo();
	}
}

class JComboBoxDemo extends JFrame implements ItemListener {
	JLabel jl;
	JComboBoxDemo() {
		jl=new JLabel(new ImageIcon("image/감.jpg"));
		JComboBox jc=new JComboBox();
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jl);

		jc.addItem("감");
		jc.addItem("바나나");
		jc.addItem("배");
		jc.addItem("사과");
		jc.addItem("앵두");
		jc.addItem("포도");
		jc.addItemListener(this);

		ct.add(jc);
		
		setTitle("JComboBox Test1");
		setSize(350, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String fruit=(String)e.getItem();
		jl.setIcon(new ImageIcon("image/"+fruit+".jpg"));
	}
}