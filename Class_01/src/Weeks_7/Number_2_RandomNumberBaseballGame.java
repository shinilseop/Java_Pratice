package Weeks_7;

import java.util.Random;
import java.util.Scanner;

public class Number_2_RandomNumberBaseballGame {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		BaseballGame bg=new BaseballGame();
		
		int tryCnt=1;
		int numIdx=1;
		System.out.println("=== ���� ���� �߱� ���� ===");
		bg.makeAnswer();
		while(true) {
			System.out.println("<"+tryCnt+"��° �õ�>");

			for(int i=1;i<4;i++) {
				System.out.print("�����ϴ� "+i+"��° ���ڸ� �Է� : ");
				bg.inputAnswer(sc.nextLine());
			}
			
			bg.checkAnswer();
			if(bg.showResult()) {
				System.out.println("�õ� Ƚ�� : "+tryCnt);
				break;
			}
			
			tryCnt++;
		}
	}
}

class BaseballGame {
	String answer[];
	String input[]=new String[3];
	String cntName[]= {"", "��", "��", "����"};
	int idx=0;
	int strike=0;
	int ball=0;
			
	public void makeAnswer() {
		Random r=new Random();
		int tmp=r.nextInt(900)+100;
		answer=String.valueOf(tmp).split("");
		System.out.println("������ �����Ǿ����ϴ�.\n"+answer[0]+answer[1]+answer[2]);
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
			System.out.println("�ƿ�");
			System.out.println("�����Դϴ�.");
			return true;
		} else {
			if(strike>0) {
				System.out.println("\n"+cntName[strike]+"��Ʈ����ũ ");
			}
			if(ball>0) {
				System.out.println(cntName[ball]+"��");
			}
			return false;
		}
	}
}