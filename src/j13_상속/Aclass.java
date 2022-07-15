package j13_상속;

import java.util.Scanner;

public class Aclass {
	private String str; //상속을 받더라도 private가 걸린 변수는 항상 그 클래스에서만 사용할 수 있다.
	private int number;
	private Scanner scanner;

	public Aclass() {
		System.out.println("A 생성");
		str = "김준일";
		number = 1000;
		scanner = new Scanner(System.in);
	}
	
	public String inputString() {
		System.out.print("문자열 입력 : ");
		return scanner.nextLine();
	}
	
	public void printInfo() {
		System.out.println("str = " + str);
		System.out.println("number = " + number);
	}
}
