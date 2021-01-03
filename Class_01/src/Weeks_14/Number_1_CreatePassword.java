package Weeks_14;

import java.io.FileWriter;
import java.util.Scanner;

public class Number_1_CreatePassword {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		CheckPasswd cp = new CheckPasswd();
		boolean isRun = true;

		System.out.println("===��й�ȣ ����===");
		while (isRun) {
			System.out.println("��й�ȣ�� �Է��� �ּ���. (8���� �̻�, �빮��/�ҹ���/���� ����)");
			String passwd = sc.nextLine();
			if (cp.check(passwd)) {
				System.out.println("Ȯ�� ��й�ȣ�� �Է����ּ���.");
				while (isRun) {
					String re = sc.nextLine();
					if (cp.recheck(re)) {
						FileWriter fw = new FileWriter("passwd.txt");
						char[] chPasswd=passwd.toCharArray();
						fw.write(passwd);
						fw.close();
						System.out.println("��й�ȣ�� �����Ǿ����ϴ�.");
						isRun = false;
						break;
					}
					System.out.println("Ȯ�� ��й�ȣ�� �ٽ� �Է����ּ���.");
				}
			}
		}
	}
}

class CheckPasswd {
	boolean isEight, isAllChar, isSame;
	String passwd;

	boolean check(String passwd) {
		this.passwd = passwd;
		isEight();
		if (isEight) {
			isAllChar();
			if (isAllChar) {
				return true;
			}
		}
		return false;
	}

	boolean recheck(String passwd2) {
		isSame(passwd2);
		if (isSame) {
			return true;
		}
		return false;
	}

	void isEight() {
		if (passwd.length() >= 8) {
			isEight = true;
		} else {
			System.out.println("8�ڸ� �̻��� �ƴմϴ�.");
			isEight = false;
		}
	}

	void isAllChar() {
		boolean upper = false, lower = false, number = false;
		for (int i = 0; i < passwd.length(); i++) {
			if (!upper) {
				if (65 <= passwd.charAt(i) && passwd.charAt(i) <= 90) {
					upper = true;
					continue;
				}
			}
			if (!lower) {
				if (97 <= passwd.charAt(i) && passwd.charAt(i) <= 122) {
					lower = true;
					continue;
				}
			}
			if (!number) {
				if (48 <= passwd.charAt(i) && passwd.charAt(i) <= 57) {
					number = true;
					continue;
				}
			}
		}
		if (upper && lower && number) {
			isAllChar = true;
		} else {
			if (!upper) {
				System.out.println("�빮�ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
			} else if (!lower) {
				System.out.println("�ҹ��ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
			} else if (!number) {
				System.out.println("���ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
			}
			isAllChar = false;
		}
	}

	void isSame(String passwd2) {
		if (passwd.equals(passwd2)) {
			isSame = true;
		} else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			isSame = false;
		}
	}
}