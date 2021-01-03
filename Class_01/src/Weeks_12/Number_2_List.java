package Weeks_12;

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
	
	String strTitle;
	String strDate;
	int iTotal;
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
	}
	
	public void splitAndSave (int iIndex, String mInput) {
		String[] tmp=mInput.split(",");
		names[iIndex]=tmp[0];
		numbers[iIndex]=tmp[1];
		phones[iIndex]=tmp[2];
	}
	
	public void writeList() {
		System.out.println("=== ���� �Է� ===");
		for(int i=0;i<iTotal;i++) {
			System.out.println((i+1)+"��° �л��� ������ \",\"�� �����Ͽ� �Է��ϼ���.(�̸�,�й�,��ȭ��ȣ)");
			splitAndSave(i, sc.nextLine());
		}
	}
	public void readList() {
		System.out.println("=== �Էµ� ���� ===");
		info();
		System.out.println("�� ��\t�� ��\t\t��ȭ��ȣ");
		for(int i=0;i<iTotal;i++) {
			System.out.println(names[i]+"\t"+numbers[i]+"\t"+phones[i]);
		}
	}
	
	public void info() {
		System.out.println("Title : "+strTitle);
		System.out.println("Date : "+strDate);
	}
}