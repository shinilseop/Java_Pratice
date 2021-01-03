package Weeks_10;

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

class ScrambleGame {
	String word, answer;
	Words words;

	void start() {
		Scanner sc = new Scanner(System.in);
		words = new Words();
		setScramble();
		while (checkWord()) {
			System.out.println("문제 : " + word);
			String input[]=sc.nextLine().split(",");
			setScramble(Integer.parseInt(input[0])-1, Integer.parseInt(input[1])-1);
		}
		end();
	}

	void setScramble() {
		word = words.getWord();
		answer = word;
		Random r = new Random();
		for (int i = 0; i < word.length(); i++) {
			int idx = r.nextInt(word.length());
			char tmp = word.charAt(i);
			word = word.substring(0, i) + word.charAt(idx) + word.substring(i + 1);
			word = word.substring(0, idx) + tmp + word.substring(idx + 1);
		}
		if (answer == word) {
			setScramble();
		}
	}

	void setScramble(int iIndex1, int iIndex2) {
		char tmp = word.charAt(iIndex1);
		word = word.substring(0, iIndex1) + word.charAt(iIndex2) + word.substring(iIndex1 + 1);
		word = word.substring(0, iIndex2) + tmp + word.substring(iIndex2 + 1);
	}

	boolean checkWord() {
		if (answer.equals(word)) {
			return false;
		}
		return true;
	}

	void end() {
		System.out.println("문제 : " + word);
		System.out.println("축하합니다. 정답입니다.");
		System.out.println("게임을 종료합니다.");
	}
}