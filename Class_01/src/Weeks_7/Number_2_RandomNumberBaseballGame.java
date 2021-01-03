package Weeks_7;

import java.util.Random;
import java.util.Scanner;

public class Number_2_RandomNumberBaseballGame {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		BaseballGame bg=new BaseballGame();
		
		int tryCnt=1;
		int numIdx=1;
		System.out.println("=== 랜덤 숫자 야구 게임 ===");
		bg.makeAnswer();
		while(true) {
			System.out.println("<"+tryCnt+"번째 시도>");

			for(int i=1;i<4;i++) {
				System.out.print("추측하는 "+i+"번째 숫자를 입력 : ");
				bg.inputAnswer(sc.nextLine());
			}
			
			bg.checkAnswer();
			if(bg.showResult()) {
				System.out.println("시도 횟수 : "+tryCnt);
				break;
			}
			
			tryCnt++;
		}
	}
}

class BaseballGame {
	String answer[];
	String input[]=new String[3];
	String cntName[]= {"", "원", "투", "쓰리"};
	int idx=0;
	int strike=0;
	int ball=0;
			
	public void makeAnswer() {
		Random r=new Random();
		int tmp=r.nextInt(900)+100;
		answer=String.valueOf(tmp).split("");
		System.out.println("문제가 생성되었습니다.\n"+answer[0]+answer[1]+answer[2]);
	}

	public void inputAnswer(String num) {
		input[idx++]=num;
	}

	public void checkAnswer() {
		strike=0;
		ball=0;
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<answer.length;j++) {
				if(i==j) {
					if(input[i].equals(answer[j])) {
						strike++;
					}
				} else {
					if(input[i].equals(answer[j])) {
						ball++;
					}
				}
			}
		}
		
		idx=0;
	}
	
	public boolean showResult() {
		if(strike==3) {
			System.out.println("아웃");
			System.out.println("정답입니다.");
			return true;
		} else {
			if(strike>0) {
				System.out.println("\n"+cntName[strike]+"스트라이크 ");
			}
			if(ball>0) {
				System.out.println(cntName[ball]+"볼");
			}
			return false;
		}
	}
}