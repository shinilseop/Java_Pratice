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
		System.out.println("===== ���� =====");
	}

	public void info() {
		System.out.println("����� ������ �����ڸ� ���� ���� ���� �Է��Ͻÿ�.");
		System.out.println("��) 12 + 4 (����� ���� �� ��)");
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
		System.out.println("���⸦ �����մϴ�.");
	}

	public void error(int errorCode) {
		if (errorCode == 0) {
			System.out.println("���Ŀ� �°� �ٽ� �Է��Ͻÿ�.\n");
		} else if (errorCode == 1) {
			System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�.\n");
		} else if (errorCode == 2) {
			System.out.println("0���δ� ���� �� �����ϴ�.\n");
		}
		wrong = true;
	}
}