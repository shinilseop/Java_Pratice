package Weeks_8;

import java.util.Scanner;

public class Number_3_ApplicateStaticValue {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		PizzaHouse storekeeper,cooker,customer;
		storekeeper=new PizzaHouse();
		cooker=new PizzaHouse();
		customer=new PizzaHouse();
		
		while(true) {
			System.out.println("�޴��� ������ �ּ���.");
			System.out.println("1.���� �����, 2.���� �Ա�, 3.���� ���� Ȯ��, 4.����");
			int menu=sc.nextInt();
			if(menu==1) {
				cooker.makePizza();
			} else if(menu==2) {
				System.out.println("�� ������ ������� ?");
				int piece=sc.nextInt();
				customer.eatPizza(piece);
			} else if(menu==3) {
				storekeeper.checkPizza();
			} else if(menu==4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}
	}
}

class PizzaHouse {
	static int pizza=8;
	void makePizza() {
		pizza+=8;
		System.out.println("���� �� ���� ����������ϴ�.");
	}
	void eatPizza(int mPiece) {
		if(pizza>mPiece) {
			pizza-=mPiece;
			System.out.println("���� "+mPiece+"������ �Ծ����ϴ�.");
		} else if(pizza==mPiece) {
			pizza-=mPiece;
			System.out.println("���ڸ� �� �Ծ����ϴ�.");
		} else {
			System.out.println("���ڰ� ���ڶ��ϴ�.");
		}
	}
	void checkPizza() {
		System.out.println("���� ���� ���� ���� : "+pizza);
	}
}
