package Weeks_8;

import java.util.Scanner;

public class Number_2_ExponentCalculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		MyExponent mExp;
		
		System.out.println("=== ���� ���� ===");
		
		while(true) {
			System.out.println("�޴� : 1.�������, 2.����");
			int menu=sc.nextInt();
			if(menu==1) {
				System.out.print("���� �Է��ϼ���. : ");
				int base=sc.nextInt();
				System.out.print("������ �Է��ϼ���. : ");
				int exp=sc.nextInt();
				
				mExp=new MyExponent(base, exp);
				System.out.println(mExp.getName()+"\n");
			} else if(menu==2) {
				System.out.println("���⸦ �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}
	}
}

class MyExponent {
	int iBase, iExp, iRes;
	MyExponent(int iBase, int iExp){
		this.iBase=iBase;
		this.iExp=iExp;
	}
	
	int getValue() {
		iRes=1;
		for(int i=0;i<iExp;i++	) {
			iRes*=iBase;
		}
		return iRes;
	}
	
	String getName() {
		return iBase+"�� "+iExp+"�� = "+getValue();
	}
}
