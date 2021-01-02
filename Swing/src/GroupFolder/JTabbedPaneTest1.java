package GroupFolder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest1 {
	public static void main(String args[]) {
		new JTabbedPaneFrame();
	}
}

class RadioPanel extends JPanel implements ActionListener {
	JLabel jl1=new JLabel("당신의 성별은? ");
	JLabel jl2=new JLabel("");
	RadioPanel(){
		JRadioButton jrb1=new JRadioButton("남자");
		JRadioButton jrb2=new JRadioButton("여자");
		add(jl1);
		add(jl2);
		add(jrb1);
		add(jrb2);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s=e.getActionCommand();
		jl2.setText(s);
	}
}

class ComboPanel extends JPanel implements ItemListener {
	JLabel jl1=new JLabel("당신의 혈액형은? ");
	JLabel jl2=new JLabel("");
	ComboPanel(){
		JComboBox jcb=new JComboBox();
		jcb.addItem("A형");
		jcb.addItem("B형");
		jcb.addItem("AB형");
		jcb.addItem("O형");
		add(jl1);
		add(jl2);
		add(jcb);
		jcb.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object s=e.getItem();
		jl2.setText(s.toString());
	}
}

class JTabbedPaneFrame extends JFrame {
	JTabbedPaneFrame(){
		JTabbedPane jtp=new JTabbedPane();
		RadioPanel rp=new RadioPanel();
		ComboPanel cp=new ComboPanel();
		jtp.addTab("성별", rp);
		jtp.addTab("혈액형", cp);
		getContentPane().add(jtp);

		setTitle("JTabbedPaneTest1");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}