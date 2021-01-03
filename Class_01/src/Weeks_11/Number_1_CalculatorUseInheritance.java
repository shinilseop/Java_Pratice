package Weeks_11;

import java.util.Scanner;

public class Number_1_CalculatorUseInheritance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Calculator c = new Calculator();
		while (true) {
			c.info();
			String input = sc.nextLine();
			c.analisys(input);
			if (c.wrong) {
				continue;
			}
			if (!c.isRun) {
				break;
			}
			if (c.op == '+') {
				c.addition();
			}
			if (c.op == '-') {
				c.subtraction();
			}
			if (c.op == '*') {
				c.multiplication();
			}
			if (c.op == '/') {
				c.division();
			}
		}
	}
}

class Calculator {
	int iNum1, iNum2;
	char op;
	boolean isRun = true;
	boolean wrong = false;

	public Calculator() {
		System.out.println("===== 계산기 =====");
	}

	public void info() {
		System.out.println("계산할 정수와 연산자를 다음 예와 같이 입력하시요.");
		System.out.println("예) 12 + 4 (띄어쓰기로 구분 할 것)");
	}

	public void analisys(String mFormula) {
		String tmp[] = mFormula.split(" ");
		wrong = false;
		if (tmp.length == 3) {
			iNum1 = Integer.parseInt(tmp[0]);
			op = tmp[1].charAt(0);
			iNum2 = Integer.parseInt(tmp[2]);
			if (!(op == '+' || op == '-' || op == '*' || op == '/' || op == 'c')) {
				error(1);
			} else if (op == '/' && iNum2 == 0) {
				error(2);
			}

			if (op == 'c') {
				end();
			}
		} else {
			error(0);
		}

	}

	public void addition() {
		System.out.println(iNum1 + " " + op + " " + iNum2 + " = " + (iNum1 + iNum2));
	}

	public void subtraction() {
		System.out.println(iNum1 + " " + op + " " + iNum2 + " = " + (iNum1 - iNum2));
	}

	public void multiplication() {
		System.out.println(iNum1 + " " + op + " " + iNum2 + " = " + (iNum1 * iNum2));
	}

	public void division() {
		System.out.println(iNum1 + " " + op + " " + iNum2 + " = " + (iNum1 / iNum2));
	}

	public void end() {
		isRun = false;
		System.out.println("계산기를 종료합니다.");
	}

	public void error(int errorCode) {
		if (errorCode == 0) {
			System.out.println("형식에 맞게 다시 입력하시오.\n");
		} else if (errorCode == 1) {
			System.out.println("연산자를 잘못 입력하였습니다.\n");
		} else if (errorCode == 2) {
			System.out.println("0으로는 나눌 수 없습니다.\n");
		}
		wrong = true;
	}
}