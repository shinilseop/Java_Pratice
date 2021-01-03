package Weeks_13;

import java.util.Random;
import java.util.Scanner;

public class Number_3_HangedManGame {
	public static void main(String args[]) {
		new HangedManGame().start();
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
	void process(String input);
	void check();
	void end();
}

class HangedManGame extends Words implements IPuzzleGame {
	Scanner sc;
	String word, answer;
	boolean isRun;
	
	public void info() {
		System.out.println("=== Hanged Man Game ===");
		System.out.println("문제 생성 완료");
		System.out.println("기회는 15번 입니다.");
	}
	public void setAnswer() {
		answer=getWord();
	}
	public void start() {
		sc=new Scanner(System.in);
		int cnt=15;
		isRun=true;
		word="";
		setAnswer();
		for(int i=0;i<answer.length();i++) {
			word+="_";
		}
		
		info();
		
		while(isRun) {
			if(cnt==0) {
				System.out.println("기회를 다 사용하였습니다.");
				break;
			}
			for(int i=0;i<word.length();i++	) {
				System.out.print(word.charAt(i)+" ");
			}
			System.out.println("(남은 기회 : "+cnt+"번)");
			String input=sc.nextLine();
			process(input);
			check();
			cnt--;
		}
	}
	
	public void process(String input) {
		String[] tmp=answer.split("");
		for(int i=0;i<tmp.length;i++) {
			if(tmp[i].equals(input)) {
				word=word.substring(0,i)+input+word.substring(i+1);
			}
		}
	}
	
	public void check() {
		if(word.equals(answer)) {
			for(int i=0;i<word.length();i++	) {
				System.out.print(word.charAt(i)+" ");
			}
			System.out.println("정답입니다.");
			end();
		}
	}
	
	public void end() {
		isRun=false;
	}
}