package Weeks_9;

public class Number_1_GeneratorOverLoading {
	public static void main(String args[]) {
		TV lgTV=new TV();
		TV samsungTV=new TV(32, "White");
		TV miTV=new TV(65, "Black", "Xiaomi");
		
		lgTV.describe();
		samsungTV.describe();
		miTV.describe();
		
	}
}

class TV {
	String inch,color,maker;
	
	TV(){
		inch="24";
		color="Black";
		maker="LG";
	}
	TV(int inch, String color){
		this.inch=String.valueOf(inch);
		this.color=color;
		maker="SAMSUNG";
	}
	TV(int inch, String color, String maker){
		this.inch=String.valueOf(inch);
		this.color=color;
		this.maker=maker;
	}
	
	void describe() {
		System.out.println("=== TV ��ü ���� ===");
		System.out.println("ũ �� : "+inch);
		System.out.println("�� �� : "+color);
		System.out.println("������ : "+maker);
		System.out.println("================");
	}
}