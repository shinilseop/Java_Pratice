package Weeks_10;

public class Number_2_SimpleCafe {
	public static void main(String args[]) {
		Cafe myCafe=new Cafe("HOLLYS");
		myCafe.cafeInfo();
		myCafe.showMenu();
		
		myCafe.makeCoffee();
		myCafe.makeCoffee(true);
		myCafe.makeLatte("두유");
		myCafe.makeLatte("우유", true);
		
	}
}

class Cafe {
	String strName;
	Coffee coffee;

	Cafe(String strName) {
		this.strName = strName;
	}

	void cafeInfo() {
		System.out.println(strName+" 카페입니다.\n");
	}

	void showMenu() {
		System.out.println("======= 메 뉴 =======");
		System.out.println("1. 아메리카노(Hot/Ice)");
		System.out.println("2. 카페라떼(Hot/Ice)");
		System.out.println("===================\n");
	}

	void makeCoffee() {
		coffee=new Coffee();
	}

	void makeCoffee(boolean isIce) {
		coffee=new Coffee(isIce);
	}

	void makeLatte(String strMilk) {
		coffee=new Coffee(strMilk);
	}

	void makeLatte(String strMilk, boolean isIce) {
		coffee=new Coffee(isIce, strMilk);
	}
}

class Coffee {
	boolean isIce;
	String strMilk;

	Coffee() {
		System.out.println("아메리카노 (Hot)입니다.");
	}

	Coffee(boolean isIce) {
		System.out.println("아메리카노 (Ice)입니다.");
	}
	
	Coffee(String strMilk) {
		System.out.println(strMilk+"를 넣은 카페라떼(Hot)입니다.");
	}

	Coffee(boolean isIce, String strMilk) {
		System.out.println(strMilk+"를 넣은 카페라떼(Ice)입니다.");
	}
}