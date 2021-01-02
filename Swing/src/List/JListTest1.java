package List;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListTest1 {
	public static void main(String args[]) {
		new JListDemo();
	}
}

class JListDemo extends JFrame implements ListSelectionListener {
	private String[] fruitlist= {"감","바나나","사과","포도","앵두","배"};
	private JList jlst=new JList(fruitlist);
	private ImageIcon[] fruiticons= {
			new ImageIcon("image/감.jpg"),
			new ImageIcon("image/바나나.jpg"),
			new ImageIcon("image/사과.jpg"),
			new ImageIcon("image/포도.jpg"),
			new ImageIcon("image/앵두.jpg"),
			new ImageIcon("image/배.jpg")
	};
	private JLabel[] jlicon=new JLabel[6];
	JListDemo() {
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,2,5,5));
		for(int i=0;i<6;i++) {
			p.add(jlicon[i]=new JLabel());
		}
		
		Container ct=getContentPane();
		ct.add(jlst, BorderLayout.WEST);
		ct.add(p, BorderLayout.CENTER);
		jlst.addListSelectionListener(this);
		
		setTitle("JList Test1");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		for(int i=1;i<6;i++) {
			jlicon[i].setIcon(null);
		}
		int[] indices=jlst.getSelectedIndices();
		for(int j=0;j<indices.length;j++) {
			jlicon[j].setIcon(fruiticons[indices[j]]);
		}
	}
}