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
		System.out.println("=== 좌석 예약 프로그램 ===");
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
		System.out.println("프로그램을 종료합니다.");
		isRun=false;
	}
	
	void info() {
		System.out.println("1. 영화관 선택");
		System.out.println("2. 좌석 예약");
		System.out.println("3. 좌석 확인");
		System.out.println("4. 종료");
		System.out.print("메뉴를 선택해주세요 : ");
	}
	
	void choiceTheater() {
		System.out.println("1.메가박스, 2.CGV, 3.롯데시네마");
		System.out.print("영화관을 선택해주세요. : ");
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
		System.out.print("좌석을 선택해주세요.(A-C,1-5) : ");
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
			System.out.println("이미 예약된 자리입니다.");
		} else {
			isArrSeat[irow][col] = true;
			System.out.println(row+"열 "+col+"번으로 예약 되었습니다.");
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
		System.out.println("환영합니다. 메가박스입니다.");
	}
}

class CGV extends Theater {
	void printWelcome() {
		System.out.println("환영합니다. CGV입니다..");
	}
}

class Lottecinema extends Theater {
	void printWelcome() {
		System.out.println("환영합니다. 롯데시네마입니다.");
	}
}