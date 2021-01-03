package Weeks_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_3_BaseConversion {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		BaseConversion bc=new BaseConversion();
		
		System.out.println("=== ���� ��ȯ�� ===");
		System.out.print("\n10���� �Է� (�Է� ���� : 50 ~ 200) : ");
		int num=sc.nextInt();
		bc.toBinary(num);
		bc.binaryToString();
		bc.binaryToOcta();
		bc.octaToString();
	}
}

class BaseConversion {
	ArrayList<String> num;
	int first;
	
	
	void toBinary(int mNum) {
		first=mNum;
		num=new ArrayList<>();
		while(true) {
			if(mNum>3) {
				num.add(String.valueOf(mNum%2));
				mNum/=2;
			} else {
				if(mNum==2) {
					num.add("0");
					num.add("1");
				} else if(mNum==3){
					num.add("1");
					num.add("1");
				}
				break;
			}
		}
	}

	void binaryToOcta() {
		int mNum=first;
		num=new ArrayList<>();
		while(true) {
			if(mNum> 15) {
				num.add(String.valueOf(mNum%8));
				mNum/=8;
			} else {
				if(mNum>=8) {
					num.add(String.valueOf(mNum%8));
					num.add("1");
				} else if(8>mNum){
					num.add(String.valueOf(mNum));
				}
				break;
			}
		}
	}

	void binaryToString() {
		System.out.print(first+"�� 2���� ǥ�� : ");
		for(int i=num.size()-1;i>=0;i--) {
			System.out.print(num.get(i));
		}
		System.out.println();
	}

	void octaToString() {
		System.out.print(first+"�� 8���� ǥ�� : ");
		for(int i=num.size()-1;i>=0;i--) {
			System.out.print(num.get(i));
		}
		System.out.println();
	}
}
