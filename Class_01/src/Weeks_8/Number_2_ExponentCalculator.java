package Weeks_8;

import java.util.Scanner;

public class Number_2_ExponentCalculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		MyExponent mExp;
		
		System.out.println("=== 지수 계산기 ===");
		
		while(true) {
			System.out.println("메뉴 : 1.지수계산, 2.종료");
			int menu=sc.nextInt();
			if(menu==1) {
				System.out.print("밑을 입력하세요. : ");
				int base=sc.nextInt();
				System.out.print("지수를 입력하세요. : ");
				int exp=sc.nextInt();
				
				mExp=new MyExponent(base, exp);
				System.out.println(mExp.getName()+"\n");
			} else if(menu==2) {
				System.out.println("계산기를 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
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
		return iBase+"의 "+iExp+"승 = "+getValue();
	}
}
