package Weeks_7;

import java.util.Scanner;

public class Number_1_Calculator {
	public static void main(String args[]) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 간단한 계산기 ===");
		while (true) {
			System.out.println("계산할 수식 입력(ex: 3 + 3) : ");
			String form[] = sc.nextLine().split(" ");
			int num1 = Integer.parseInt(form[0]);
			String oper = form[1];
			int num2 = Integer.parseInt(form[2]);
			
			if(oper.equals("+")) {
				c.plus(num1, num2);
			} else if(oper.equals("-")) {
				c.minus(num1, num2);
			} else if(oper.equals("*")) {
				c.multiply(num1, num2);
			} else if(oper.equals("/")) {
				if(num2==0) {
					System.out.println("0으로는 나눌 수 없습니다.");
					continue;
				}
				c.division(num1,num2);
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}
}

class Calculator {
	public void plus(int num1, int num2) {
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}

	public void minus(int num1, int num2) {
		System.out.println(num1+" - "+num2+" = "+(num1 - num2));
	}

	public void multiply(int num1, int num2) {
		System.out.println(num1+" * "+num2+" = "+(num1 * num2));
	}

	public void division(int num1, int num2) {
		System.out.println(num1+" / "+num2+" = "+(num1 / num2));
	}
}