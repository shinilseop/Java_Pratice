package Weeks_12;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Number_2_List {
	public static void main(String args[]) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		
		StudentList java01 = new StudentList("자바 실습 01반", format.format(new Date()), 4);
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
		System.out.println("=== 정보 입력 ===");
		for(int i=0;i<iTotal;i++) {
			System.out.println((i+1)+"번째 학생의 정보를 \",\"로 구분하여 입력하세요.(이름,학번,전화번호)");
			splitAndSave(i, sc.nextLine());
		}
	}
	public void readList() {
		System.out.println("=== 입력된 정보 ===");
		info();
		System.out.println("이 름\t학 번\t\t전화번호");
		for(int i=0;i<iTotal;i++) {
			System.out.println(names[i]+"\t"+numbers[i]+"\t"+phones[i]);
		}
	}
	
	public void info() {
		System.out.println("Title : "+strTitle);
		System.out.println("Date : "+strDate);
	}
}