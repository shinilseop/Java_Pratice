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
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1.피자 만들기, 2.피자 먹기, 3.남은 피자 확인, 4.종료");
			int menu=sc.nextInt();
			if(menu==1) {
				cooker.makePizza();
			} else if(menu==2) {
				System.out.println("몇 조각을 먹을까요 ?");
				int piece=sc.nextInt();
				customer.eatPizza(piece);
			} else if(menu==3) {
				storekeeper.checkPizza();
			} else if(menu==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
	}
}

class PizzaHouse {
	static int pizza=8;
	void makePizza() {
		pizza+=8;
		System.out.println("피자 한 판이 만들어졌습니다.");
	}
	void eatPizza(int mPiece) {
		if(pizza>mPiece) {
			pizza-=mPiece;
			System.out.println("피자 "+mPiece+"조각을 먹었습니다.");
		} else if(pizza==mPiece) {
			pizza-=mPiece;
			System.out.println("피자를 다 먹었습니다.");
		} else {
			System.out.println("피자가 모자랍니다.");
		}
	}
	void checkPizza() {
		System.out.println("남은 피자 조각 개수 : "+pizza);
	}
}
