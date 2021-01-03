package Weeks_11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Number_2_StudentList {
	public static void main(String args[]) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		StudentList java01=new StudentList("�ڹ� �ǽ� 01��", 4, format.format(new Date()));
		java01.writeList();
		java01.readList();
	}
}

class MyList {
	Scanner sc = new Scanner(System.in);
	String strTitle;
	String strDate;
	String[] strNames;
	int iCount;
	
	public MyList(String mTitle, int mCount, String mDate) {
		this.strTitle=mTitle;
		this.iCount=mCount;
		this.strDate=mDate;
	}
	public void writeList() {
		System.out.println("=== ���� �Է� ===");
	}
	public void readList() {
		System.out.println("=== �Էµ� ���� ===");
	}
	public void listInfo() {
		System.out.println("Title : "+strTitle);
		System.out.println("Date : "+strDate);
	}
}

class StudentList extends MyList {
	String[] strStudentNumbers;
	String[] strPhoneNumbers;
	
	public StudentList(String mTitle, int mCount, String mDate) {
		super(mTitle, mCount, mDate);
		// TODO Auto-generated constructor stub
		strStudentNumbers=new String[mCount];
		strPhoneNumbers=new String[mCount];
		strNames=new String[mCount];
	}
	
	public void splitAndSave (int iIndex, String mInput) {
		String[] tmp=mInput.split(",");
		strNames[iIndex]=tmp[0];
		strStudentNumbers[iIndex]=tmp[1];
		strPhoneNumbers[iIndex]=tmp[2];
	}
	
	public void writeList() {
		System.out.println("=== ���� �Է� ===");
		for(int i=0;i<iCount;i++) {
			System.out.println((i+1)+"��° �л��� ������ \",\"�� �����Ͽ� �Է��ϼ���.(�̸�,�й�,��ȭ��ȣ)");
			splitAndSave(i, sc.nextLine());
		}
	}
	public void readList() {
		System.out.println("=== �Էµ� ���� ===");
		listInfo();
		System.out.println("�� ��\t�� ��\t\t��ȭ��ȣ");
		for(int i=0;i<iCount;i++) {
			System.out.println(strNames[i]+"\t"+strStudentNumbers[i]+"\t"+strPhoneNumbers[i]);
		}
	}
}