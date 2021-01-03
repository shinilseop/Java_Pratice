package Weeks_13;

import java.util.Scanner;

public class Number_2_NumberChanger {
	public static void main(String args[]) {
		new AdditionProgram().programStart();
	}
}

class AdditionProgram {
	Calculator cal;
	Scanner sc;
	String input[];
	boolean isRun;

	void printInfo() {
		System.out.println("이진수 계산 예시 >> bin 1101 1111");
		System.out.println("팔진수 계산 예시 >> oct 721 12");
		System.out.println("십진수 계산 예시 >> dec 921 19");
		System.out.println("십육진수 계산 예시 >> hex 928 ae1");
		System.out.println("종료 예시 >> exit");
	}

	void programStart() {
		isRun = true;
		sc = new Scanner(System.in);
		System.out.println("=== 덧셈 계산기 ===");
		printInfo();
		while (isRun) {
			System.out.print(">> ");
			input = sc.nextLine().split(" ");

			if (input[0].equals("exit")) {
				programEnd();
				break;
			}

			procedures();
		}
		System.out.println("=== 계산기 종료 ===");
	}

	void procedures() {
		if(input[0].equals("bin")) {
			cal=new BinaryCal();
		} else if(input[0].equals("oct")) {
			cal=new OctalCal();
		} else if(input[0].equals("dec")) {
			cal=new Calculator();
		} else if(input[0].equals("hex")) {
			cal=new HexadecimalCal();
		}
		cal.transNumbers(input[1], input[2]);
		cal.addNumbers();
		cal.printResult();
	}

	void programEnd() {
		System.out.println("프로그램을 종료합니다.");
		isRun = false;
	}
}

class Calculator {
	int iNum1, iNum2, iResult;

	void transNumbers(String mNum1, String mNum2) {
		iNum1=Integer.parseInt(mNum1);
		iNum2=Integer.parseInt(mNum2);
	}

	void addNumbers() {
		iResult = iNum1 + iNum2;
	}

	void printResult() {
		System.out.println("덧셈 결과 >> "+iResult);
	}
}

class BinaryCal extends Calculator {
	void transNumbers(String mNum1, String mNum2) {
		iNum1=Integer.valueOf(mNum1, 2);
		iNum2=Integer.valueOf(mNum2, 2);
	}

	void printResult() {
		System.out.println("덧셈 결과 >> " + Integer.toBinaryString(iResult));
	}
}

class OctalCal extends Calculator {
	void transNumbers(String mNum1, String mNum2) {
		iNum1=Integer.valueOf(mNum1, 8);
		iNum2=Integer.valueOf(mNum2, 8);
	}

	void printResult() {
		System.out.println("덧셈 결과 >> " + Integer.toOctalString(iResult));
	}
}

class HexadecimalCal extends Calculator {
	void transNumbers(String mNum1, String mNum2) {
		iNum1=Integer.valueOf(mNum1, 16);
		iNum2=Integer.valueOf(mNum2, 16);
	}

	void printResult() {
		System.out.println("덧셈 결과 >> " + Integer.toHexString(iResult));
	}
}