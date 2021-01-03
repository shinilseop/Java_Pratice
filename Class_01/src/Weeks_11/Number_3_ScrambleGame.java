package Weeks_11;

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

class PuzzleGame {
	String word, answer;
	Words words;
	boolean isRun;

	PuzzleGame() {
		isRun = true;
	}

	void info() {
		System.out.println("=== �������� ===");
	}

	void setAnswer() {
		System.out.println("(����������)");
	}

	void start() {
		info();
		setAnswer();
		System.out.println("=== ���ӽ��� ===");
		while (isRun) {
			process();
			check();
		}
		end();
	}

	void process() {
		System.out.println("(������)");
	}

	void check() {
		System.out.println("(����Ȯ����)");
	}

	void end() {
		System.out.println("�����մϴ�. �����Դϴ�. ("+word+")");
		System.out.println("=== �������� ===");
	}
}

class ScrambleGame extends PuzzleGame {
	void info() {
		System.out.println("=== �������� ===");
		System.out.println("��ȯ�� ���ϴ� ������ �ε����� \",\"�� �����Ͽ� �Է��ϼ���.");
		System.out.println("������ ������ ���߸� ����˴ϴ�.");
	}

	void setAnswer() {
		Random r=new Random();
		words=new Words();
		word=words.getWord();
		answer=word;
		for (int i = 0; i < word.length(); i++) {
			int idx = r.nextInt(word.length());
			char tmp = word.charAt(i);
			word = word.substring(0, i) + word.charAt(idx) + word.substring(i + 1);
			word = word.substring(0, idx) + tmp + word.substring(idx + 1);
		}
		if (answer == word) {
			setAnswer();
		}
	}
	
	void process() {
		Scanner sc=new Scanner(System.in);
		System.out.println(word);
		String input[]=sc.nextLine().split(",");
		setScramble(Integer.parseInt(input[0])-1, Integer.parseInt(input[1])-1);
		check();
	}

	void check() {
		if (answer.equals(word)) {
			isRun=false;
		}
	}

	void setScramble(int iIndex1, int iIndex2) {
		char tmp = word.charAt(iIndex1);
		word = word.substring(0, iIndex1) + word.charAt(iIndex2) + word.substring(iIndex1 + 1);
		word = word.substring(0, iIndex2) + tmp + word.substring(iIndex2 + 1);
	}

	void end() {
		System.out.println(word);
		System.out.println("�����մϴ�. �����Դϴ�.");
		System.out.println("������ �����մϴ�.");
	}
}