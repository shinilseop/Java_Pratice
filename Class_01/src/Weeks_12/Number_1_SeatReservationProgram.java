package Weeks_12;

import java.util.Scanner;

public class Number_1_SeatReservationProgram {
	public static void main(String args[]) {
		new ReservationSeat().programStart();
	}
}

class ReservationSeat {
	boolean isRun;
	Theater theater;
	Scanner sc;
	
	ReservationSeat(){
		System.out.println("=== �¼� ���� ���α׷� ===");
		sc=new Scanner(System.in);
		isRun=true;
	}

	void programStart() {
		while(isRun) {
			info();
			int menu=sc.nextInt();
			if(menu==1) {
				choiceTheater();
			} else if(menu==2) {
				theater.printWelcome();
				reserve();
			} else if(menu==3) {
				theater.checkSeat();
			} else if(menu==4) {
				programEnd();
			}
		}
	}

	void programEnd() {
		System.out.println("���α׷��� �����մϴ�.");
		isRun=false;
	}
	
	void info() {
		System.out.println("1. ��ȭ�� ����");
		System.out.println("2. �¼� ����");
		System.out.println("3. �¼� Ȯ��");
		System.out.println("4. ����");
		System.out.print("�޴��� �������ּ��� : ");
	}
	
	void choiceTheater() {
		System.out.println("1.�ް��ڽ�, 2.CGV, 3.�Ե��ó׸�");
		System.out.print("��ȭ���� �������ּ���. : ");
		int menu=sc.nextInt();
		if(menu==1) {
			theater=new Megabox();
		} else if(menu==2) {
			theater=new CGV();
		} else if(menu==3) {
			theater=new Lottecinema();
		}
	}
	
	void reserve() {
		System.out.print("�¼��� �������ּ���.(A-C,1-5) : ");
		sc.nextLine();
		String[] seat=sc.nextLine().split(",");
		theater.reserveSeat(seat[0].charAt(0), Integer.parseInt(seat[1])-1);
	}
}

abstract class Theater {
	char chRow;
	int iCol;
	char rowNames[] = { 'A', 'B', 'C' };
	boolean[][] isArrSeat = new boolean[3][5];

	void printWelcome() {
		System.out.println("welcome");
	}

	void reserveSeat(char row, int col) {
		int irow = row - 65;
		if (isArrSeat[irow][col]) {
			System.out.println("�̹� ����� �ڸ��Դϴ�.");
		} else {
			isArrSeat[irow][col] = true;
			System.out.println(row+"�� "+col+"������ ���� �Ǿ����ϴ�.");
		}
	}

	void checkSeat() {
		System.out.println("  1 2 3 4 5");
		for (int i = 0; i < isArrSeat.length; i++) {
			System.out.print(rowNames[i]);
			for (int j = 0; j < isArrSeat[0].length; j++) {
				if (isArrSeat[i][j])
					System.out.print(" 1");
				else
					System.out.print(" 0");
			}
			System.out.println();
		}
	}
}

class Megabox extends Theater {
	void printWelcome() {
		System.out.println("ȯ���մϴ�. �ް��ڽ��Դϴ�.");
	}
}

class CGV extends Theater {
	void printWelcome() {
		System.out.println("ȯ���մϴ�. CGV�Դϴ�..");
	}
}

class Lottecinema extends Theater {
	void printWelcome() {
		System.out.println("ȯ���մϴ�. �Ե��ó׸��Դϴ�.");
	}
}