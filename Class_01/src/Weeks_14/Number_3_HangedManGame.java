package Weeks_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Number_3_HangedManGame {
	public static void main(String args[]) {
		new HangedManGame().start();
	}
}

class Words {
	String words[] = new String[10];

	Words(){
		int idx=0;
		try {
			String tmp="";
			FileReader fr=new FileReader("words.txt");
			BufferedReader br=new BufferedReader(fr);
			String line="";
			while((line=br.readLine())!=null) {
				words[idx++]=line;
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
	int cnt;
	
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
		cnt=15;
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
				try {
					FileWriter fw=new FileWriter("rank.txt", true);
					fw.write("F\n");
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
			try {
				FileWriter fw=new FileWriter("rank.txt", true);
				fw.write("S("+(15-cnt)+")\n");
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			end();
		}
	}
	
	public void end() {
		isRun=false;
	}
}