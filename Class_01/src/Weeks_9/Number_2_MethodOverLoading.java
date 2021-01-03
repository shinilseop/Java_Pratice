package Weeks_9;

import java.util.Scanner;

public class Number_2_MethodOverLoading {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�л� ���� �Է� �� �ּ���. : ");
		int stuCnt=sc.nextInt();
		sc.nextLine();
		Student[] stu=new Student[stuCnt];
		int idx=0;
		while(stuCnt-->0) {
			stu[idx]=new Student();
			System.out.println((idx+1)+"��° �л��� ������ �Է��ϼ���. (,�� ����)");
			String info[]=sc.nextLine().split(",");
			if(info.length==1) {
				stu[idx++].setInfo(info[0]);
			} else if(info.length==2) {
				stu[idx++].setInfo(info[0], info[1]);
			} else if(info.length==3) {
				stu[idx++].setInfo(info[0], info[1], info[2]);
			}
		}
		
		System.out.println("=== �Էµ� �л����� ���� ===");
		System.out.println("�� ��\t�� ��\t\t��ȭ��ȣ");
		for(int i=0;i<stu.length;i++) {
			stu[i].describe();
		}
	}
}

class Student {
	String name, studentNum, phoneNum;
	
	void setInfo(String name) {
		this.name=name;
		this.studentNum="";
		this.phoneNum="";
	}
	void setInfo(String name, String studentNum) {
		this.name=name;
		this.studentNum=studentNum;
		this.phoneNum="";
	}
	void setInfo(String name, String studentNum, String phoneNum) {
		this.name=name;
		this.studentNum=studentNum;
		this.phoneNum=phoneNum;
	}
	
	void describe() {
		System.out.println(name+"\t"+studentNum+"\t"+phoneNum);
	}
}