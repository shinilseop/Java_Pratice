package Weeks_8;

import java.util.Scanner;

public class Number_1_CompareBoxVolumn {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Box b1,b2;

		System.out.println("ù ��° �ڽ��� ����, ����, ���̸� �Է��ϼ���. (����� ����)");
		String num[]=sc.nextLine().split(" ");
		b1=new Box(Integer.parseInt(num[0]),Integer.parseInt(num[1]),Integer.parseInt(num[2]));
		
		System.out.println("�� ��° �ڽ��� ����, ����, ���̸� �Է��ϼ���. (����� ����)");
		num=sc.nextLine().split(" ");
		b2=new Box(Integer.parseInt(num[0]),Integer.parseInt(num[1]),Integer.parseInt(num[2]));
		
		if(b1.getVolumn()>b2.getVolumn()) {
			System.out.println(b2.getName()+"�� "+b1.getName()+"���� ���ǰ� �۴�.");
		} else {
			System.out.println(b1.getName()+"�� "+b2.getName()+"���� ���ǰ� �۴�.");
		}
	}
}

class Box {
	int width,vertical,height;
	int volumn;
	
	Box(int width, int vertical, int height) {
		this.width=width;
		this.vertical=vertical;
		this.height=height;
		volumn=width*vertical*height;
	}
	
	int getVolumn() {
		return volumn;
	}
	
	String getName() {
		return "Box ["+width+" x "+vertical+" x "+height+"]";
	}
}