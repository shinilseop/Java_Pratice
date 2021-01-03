package Table;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class JTableTest1 {
	public static void main(String args[]) {
		new JTableDemo();
	}
}

class JTableDemo extends JFrame {
	JTableDemo() {
		Container ct=getContentPane();
		ct.setLayout(new BorderLayout());
		String[] colHeads= {"�а�", "�й�", "�̸�"};
		Object[][] data= {
				{"IT�����������", "201095029", "������"},
				{"��ǻ�������������", "201195007", "��뿬"},
				{"���ͳ������������", "201195072", "������"},
				{"��Ƽ�̵���������", "201096041", "���â"},
				{"�����������", "201198001", "�̸���"},
				{"������Ű�������", "201198074", "�����"},
				{"���ͳ������������", "201195012", "���ڿ�"},
				{"��Ƽ�̵���������", "201196025", "������"},
				{"�����������", "201198016", "������"},
				{"����Ÿ���̽���������", "201197011", "������"},
				{"�����������", "201198009", "������"},
				{"����Ÿ���̽���������", "201197008", "�����"},
				{"��Ƽ�̵���������", "201196033", "������"}
		};
		
		JTable table=new JTable(data, colHeads);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(table, v, h);
		ct.add(jsp, BorderLayout.CENTER);
		
		setTitle("JTableTest1");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}