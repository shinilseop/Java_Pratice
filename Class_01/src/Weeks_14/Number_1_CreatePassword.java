package Weeks_14;

import java.io.FileWriter;
import java.util.Scanner;

public class Number_1_CreatePassword {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		CheckPasswd cp = new CheckPasswd();
		boolean isRun = true;

		System.out.println("===비밀번호 생성===");
		while (isRun) {
			System.out.println("비밀번호를 입력해 주세요. (8글자 이상, 대문자/소문자/숫자 포함)");
			String passwd = sc.nextLine();
			if (cp.check(passwd)) {
				System.out.println("확인 비밀번호를 입력해주세요.");
				while (isRun) {
					String re = sc.nextLine();
					if (cp.recheck(re)) {
						FileWriter fw = new FileWriter("passwd.txt");
						char[] chPasswd=passwd.toCharArray();
						fw.write(passwd);
						fw.close();
						System.out.println("비밀번호가 생성되었습니다.");
						isRun = false;
						break;
					}
					System.out.println("확인 비밀번호를 다시 입력해주세요.");
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
			System.out.println("8자리 이상이 아닙니다.");
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
				System.out.println("대문자가 포함되어 있지 않습니다.");
			} else if (!lower) {
				System.out.println("소문자가 포함되어 있지 않습니다.");
			} else if (!number) {
				System.out.println("숫자가 포함되어 있지 않습니다.");
			}
			isAllChar = false;
		}
	}

	void isSame(String passwd2) {
		if (passwd.equals(passwd2)) {
			isSame = true;
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			isSame = false;
		}
	}
}