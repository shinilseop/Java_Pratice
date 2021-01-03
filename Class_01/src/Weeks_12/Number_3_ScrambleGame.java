package Weeks_12;

import java.util.Random;
import java.util.Scanner;

public class Number_3_ScrambleGame {
	public static void main(String args[]) {
		new ScrambleGame().start();
	}
}

class Words {
	String words[] = { "java", "import", "class", "public", "private", "overloading", "method", "inheritance",
			"encapsulation", "polymorphism" };

	public String getWord() {
		Random r = new Random();
		return words[r.nextInt(words.length)];
	}

	public String getWord(int mIndex) {
		return words[mIndex];
	}
}

interface IPuzzleGame {
	void info();
	void setAnswer();
	void start();
	void process();
	void check();
	void end();
}

class ScrambleGame implements IPuzzleGame {
	String word, answer;
	Words words;
	boolean isRun=true;
	
	public void info() {
		System.out.println("=== �������� ===");
		System.out.println("��ȯ�� ���ϴ� ������ �ε����� \",\"�� �����Ͽ� �Է��ϼ���.");
		System.out.println("������ ������ ���߸� ����˴ϴ�.");
	}
	
	public void start() {
		info();
		setAnswer();
		System.out.println("=== ���ӽ��� ===");
		while (isRun) {
			process();
			check();
		}
		end();
	}

	public void setAnswer() {
		Random r = new Random();
		words = new Words();
		word = words.getWord();
		answer = word;
		for (int i = 0; i < word.length(); i++) {
			int idx = r.nextInt(word.length());
			char tmp = word.charAt(i);
			word = word.substring(0, i) + word.charAt(idx) + word.substring(i + 1);
			word = word.substring(0, idx) + tmp + word.substring(idx + 1);
		}
		if (answer.equals(word)) {
			setAnswer();
		}
	}

	public void process() {
		Scanner sc = new Scanner(System.in);
		System.out.println(word);
		String input[] = sc.nextLine().split(",");
		setScramble(Integer.parseInt(input[0]) - 1, Integer.parseInt(input[1]) - 1);
		check();
	}

	public void check() {
		if (answer.equals(word)) {
			isRun = false;
		}
	}

	public void setScramble(int iIndex1, int iIndex2) {
		char tmp = word.charAt(iIndex1);
		word = word.substring(0, iIndex1) + word.charAt(iIndex2) + word.substring(iIndex1 + 1);
		word = word.substring(0, iIndex2) + tmp + word.substring(iIndex2 + 1);
	}

	public void end() {
		System.out.println(word);
		System.out.println("�����մϴ�. �����Դϴ�.");
		System.out.println("������ �����մϴ�.");
	}
}