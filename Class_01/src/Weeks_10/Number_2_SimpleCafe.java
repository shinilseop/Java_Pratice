package Weeks_10;

public class Number_2_SimpleCafe {
	public static void main(String args[]) {
		Cafe myCafe=new Cafe("HOLLYS");
		myCafe.cafeInfo();
		myCafe.showMenu();
		
		myCafe.makeCoffee();
		myCafe.makeCoffee(true);
		myCafe.makeLatte("����");
		myCafe.makeLatte("����", true);
		
	}
}

class Cafe {
	String strName;
	Coffee coffee;

	Cafe(String strName) {
		this.strName = strName;
	}

	void cafeInfo() {
		System.out.println(strName+" ī���Դϴ�.\n");
	}

	void showMenu() {
		System.out.println("======= �� �� =======");
		System.out.println("1. �Ƹ޸�ī��(Hot/Ice)");
		System.out.println("2. ī���(Hot/Ice)");
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
		System.out.println("�Ƹ޸�ī�� (Hot)�Դϴ�.");
	}

	Coffee(boolean isIce) {
		System.out.println("�Ƹ޸�ī�� (Ice)�Դϴ�.");
	}
	
	Coffee(String strMilk) {
		System.out.println(strMilk+"�� ���� ī���(Hot)�Դϴ�.");
	}

	Coffee(boolean isIce, String strMilk) {
		System.out.println(strMilk+"�� ���� ī���(Ice)�Դϴ�.");
	}
}