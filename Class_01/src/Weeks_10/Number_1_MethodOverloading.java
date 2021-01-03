package Weeks_10;

public class Number_1_MethodOverloading {
	public static void main(String args[]) {
		Calculator c =new Calculator();
		c.sum("8,14");
		c.sum(8, 14);
		c.sum(8, "14");
		c.sum("8", 14);
		c.sum("8", "14");
	}
}

class Calculator {
	int iNum1, iNum2;

	void sum(String num) {
		String tmp[]=num.split(",");
		int num1=Integer.parseInt(tmp[0]);
		int num2=Integer.parseInt(tmp[1]);
		System.out.println("sum(\""+num+"\") : "+(num1+num2));
	}

	void sum(int num1, int num2) {
		System.out.println("sum("+num1+","+num2+") : "+(num1+num2));
	}

	void sum(int num1, String num2) {
		System.out.println("sum("+num1+",\""+num2+"\") : "+(num1+num2));
	}

	void sum(String num1, int num2) {
		System.out.println("sum(\""+num1+"\","+num2+") : "+(num1+num2));
	}

	void sum(String num1, String num2) {
		System.out.println("sum(\""+num1+"\",\""+num2+"\") : "+(num1+num2));
	}
}