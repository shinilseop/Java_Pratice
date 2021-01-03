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
		System.out.println("=== 게임정보 ===");
	}

	void setAnswer() {
		System.out.println("(문제내는중)");
	}

	void start() {
		info();
		setAnswer();
		System.out.println("=== 게임시작 ===");
		while (isRun) {
			process();
			check();
		}
		end();
	}

	void process() {
		System.out.println("(게임중)");
	}

	void check() {
		System.out.println("(정답확인중)");
	}

	void end() {
		System.out.println("축하합니다. 정답입니다. ("+word+")");
		System.out.println("=== 게임종료 ===");
	}
}

class ScrambleGame extends PuzzleGame {
	void info() {
		System.out.println("=== 게임정보 ===");
		System.out.println("교환을 원하는 글자의 인덱스를 \",\"로 구분하여 입력하세요.");
		System.out.println("게임은 정답을 맞추면 종료됩니다.");
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
		System.out.println("축하합니다. 정답입니다.");
		System.out.println("게임을 종료합니다.");
	}
}