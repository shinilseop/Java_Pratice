package Weeks_11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Number_2_StudentList {
	public static void main(String args[]) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		StudentList java01=new StudentList("자바 실습 01반", 4, format.format(new Date()));
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
		System.out.println("=== 정보 입력 ===");
	}
	public void readList() {
		System.out.println("=== 입력된 정보 ===");
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
		System.out.println("=== 정보 입력 ===");
		for(int i=0;i<iCount;i++) {
			System.out.println((i+1)+"번째 학생의 정보를 \",\"로 구분하여 입력하세요.(이름,학번,전화번호)");
			splitAndSave(i, sc.nextLine());
		}
	}
	public void readList() {
		System.out.println("=== 입력된 정보 ===");
		listInfo();
		System.out.println("이 름\t학 번\t\t전화번호");
		for(int i=0;i<iCount;i++) {
			System.out.println(strNames[i]+"\t"+strStudentNumbers[i]+"\t"+strPhoneNumbers[i]);
		}
	}
}