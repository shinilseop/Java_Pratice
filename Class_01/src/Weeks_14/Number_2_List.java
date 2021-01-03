package Weeks_14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Number_2_List {
	public static void main(String args[]) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		
		StudentList java01 = new StudentList("�ڹ� �ǽ� 01��", format.format(new Date()), 4);
		java01.writeList();
		java01.readList();
	}
}

interface IList {
	void info();
	void writeList();
	void readList();
}

class StudentList implements IList {
	Scanner sc = new Scanner(System.in);
	FileWriter fw;
	
	String strTitle;
	String strDate;
	int iTotal;
	String head;
	String[] names;
	String[] numbers;
	String[] phones;
	
	public StudentList(String mTitle, String mDate, int mTotal) {
		this.strTitle=mTitle;
		this.strDate=mDate;
		this.iTotal=mTotal;
		this.names=new String[iTotal];
		this.numbers=new String[iTotal];
		this.phones=new String[iTotal];
		head="�� ��\t\t�� ��\t\t\t��ȭ��ȣ";
		
		try {
			fw = new FileWriter("StudentList.txt");
			fw.write(strTitle+"\n");
			fw.write(strDate+"\n\n");
			fw.write(head+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void splitAndSave (int iIndex, String mInput) {
		String[] tmp=mInput.split(",");
		names[iIndex]=tmp[0];
		numbers[iIndex]=tmp[1];
		phones[iIndex]=tmp[2];
		try {
			fw.write(names[iIndex]+"\t\t"+numbers[iIndex]+"\t\t"+phones[iIndex]+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeList() {
		System.out.println("=== ���� �Է� ===");
		for(int i=0;i<iTotal;i++) {
			System.out.println((i+1)+"��° �л��� ������ \",\"�� �����Ͽ� �Է��ϼ���.(�̸�,�й�,��ȭ��ȣ)");
			splitAndSave(i, sc.nextLine());
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void readList() {
		try {
			FileReader fr=new FileReader("StudentList.txt");
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void info() {
		System.out.println("Title : "+strTitle);
		System.out.println("Date : "+strDate);
	}
}
